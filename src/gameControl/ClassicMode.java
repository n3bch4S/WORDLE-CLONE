package gameControl;

import elementManager.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.sound.sampled.*;
import systemManager.*;

public class ClassicMode {

    private int attemp;
    private int charIndex;
    private int maxAttemp;
    private int maxCharIndex;
    private ArrayList<String> wordList;
    private String ans;
    private boolean done;
    private Score score;
    private JLabel[][] tiles;
    private JLabel[] keypad;
    private JLabel warning;
    private JLabel photoFrame;
    private JPanel statPanel;
    private ArrayList<Clip> sound = new ArrayList<Clip>();

    public ClassicMode(JLabel[][] tiles, JLabel[] keypad, JLabel warning, JLabel photoFrame, JPanel statPanel, Score score) {
        Random rnd = new Random();
        attemp = 0;
        charIndex = 0;
        maxAttemp = tiles.length;
        maxCharIndex = tiles[0].length;
        switch (maxCharIndex) {
            case 1 ->
                wordList = WordsStorage.WORD1;
            case 2 ->
                wordList = WordsStorage.WORD2;
            case 3 ->
                wordList = WordsStorage.WORD3;
            case 4 ->
                wordList = WordsStorage.WORD4;
            case 5 ->
                wordList = WordsStorage.WORD5;
            case 6 ->
                wordList = WordsStorage.WORD6;
            case 7 ->
                wordList = WordsStorage.WORD7;
            default ->
                wordList = WordsStorage.WORD8;
        }
        ans = wordList.get(rnd.nextInt(wordList.size()));
        done = false;
        this.tiles = tiles;
        this.keypad = keypad;
        this.warning = warning;
        this.photoFrame = photoFrame;
        this.statPanel = statPanel;
        this.score = score;
        loadAudio();
    }

    public String getWord() {
        return ans;
    }

    private void loadAudio() {
        sound.add(Sound.getSound("audio\\uiSound\\iphoneType.wav"));    //0
        sound.add(Sound.getSound("audio\\uiSound\\iphoneDel.wav"));     //1
        sound.add(Sound.getSound("audio\\uiSound\\iphoneSend.wav"));    //2
        sound.add(Sound.getSound("audio\\uiSound\\watDaDogDoin.wav"));  //3
        sound.add(Sound.getSound("audio\\uiSound\\vineBoom.wav"));      //4
        sound.add(Sound.getSound("audio\\uiSound\\minecraftClick.wav"));//5
        sound.add(Sound.getSound("audio\\uiSound\\bruh.wav"));          //6
        sound.add(Sound.getSound("audio\\uiSound\\yiLanMa.wav"));       //7
        sound.add(Sound.getSound("audio\\uiSound\\chineseGong.wav"));   //8
    }

    public void nextTile(String character) {
        if (charIndex < maxCharIndex && attemp < maxAttemp) {
            tiles[attemp][charIndex].setText(character.toUpperCase());
            sound.get(0).setMicrosecondPosition(0);
            sound.get(0).start();
            charIndex++;
        }
    }

    public void delTile() {
        if (charIndex > 0) {
            tiles[attemp][charIndex - 1].setText("");
            sound.get(1).setMicrosecondPosition(0);
            sound.get(1).start();
            charIndex--;
        }
    }

    public void checkTile() {
        String thisAns = "";

        for (JLabel tile : tiles[attemp]) {
            String chars = tile.getText();
            thisAns += chars;
        }
        //System.out.println("Your ans: " + thisAns);
        int[] tileStat = new int[maxCharIndex];
        if (wordList.contains(thisAns) && thisAns.length() == maxCharIndex) {
            tileStat = Tile.calTileStat(ans, tiles[attemp]);
            Tile.changeTileColor(tiles[attemp], tileStat);
            Tile.changeKeypadColor(tiles[attemp], tileStat, keypad);
            if (Tile.isAllTileGreen(tileStat)) {
                done = true;
            } else {
                sound.get(2).setMicrosecondPosition(0);
                sound.get(2).start();
                attemp++;
                charIndex = 0;
                if (attemp >= maxAttemp) {
                    done = true;
                }
            }
        } else if (thisAns.length() < maxCharIndex) {
            sound.get(3).setMicrosecondPosition(0);
            sound.get(3).start();
            warning.setText("Not enough letters");
            warning.setVisible(true);
        } else {
            sound.get(4).setMicrosecondPosition(0);
            sound.get(4).start();
            warning.setText("Not in word list");
            warning.setVisible(true);
        }

        if (done) {
            //System.out.println("done");
            statPanel.setVisible(true);
            photoFrame.setVisible(true);
            if (!Tile.isAllTileGreen(tileStat)) {
                sound.get(6).setMicrosecondPosition(0);
                sound.get(6).start();
                photoFrame.setIcon(new ImageIcon("image\\background\\bg100_bruh.gif"));
                score.performLose();
                warning.setText("Correct answer: " + ans);
                warning.setVisible(true);
            } else {
                sound.get(8).setMicrosecondPosition(0);
                sound.get(8).start();
                photoFrame.setIcon(new ImageIcon("image\\background\\bg100_theRockEye.gif"));
                score.performWin(attemp);
            }
        }

    }

    public boolean isDone() {
        return done;
    }

    public int getCharIndex() {
        return charIndex;
    }

    /*public boolean hasWord(JLabel[][] tiles) {
        String word = "";
        
        for (int i = 0; i < tiles[0].length; i++) {
            word += tiles[attemp][i].getText();
        }
        
        for (String wordFromStrge : words.getWords()) {
            if (word.equalsIgnoreCase(wordFromStrge)) return true;
        }
        
        return false;
    }*/
 /*public void reset(JLabel[][] tiles) {
    }*/
}
