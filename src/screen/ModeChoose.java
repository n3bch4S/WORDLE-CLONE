package screen;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import systemManager.ComponentInteract;
import systemManager.Sound;

/**
 *
 * @author gnar8
 */
public class ModeChoose extends javax.swing.JFrame {

    /**
     * Creates new form ModeChoose
     */
    public ModeChoose() {
        initComponents();
        initButton();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        middlePanel = new javax.swing.JPanel();
        sliderAttemp = new javax.swing.JSlider();
        attempNum = new javax.swing.JLabel();
        attemp = new javax.swing.JLabel();
        sliderLetters = new javax.swing.JSlider();
        lettersNum = new javax.swing.JLabel();
        letters = new javax.swing.JLabel();
        customMode = new javax.swing.JLabel();
        letterle = new javax.swing.JLabel();
        classicMode = new javax.swing.JLabel();
        footPanel = new javax.swing.JPanel();
        des280 = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        bg390 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wordle");
        setLocation(new java.awt.Point(720, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        middlePanel.setBackground(new java.awt.Color(255, 255, 255));
        middlePanel.setOpaque(false);
        middlePanel.setPreferredSize(new java.awt.Dimension(480, 390));
        middlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sliderAttemp.setMaximum(9);
        sliderAttemp.setMinimum(1);
        sliderAttemp.setToolTipText("");
        sliderAttemp.setValue(6);
        sliderAttemp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAttempStateChanged(evt);
            }
        });
        middlePanel.add(sliderAttemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        attempNum.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        attempNum.setForeground(new java.awt.Color(0, 0, 0));
        attempNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attempNum.setText("6");
        attempNum.setPreferredSize(new java.awt.Dimension(70, 20));
        middlePanel.add(attempNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        attemp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        attemp.setForeground(new java.awt.Color(0, 0, 0));
        attemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attemp.setText("Attemp");
        attemp.setPreferredSize(new java.awt.Dimension(70, 20));
        middlePanel.add(attemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        sliderLetters.setMaximum(8);
        sliderLetters.setMinimum(1);
        sliderLetters.setToolTipText("");
        sliderLetters.setValue(5);
        sliderLetters.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderLettersStateChanged(evt);
            }
        });
        middlePanel.add(sliderLetters, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        lettersNum.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lettersNum.setForeground(new java.awt.Color(0, 0, 0));
        lettersNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lettersNum.setText("5");
        lettersNum.setPreferredSize(new java.awt.Dimension(70, 20));
        middlePanel.add(lettersNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        letters.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        letters.setForeground(new java.awt.Color(0, 0, 0));
        letters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letters.setText("Letters");
        letters.setPreferredSize(new java.awt.Dimension(70, 20));
        middlePanel.add(letters, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        customMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customMode.setPreferredSize(new java.awt.Dimension(250, 50));
        customMode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customModeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customModeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customModeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                customModeMouseReleased(evt);
            }
        });
        middlePanel.add(customMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        letterle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letterle.setPreferredSize(new java.awt.Dimension(250, 50));
        letterle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                letterleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                letterleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letterleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                letterleMouseReleased(evt);
            }
        });
        middlePanel.add(letterle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        classicMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classicMode.setPreferredSize(new java.awt.Dimension(250, 50));
        classicMode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classicModeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classicModeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                classicModeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                classicModeMouseReleased(evt);
            }
        });
        middlePanel.add(classicMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        getContentPane().add(middlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        footPanel.setBackground(new java.awt.Color(255, 246, 208));
        footPanel.setPreferredSize(new java.awt.Dimension(480, 280));
        footPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        des280.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        des280.setPreferredSize(new java.awt.Dimension(480, 280));
        footPanel.add(des280, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(footPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

        topPanel.setBackground(new java.awt.Color(153, 153, 255));
        topPanel.setOpaque(false);
        topPanel.setPreferredSize(new java.awt.Dimension(480, 50));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setPreferredSize(new java.awt.Dimension(30, 30));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backMouseReleased(evt);
            }
        });
        topPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg390.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg390.setPreferredSize(new java.awt.Dimension(480, 440));
        getContentPane().add(bg390, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initButton() {
        classicMode.setIcon(new ImageIcon("image\\button\\button0_classicMode.png"));
        letterle.setIcon(new ImageIcon("image\\button\\button0_letterle.png"));
        customMode.setIcon(new ImageIcon("image\\button\\button0_customMode.png"));
        back.setIcon(new ImageIcon("image\\button\\button0_back.png"));
        des280.setIcon(new ImageIcon("image\\description\\des0_rule.png"));
        bg390.setIcon(new ImageIcon("image\\background\\bg440_gradientBG.gif"));
    }

    private void sliderLettersStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderLettersStateChanged
        // TODO add your handling code here:
        int value = sliderLetters.getValue();
        lettersNum.setText(String.valueOf(value));
    }//GEN-LAST:event_sliderLettersStateChanged

    private void sliderAttempStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAttempStateChanged
        // TODO add your handling code here:
        int value = sliderAttemp.getValue();
        attempNum.setText(String.valueOf(value));
    }//GEN-LAST:event_sliderAttempStateChanged

    private void classicModeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicModeMouseEntered
        // TODO add your handling code here:
        classicMode.setIcon(new ImageIcon("image\\button\\button-1_classicMode.png"));
        des280.setIcon(new ImageIcon("image\\description\\des0_classicRule.png"));
    }//GEN-LAST:event_classicModeMouseEntered

    private void classicModeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicModeMouseExited
        // TODO add your handling code here:
        classicMode.setIcon(new ImageIcon("image\\button\\button0_classicMode.png"));
        //des280.setIcon(new ImageIcon("image\\description\\des0_rule.png"));
    }//GEN-LAST:event_classicModeMouseExited

    private void classicModeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicModeMousePressed
        // TODO add your handling code here:
        Sound.getSound("audio\\uiSound\\minecraftClick.wav").start();
        classicMode.setIcon(new ImageIcon("image\\button\\button1_classicMode.png"));
    }//GEN-LAST:event_classicModeMousePressed

    private void classicModeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classicModeMouseReleased
        // TODO add your handling code here:
        classicMode.setIcon(new ImageIcon("image\\button\\button0_classicMode.png"));
        ComponentInteract.performGameScreen(5, 6, this, evt);
    }//GEN-LAST:event_classicModeMouseReleased

    private void letterleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letterleMouseEntered
        // TODO add your handling code here:
        letterle.setIcon(new ImageIcon("image\\button\\button-1_letterle.png"));
        des280.setIcon(new ImageIcon("image\\description\\des0_letterleRule.png"));
    }//GEN-LAST:event_letterleMouseEntered

    private void letterleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letterleMouseExited
        // TODO add your handling code here:
        letterle.setIcon(new ImageIcon("image\\button\\button0_letterle.png"));
        //des280.setIcon(new ImageIcon("image\\description\\des0_rule.png"));
    }//GEN-LAST:event_letterleMouseExited

    private void letterleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letterleMousePressed
        // TODO add your handling code here:
        Sound.getSound("audio\\uiSound\\minecraftClick.wav").start();
        letterle.setIcon(new ImageIcon("image\\button\\button1_letterle.png"));
    }//GEN-LAST:event_letterleMousePressed

    private void letterleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letterleMouseReleased
        // TODO add your handling code here:
        letterle.setIcon(new ImageIcon("image\\button\\button0_letterle.png"));
        ComponentInteract.performGameScreen(1, 1, this, evt);
    }//GEN-LAST:event_letterleMouseReleased

    private void customModeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customModeMouseEntered
        // TODO add your handling code here:
        customMode.setIcon(new ImageIcon("image\\button\\button-1_customMode.png"));
        des280.setIcon(new ImageIcon("image\\description\\des0_customRule.png"));
    }//GEN-LAST:event_customModeMouseEntered

    private void customModeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customModeMouseExited
        // TODO add your handling code here:
        customMode.setIcon(new ImageIcon("image\\button\\button0_customMode.png"));
    }//GEN-LAST:event_customModeMouseExited

    private void customModeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customModeMousePressed
        // TODO add your handling code here:
        Sound.getSound("audio\\uiSound\\minecraftClick.wav").start();
        customMode.setIcon(new ImageIcon("image\\button\\button1_customMode.png"));
    }//GEN-LAST:event_customModeMousePressed

    private void customModeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customModeMouseReleased
        // TODO add your handling code here:
        customMode.setIcon(new ImageIcon("image\\button\\button0_customMode.png"));
        int let = sliderLetters.getValue();
        int tries = sliderAttemp.getValue();
        ComponentInteract.performGameScreen(let, tries, this, evt);
    }//GEN-LAST:event_customModeMouseReleased

    private void backMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseReleased
        // TODO add your handling code here:
        Sound.getSound("audio\\uiSound\\minecraftClick.wav").start();
        ComponentInteract.performMainMenu(this, evt);
    }//GEN-LAST:event_backMouseReleased

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
            java.util.logging.Logger.getLogger(ModeChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeChoose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ModeChoose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attemp;
    private javax.swing.JLabel attempNum;
    private javax.swing.JLabel back;
    private javax.swing.JLabel bg390;
    private javax.swing.JLabel classicMode;
    private javax.swing.JLabel customMode;
    private javax.swing.JLabel des280;
    private javax.swing.JPanel footPanel;
    private javax.swing.JLabel letterle;
    private javax.swing.JLabel letters;
    private javax.swing.JLabel lettersNum;
    private javax.swing.JPanel middlePanel;
    private javax.swing.JSlider sliderAttemp;
    private javax.swing.JSlider sliderLetters;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
