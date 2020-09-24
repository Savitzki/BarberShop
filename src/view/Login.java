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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        esqueciMinhaSenha.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        esqueciMinhaSenha.setForeground(new java.awt.Color(204, 204, 204));
        esqueciMinhaSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esqueciMinhaSenha.setText("Esqueci minha senha");
        esqueciMinhaSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esqueciMinhaSenhaMouseClicked(evt);
            }
        });
        getContentPane().add(esqueciMinhaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, 140, -1));

        user_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        user_txt.setForeground(new java.awt.Color(204, 204, 204));
        user_txt.setText("Usuário");
        getContentPane().add(user_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 400, 30));

        pw_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 30)); // NOI18N
        pw_txt.setForeground(new java.awt.Color(204, 204, 204));
        pw_txt.setText("Senha");
        getContentPane().add(pw_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 400, 30));

        login_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 40)); // NOI18N
        login_txt.setForeground(new java.awt.Color(204, 204, 204));
        login_txt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        login_txt.setText("Login");
        getContentPane().add(login_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 510, -1));

        passwdInput.setBackground(new java.awt.Color(242, 242, 242));
        passwdInput.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        getContentPane().add(passwdInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 520, 50));

        userInput.setBackground(new java.awt.Color(242, 242, 242));
        userInput.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });
        getContentPane().add(userInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 520, 50));

        cancelButton.setBackground(new java.awt.Color(204, 204, 204));
        cancelButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(51, 51, 51));
        cancelButton.setText("Cancelar");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 720, 250, 60));

        entrar_bt.setBackground(new java.awt.Color(153, 153, 255));
        entrar_bt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        entrar_bt.setForeground(new java.awt.Color(51, 51, 51));
        entrar_bt.setText("Entrar");
        entrar_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar_bt.setPreferredSize(new java.awt.Dimension(135, 37));
        entrar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_btActionPerformed(evt);
            }
        });
        getContentPane().add(entrar_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, 250, 60));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Prancheta 1.png"))); // NOI18N
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
    private javax.swing.JLabel login_txt;
    private javax.swing.JPasswordField passwdInput;
    private javax.swing.JLabel pw_txt;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel user_txt;
    // End of variables declaration//GEN-END:variables
}
