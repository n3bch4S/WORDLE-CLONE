package elementManager;

import java.io.*;
import java.net.*;
import java.util.*;

public abstract class WordsStorage {

    public static final ArrayList<String> WORD1 = getWord(1);
    public static final ArrayList<String> WORD2 = getWord(2);
    public static final ArrayList<String> WORD3 = getWord(3);
    public static final ArrayList<String> WORD4 = getWord(4);
    public static final ArrayList<String> WORD5 = getWord(5);
    public static final ArrayList<String> WORD6 = getWord(6);
    public static final ArrayList<String> WORD7 = getWord(7);
    public static final ArrayList<String> WORD8 = getWord(8);

    //private ArrayList<String> words = new ArrayList<String>();
    public static ArrayList<String> getWord(int numOfLetters) {
        System.out.println("Loading " + numOfLetters + " letters word...");
        ArrayList<String> wordList = new ArrayList<String>();
        if (numOfLetters == 1) {
            String charList = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < charList.length(); i++) {
                wordList.add(charList.substring(i, i + 1).toUpperCase());
            }
            System.out.println("Loading " + numOfLetters + " letters word successfully.");
            return wordList;
        }

        try ( Scanner fRead = new Scanner(new File("wordStorage\\" + numOfLetters + "letters.txt"))) {
            while (fRead.hasNextLine()) {
                wordList.add(fRead.nextLine().toUpperCase());
            }
            System.out.println("Loading " + numOfLetters + " letters word successfully.");
            return wordList;
        } catch (FileNotFoundException e) {
            System.out.println(e);
            createWordFile();
            return getWord(numOfLetters);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    
    public static boolean addWord(String word) {
        int wordLen = word.length();
        if (wordLen < 2 || wordLen > 8) {
            return false;
        }
        word = word.toUpperCase();
        ArrayList<String> wordList;
        switch (wordLen) {
            case 2 -> wordList = WORD2;
            case 3 -> wordList = WORD3;
            case 4 -> wordList = WORD4;
            case 5 -> wordList = WORD5;
            case 6 -> wordList = WORD6;
            case 7 -> wordList = WORD7;
            default -> wordList = WORD8;
        }
        if (isWord(word) && ! hasWord(word, wordList)) {
            String filePath = "wordStorage\\" + wordLen + "letters.txt";
            File wordFile = new File(filePath);
            
            try (FileWriter fWrite = new FileWriter(wordFile, true)) {
                fWrite.write(word + "\n");
            } catch (Exception e) {
                System.out.println(e);
            }
            return true;
        }
        return false;
    }
    
    public static boolean hasWord(String word, ArrayList<String> wordList) {
        return wordList.contains(word);
    }

    public static boolean isWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            String c = String.valueOf(word.charAt(i));
            if ("`~1!2@3#4$5%6^7&8*9(0)-_=+\\|]}[{;:'\"/?.>,<".contains(c)) {
                return false;
            }
        }
        return true;
    }

    public static void createWordFile() {
        for (int i = 2; i <= 8; i++) {
            String url;
            String homeTxt = "";
            switch (i) {
                case 2 -> {
                    url = "https://7esl.com/2-letter-words/";
                    homeTxt = "<li>";
                }
                case 3 ->
                    url = "https://raw.githubusercontent.com/hzlzh/Domain-Name-List/master/3-letter-words.txt";
                case 4 ->
                    url = "https://gist.githubusercontent.com/paulcc/3799331/raw/74207b4ee400469ddbb61d297dbd62f31a3407ce/gistfile1.txt";
                case 5 ->
                    url = "https://raw.githubusercontent.com/charlesreid1/five-letter-words/master/sgb-words.txt";
                case 6 -> {
                    url = "https://7esl.com/6-letter-words/";
                    homeTxt = "<li>";
                }
                case 7 ->
                    url = "https://raw.githubusercontent.com/powerlanguage/word-lists/master/common-7-letter-words.txt";
                default -> {
                    url = "https://7esl.com/8-letter-words/";
                    homeTxt = "<li>";
                }
            }
            if (homeTxt.length() > 0) {
                createLetFile(i, url, homeTxt);
            } else {
                createLetFile(i, url);
            }
        }
    }

    public static void createLetFile(int wordLen, String urlText, String homeTxt) {//<li>.....</li>
        final int HOME_LEN = homeTxt.length();
        final int END_LEN = HOME_LEN + 1;
        final int WORD_LEN = wordLen; //<---------------------edit here
        final int TOTAL_LEN = HOME_LEN + WORD_LEN + END_LEN;

        final int HOME_IDX = 0;
        final int WORD_IDX = HOME_LEN;
        final int END_IDX = HOME_LEN + WORD_LEN;

        String path = "wordStorage\\" + WORD_LEN + "letters.txt";
        String endTxt = homeTxt.substring(0, 1) + "/" + homeTxt.substring(1, homeTxt.length());
        File thatDat = new File(path);
        if (thatDat.exists()) {
            thatDat.delete();
        }

        try {
            System.out.println("Building " + path + "...");
            URL url = new URL(urlText); //<----edit here
            try ( Scanner webSc = new Scanner(url.openStream());  FileWriter fWrite = new FileWriter(thatDat)) {
                while (webSc.hasNextLine()) {
                    String line = webSc.nextLine().trim();
                    //System.out.println(line);
                    if (line.length() == TOTAL_LEN) {
                        String homeLine = line.substring(HOME_IDX, WORD_IDX);
                        String endLine = line.substring(END_IDX, TOTAL_LEN);
                        String wordLine = line.substring(WORD_IDX, END_IDX);
                        if (homeLine.equals(homeTxt) && endLine.equals(endTxt) && isWord(wordLine)) {
                            //System.out.println(line.substring(WORD_IDX, END_IDX));
                            fWrite.write(wordLine.toUpperCase() + "\n");
                        }
                    }
                }
                System.out.println("Building " + path + " sucessfully");
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void createLetFile(int wordLen, String urlText) {

        String path = "wordStorage\\" + wordLen + "letters.txt";
        File thatDat = new File(path);
        if (thatDat.exists()) {
            thatDat.delete();
        }

        try {
            System.out.println("Building " + path + "...");
            URL url = new URL(urlText); //<----edit here
            try ( Scanner webSc = new Scanner(url.openStream());  FileWriter fWrite = new FileWriter(thatDat)) {
                while (webSc.hasNextLine()) {
                    String line = webSc.nextLine().trim();
                    //System.out.println(line);
                    //System.out.println("----------");
                    if (line.length() == wordLen && isWord(line)) {
                        fWrite.write(line.toUpperCase() + "\n");
                    }
                }
                System.out.println("Building " + path + " sucessfully");
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
