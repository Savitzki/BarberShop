/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UserController;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author Marina Savitzki
 */
public class UserList extends javax.swing.JDialog {

    private final UserController controller;

    /**
     * Creates new form UserList
     * @param parent
     * @param modal
     */
    public UserList(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.controller = new UserController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        newUserButton = new javax.swing.JButton();
        listUsers = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuarios");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateUserButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        updateUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-alterar-24.png"))); // NOI18N
        updateUserButton.setText("Alterar");
        updateUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(updateUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 200, 50));

        deleteUserButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        deleteUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-excluir-24 (2).png"))); // NOI18N
        deleteUserButton.setText("Excluir");
        deleteUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(deleteUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 200, 50));

        newUserButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        newUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-soma-24.png"))); // NOI18N
        newUserButton.setText("Novo");
        newUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 200, 50));

        jTable1.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuário", "Nível de acesso", "Data cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listUsers.setViewportView(jTable1);

        getContentPane().add(listUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 1020, 480));

        title.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setText("Usuários cadastrados");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 1030, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo base.png"))); // NOI18N
        bg.setMaximumSize(null);
        bg.setMinimumSize(null);
        bg.setPreferredSize(null);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_newUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserList dialog = new UserList(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane listUsers;
    private javax.swing.JButton newUserButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateUserButton;
    // End of variables declaration//GEN-END:variables

    public JButton getDeleteUserButton() {
        return deleteUserButton;
    }

    public void setDeleteUserButton(JButton deleteUserButton) {
        this.deleteUserButton = deleteUserButton;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JButton getNewUserButton() {
        return newUserButton;
    }

    public void setNewUserButton(JButton newUserButton) {
        this.newUserButton = newUserButton;
    }

    public JButton getUpdateUserButton() {
        return updateUserButton;
    }

    public void setUpdateUserButton(JButton updateUserButton) {
        this.updateUserButton = updateUserButton;
    }

    
}
