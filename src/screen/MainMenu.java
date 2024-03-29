package screen;

import elementManager.*;
import java.util.*;
import javax.swing.*;
import systemManager.*;

public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MM
     */
    public MainMenu() {
        initComponents();
        initButton();
        setLocation(Screen.getStartPos(getWidth(), getHeight()));
        setVisible(true);
        ArrayList<String> w = WordsStorage.WORD1;
    }

    /*public MainMenu(Point startPoint) {
        initComponents();
        setLocation(startPoint);
        setVisible(true);
        ArrayList<String> w = WordsStorage.WORD1;
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headLine = new javax.swing.JPanel();
        wordle = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        newGame = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        fullPanel = new javax.swing.JPanel();
        fullLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wordle");
        setLocation(new java.awt.Point(720, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(480, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headLine.setBackground(new java.awt.Color(255, 255, 255));
        headLine.setOpaque(false);
        headLine.setPreferredSize(new java.awt.Dimension(480, 240));
        headLine.setLayout(new java.awt.GridBagLayout());

        wordle.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 48)); // NOI18N
        wordle.setForeground(new java.awt.Color(0, 0, 0));
        wordle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordle.setText("Wordle");
        wordle.setPreferredSize(new java.awt.Dimension(200, 80));
        headLine.add(wordle, new java.awt.GridBagConstraints());

        getContentPane().add(headLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setOpaque(false);
        menu.setPreferredSize(new java.awt.Dimension(480, 480));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setPreferredSize(new java.awt.Dimension(200, 50));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitMouseReleased(evt);
            }
        });
        menu.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        newGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGame.setPreferredSize(new java.awt.Dimension(200, 50));
        newGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newGameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newGameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newGameMouseReleased(evt);
            }
        });
        menu.add(newGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        version.setForeground(new java.awt.Color(208, 208, 208));
        version.setText("Version 1.1 by tada and khemz");
        menu.add(version, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, -1, -1));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        fullPanel.setBackground(new java.awt.Color(255, 255, 255));
        fullPanel.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        fullPanel.setOpaque(false);
        fullPanel.setPreferredSize(new java.awt.Dimension(480, 720));
        fullPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullLabel.setPreferredSize(new java.awt.Dimension(480, 720));
        fullPanel.add(fullLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(fullPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initButton() {
        newGame.setIcon(new ImageIcon("image\\button\\button0_new-game.png"));
        exit.setIcon(new ImageIcon("image\\button\\button0_exit.png"));
        fullLabel.setIcon(new ImageIcon("image\\background\\bg0_mainMenu.gif"));
    }

    private void newGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseEntered
        // TODO add your handling code here:
        newGame.setIcon(new ImageIcon("image\\button\\button-1_new-game.png"));
    }//GEN-LAST:event_newGameMouseEntered

    private void newGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseExited
        // TODO add your handling code here:
        newGame.setIcon(new ImageIcon("image\\button\\button0_new-game.png"));
    }//GEN-LAST:event_newGameMouseExited

    private void newGameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMousePressed
        // TODO add your handling code here:
        Sound.getSound("audio\\uiSound\\minecraftClick.wav").start();
        newGame.setIcon(new ImageIcon("image\\button\\button1_new-game.png"));
    }//GEN-LAST:event_newGameMousePressed

    private void newGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameMouseReleased
        // TODO add your handling code here:
        newGame.setIcon(new ImageIcon("image\\button\\button0_new-game.png"));
        ComponentInteract.performModeChoose(this, evt);
    }//GEN-LAST:event_newGameMouseReleased

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        exit.setIcon(new ImageIcon("image\\button\\button-1_exit.png"));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        exit.setIcon(new ImageIcon("image\\button\\button0_exit.png"));
    }//GEN-LAST:event_exitMouseExited

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        Sound.getSound("audio\\uiSound\\minecraftClick.wav").start();
        exit.setIcon(new ImageIcon("image\\button\\button1_exit.png"));
    }//GEN-LAST:event_exitMousePressed

    private void exitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseReleased
        // TODO add your handling code here:
        exit.setIcon(new ImageIcon("image\\button\\button0_exit.png"));
        ComponentInteract.performExit(this, evt);
    }//GEN-LAST:event_exitMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fullLabel;
    private javax.swing.JPanel fullPanel;
    private javax.swing.JPanel headLine;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel newGame;
    private javax.swing.JLabel version;
    private javax.swing.JLabel wordle;
    // End of variables declaration//GEN-END:variables
}
