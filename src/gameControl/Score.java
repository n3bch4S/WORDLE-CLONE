package gameControl;

import java.io.*;
import java.util.Scanner;

public class Score {

    private int totalPlay;
    private int[] totalWin = new int[9];
    private int totalLose;
    private int maxStreak;
    private int currentStreak;
    private File scoreFile;

    public Score() {
        scoreFile = new File("save\\scoreBoard.dat");
        try {
            if (!scoreFile.exists()) {
                totalPlay = 0;
                totalLose = 0;
                maxStreak = 0;
                currentStreak = 0;
                save();
                /*try (RandomAccessFile file = new RandomAccessFile(scoreFile, "rw")) {
                    file.writeBytes("totalPlay: ");
                    System.out.println("int on: " + file.getFilePointer());
                    file.writeInt(totalPlay);
                    file.writeBytes("\ntotalLose: ");
                    System.out.println("int on: " + file.getFilePointer());
                    file.writeInt(totalLose);
                    file.writeBytes("\nmaxStreak: ");
                    System.out.println("int on: " + file.getFilePointer());
                    file.writeInt(maxStreak);
                    file.writeBytes("\ncurrentStreak: ");
                    System.out.println("int on: " + file.getFilePointer());
                    file.writeInt(currentStreak);
                    file.writeBytes("\ntotalWin: ");
                    for (int i = 0 ; i < totalWin.length ; i++) {
                        System.out.println("int on: " + file.getFilePointer());
                        file.writeInt(totalWin[i]);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }*/
            } else {
                try ( RandomAccessFile file = new RandomAccessFile(scoreFile, "rw")) {
                    file.seek(11);
                    totalPlay = file.readInt();
                    file.seek(27);
                    totalLose = file.readInt();
                    file.seek(43);
                    maxStreak = file.readInt();
                    file.seek(63);
                    currentStreak = file.readInt();
                    for (int i = 0; i < totalWin.length; i++) {
                        file.seek(i * 4 + 78);
                        totalWin[i] = file.readInt();
                    }
                    /*while (fileRead.hasNextLine()) {
                        String[] line = fileRead.nextLine().split(" ");
                        String thisIs = line[0];
                        String valueTxt = line[1];
                        switch (thisIs) {
                            case "totalPlay:" -> {
                                totalPlay = Integer.parseInt(valueTxt);
                            } case "totalLose:" -> {
                                totalLose = Integer.parseInt(valueTxt);
                            } case "maxStreak:" -> {
                                maxStreak = Integer.parseInt(valueTxt);
                            } case "currentStreak:" -> {
                                currentStreak = Integer.parseInt(valueTxt);
                            } case "totalWin:" -> {
                                String[] valueList = valueTxt.split("/");
                                for (int i = 0 ; i < valueList.length ; i++) {
                                    int win = Integer.parseInt(valueList[i]);
                                    totalWin[i] = win;
                                }
                            }
                        }
                    }*/
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void performWin(int attemp) {
        totalPlay++;
        totalWin[attemp]++;
        currentStreak++;
        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
        }
        save();
    }

    public void performLose() {
        totalPlay++;
        currentStreak = 0;
        totalLose++;
        save();
    }

    public void save() {
        scoreFile = new File("save\\scoreBoard.dat");
        try {
            if (!scoreFile.exists()) {
                scoreFile.createNewFile();
                try ( RandomAccessFile file = new RandomAccessFile(scoreFile, "rw")) {
                    file.writeBytes("totalPlay: ");
                    System.out.println("int on: " + file.getFilePointer());
                    file.writeInt(totalPlay);
                    file.writeBytes("\ntotalLose: ");
                    System.out.println("int on: " + file.getFilePointer());
                    file.writeInt(totalLose);
                    file.writeBytes("\nmaxStreak: ");
                    System.out.println("int on: " + file.getFilePointer());
                    file.writeInt(maxStreak);
                    file.writeBytes("\ncurrentStreak: ");
                    System.out.println("int on: " + file.getFilePointer());
                    file.writeInt(currentStreak);
                    file.writeBytes("\ntotalWin: ");
                    for (int i = 0; i < totalWin.length; i++) {
                        System.out.println("int on: " + file.getFilePointer());
                        file.writeInt(totalWin[i]);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {
                try ( RandomAccessFile file = new RandomAccessFile(scoreFile, "rw")) {
                    file.seek(11);
                    file.writeInt(totalPlay);
                    file.seek(27);
                    file.writeInt(totalLose);
                    file.seek(43);
                    file.writeInt(maxStreak);
                    file.seek(63);
                    file.writeInt(currentStreak);
                    for (int i = 0; i < totalWin.length; i++) {
                        file.seek(i * 4 + 78);
                        file.writeInt(totalWin[i]);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void reset() {
        totalPlay = 0;
        totalWin = new int[9];
        totalLose = 0;
        maxStreak = 0;
        currentStreak = 0;
        save();
    }

    public int getTotalPlay() {
        return totalPlay;
    }

    public int getWinRate() {
        double sumWin = totalPlay - totalLose;
        return (int) (sumWin / totalPlay * 100);
    }

    public int getCurrentStreak() {
        return currentStreak;
    }

    public int getMaxStreak() {
        return maxStreak;
    }

    public int getTryWin(int index) {
        return totalWin[index];
    }

    public int[] getTotalWin() {
        return totalWin;
    }

    public int getMostTry() {
        int most = 0;
        for (int i = 0; i < totalWin.length; i++) {
            if (totalWin[i] > most) {
                most = totalWin[i];
            }
        }
        return most;
    }

    public String toString() {
        String txt = "TotalPlay: " + totalPlay + "\n"
                + "TotalLose: " + totalLose + "\n"
                + "Max Streak: " + maxStreak + "\n"
                + "Current Streak: " + currentStreak + "\n"
                + "Total Win: ";
        for (int i = 0; i < totalWin.length; i++) {
            txt += totalWin[i];
            if (i + 1 < totalWin.length) {
                txt += "/";
            }
        }
        return txt;
    }
}
