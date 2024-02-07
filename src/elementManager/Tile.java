package elementManager;

import java.awt.*;
import javax.swing.*;

public abstract class Tile {

    public static int[] calTileStat(String trueWord, JLabel[] tiles) {
        int numOfTile = tiles.length;
        int[] tileStat = new int[numOfTile];
        String[] trueCharArr = trueWord.split("");

        for (int i = 0; i < numOfTile; i++) {
            String textOfTile = tiles[i].getText();
            String trueChar = trueCharArr[i];
            if (textOfTile.equalsIgnoreCase(trueChar)) {
                tileStat[i] = 1;
            } else if (trueWord.toUpperCase().contains(textOfTile)) {
                tileStat[i] = 0;
            } else {
                tileStat[i] = -1;
            }
        }

        return tileStat;
    }

    public static void changeTileColor(JLabel[] tiles, int[] tileStat) {
        int numOfTile = tiles.length;

        for (int i = 0; i < numOfTile; i++) {
            JLabel tile = tiles[i];
            int stat = tileStat[i];
            switch (stat) {
                case 1:
                    tile.setBackground(Color.GREEN);
                    tile.setOpaque(true);
                    break;
                case 0:
                    tile.setBackground(Color.YELLOW);
                    tile.setOpaque(true);
                    break;
                case -1:
                    tile.setBackground(Color.GRAY);
                    tile.setOpaque(true);
                    break;
            }
        }

    }

    public static boolean isAllTileGreen(int[] tileStat) {
        int cnt = 0;

        for (int i = 0; i < tileStat.length; i++) {
            if (tileStat[i] == 1) {
                cnt++;
            }
        }

        return cnt == tileStat.length;
    }

    public static void changeKeypadColor(JLabel[] tiles, int[] tileStat, JLabel[] keypad) {
        for (int i = 0; i < tiles.length; i++) {
            int status = tileStat[i];
            String tileText = tiles[i].getText();
            JLabel key = getKeyLabel(keypad, tileText);
            Color keyColor = key.getBackground();
            if (status == -1 && keyColor.equals(new Color(204, 204, 204))) {
                key.setBackground(Color.GRAY);
            } else if (status == 0 && (keyColor.equals(new Color(204, 204, 204)) || keyColor.equals(Color.GRAY))) {
                key.setBackground(Color.YELLOW);
            } else if (status == 1 && (keyColor.equals(new Color(204, 204, 204)) || keyColor.equals(Color.GRAY) || keyColor.equals(Color.YELLOW))) {
                key.setBackground(Color.GREEN);
            }
        }
    }

    public static JLabel getKeyLabel(JLabel[] keypad, String key) {
        for (JLabel oneKey : keypad) {
            if (oneKey.getText().equalsIgnoreCase(key)) {
                return oneKey;
            }
        }
        return null;
    }

}
