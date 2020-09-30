/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import controller.LoginController;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.DAO.Database;

/**
 *
 * @author Marina Savitzki
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        controller = new LoginController(this);
        Database.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconUser = new javax.swing.JLabel();
        esqueciMinhaSenha = new javax.swing.JLabel();
        user_txt = new javax.swing.JLabel();
        pw_txt = new javax.swing.JLabel();
        login_txt = new javax.swing.JLabel();
        passwdInput = new javax.swing.JPasswordField();
        userInput = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        entrar_bt = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(null);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login.this.mouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_100px.png"))); // NOI18N
        getContentPane().add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 400, 90));

        esqueciMinhaSenha.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        esqueciMinhaSenha.setForeground(new java.awt.Color(51, 51, 51));
        esqueciMinhaSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esqueciMinhaSenha.setText("Esqueci minha senha");
        esqueciMinhaSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esqueciMinhaSenhaMouseClicked(evt);
            }
        });
        getContentPane().add(esqueciMinhaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, -1));

        user_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        user_txt.setForeground(new java.awt.Color(51, 51, 51));
        user_txt.setText("Usuário");
        getContentPane().add(user_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 320, 30));

        pw_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        pw_txt.setForeground(new java.awt.Color(51, 51, 51));
        pw_txt.setText("Senha");
        getContentPane().add(pw_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 320, 30));

        login_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 35)); // NOI18N
        login_txt.setForeground(new java.awt.Color(51, 51, 51));
        login_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_txt.setText("Login");
        getContentPane().add(login_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 400, -1));

        passwdInput.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        passwdInput.setForeground(new java.awt.Color(102, 102, 102));
        passwdInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        getContentPane().add(passwdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 320, 50));

        userInput.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        userInput.setForeground(new java.awt.Color(102, 102, 102));
        userInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });
        getContentPane().add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 320, 50));

        cancelButton.setBackground(new java.awt.Color(237, 237, 237));
        cancelButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(51, 51, 51));
        cancelButton.setText("Cancelar");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login.this.mouseExited(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 180, 40));

        entrar_bt.setBackground(new java.awt.Color(237, 237, 237));
        entrar_bt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        entrar_bt.setForeground(new java.awt.Color(51, 51, 51));
        entrar_bt.setText("Entrar");
        entrar_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        entrar_bt.setPreferredSize(new java.awt.Dimension(135, 37));
        entrar_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login.this.mouseExited(evt);
            }
        });
        entrar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_btActionPerformed(evt);
            }
        });
        getContentPane().add(entrar_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 180, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgLogin800x600.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputActionPerformed

    private void entrar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar_btActionPerformed
        controller.logIN();

    }//GEN-LAST:event_entrar_btActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
//        JOptionPane.showConfirmDialog(null, "Deseja cancelar?");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void esqueciMinhaSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esqueciMinhaSenhaMouseClicked
        /**
         * recuperar a senha
         * 
         */
    }//GEN-LAST:event_esqueciMinhaSenhaMouseClicked

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
        controller.buttonsColorEntered(evt);
    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
        controller.buttonColorExited(evt);
    }//GEN-LAST:event_mouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /**
         * try { for (javax.swing.UIManager.LookAndFeelInfo info :
         * javax.swing.UIManager.getInstalledLookAndFeels()) { if
         * ("".equals(info.getName())) {
         * javax.swing.UIManager.setLookAndFeel(info.getClassName()); break; } }
         * } catch (ClassNotFoundException | InstantiationException |
         * IllegalAccessException | javax.swing.UnsupportedLookAndFeelException
         * ex) {
         * java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
         * null, ex); }
         */
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public JButton getEntrar_bt() {
        return entrar_bt;
    }

    public void setEntrar_bt(JButton entrar_bt) {
        this.entrar_bt = entrar_bt;
    }

    public JPasswordField getPasswdInput() {
        return passwdInput;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

    public void setPasswdInput(JPasswordField passwdInput) {
        this.passwdInput = passwdInput;
    }

    public JTextField getUserInput() {
        return userInput;
    }

    public void setUserInput(JTextField userInput) {
        this.userInput = userInput;
    }

    public void message(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton entrar_bt;
    private javax.swing.JLabel esqueciMinhaSenha;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel login_txt;
    private javax.swing.JPasswordField passwdInput;
    private javax.swing.JLabel pw_txt;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel user_txt;
    // End of variables declaration//GEN-END:variables
}
