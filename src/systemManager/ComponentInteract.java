package systemManager;

import gameControl.ClassicMode;
import gameControl.Score;
import screen.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;

public abstract class ComponentInteract {

    public static void performMainMenu(JFrame frame, MouseEvent e) {
        if (isMouseInComp(e)) {
            new MainMenu().setLocation(frame.getLocation());
            frame.dispose();
        }
    }

    public static void performModeChoose(JFrame frame, MouseEvent e) {
        if (isMouseInComp(e)) {
            new ModeChoose().setLocation(frame.getLocation());
            frame.dispose();
        }
    }

    public static void performGameScreen(int numOfLet, int numOfAttemp, JFrame frame, MouseEvent e) {
        if (isMouseInComp(e)) {
            new GameScreen(numOfLet, numOfAttemp).setLocation(frame.getLocation());
            frame.dispose();
        }
    }

    public static void performNextTile(String key, MouseEvent e, ClassicMode mode) {
        if (isMouseInComp(e)) {
            mode.nextTile(key);
        }
    }

    public static void performCheckTile(MouseEvent e, ClassicMode mode) {
        if (isMouseInComp(e)) {
            mode.checkTile();
        }
    }

    public static void performDelTile(MouseEvent e, ClassicMode mode) {
        if (isMouseInComp(e)) {
            mode.delTile();
        }
    }

    public static void performStat(GameScreen frame, JPanel panel, MouseEvent e) {
        if (isMouseInComp(e)) {
            if (panel.isVisible()) {
                panel.setVisible(false);
            } else {
                panel.setVisible(true);
                frame.updateScore();
            }
        }
    }

    public static void performCloseStat(JPanel panel, MouseEvent e) {
        if (isMouseInComp(e)) {
            panel.setVisible(false);
        }
    }

    public static void performConfirm(JPanel panel, MouseEvent e) {
        if (isMouseInComp(e)) {
            panel.setVisible(true);
        }
    }

    public static void performCloseConfirm(JPanel panel, MouseEvent e) {
        if (isMouseInComp(e)) {
            panel.setVisible(false);
        }
    }

    public static void performResetScore(GameScreen frame, JPanel panel, Score score, MouseEvent e) {
        if (isMouseInComp(e)) {
            score.reset();
            frame.updateScore();
            panel.setVisible(false);
        }
    }

    public static void performExit(JFrame frame, MouseEvent e) {
        if (isMouseInComp(e)) {
            frame.dispose();
        }
    }

    public static void performSelfClose(JComponent self, MouseEvent e) {
        if (isMouseInComp(e)) {
            self.setVisible(false);
        }
    }

    public static void performCheat(JLabel label, ClassicMode mode, MouseEvent e) {
        if (isMouseInComp(e)) {
            label.setText("--> " + mode.getWord() + " <--");
            label.setVisible(true);
        }
    }

    public static boolean isMouseInComp(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();
        //System.out.println(x + "," + y);
        Component comp = e.getComponent();
        Rectangle r = comp.getBounds();
        double rW = r.getWidth();
        double rH = r.getHeight();
        //System.out.println(rW + "," + rH);

        boolean isXIn = x > 0 && x < rW;
        //System.out.println(isXIn);
        boolean isYIn = y > 0 && y < rH;
        //System.out.println(isYIn);
        //System.out.println(isXIn && isYIn);
        return isXIn && isYIn;
    }
}
