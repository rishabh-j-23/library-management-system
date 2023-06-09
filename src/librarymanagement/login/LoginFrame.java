/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagement.login;

import librarymanagement.homepage.AdminPage;
import librarymanagement.homepage.HomepageFrame;

/**
 *
 * @author Rishabh
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        loginTitleLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        uidLable = new javax.swing.JLabel();
        uidTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Portal Login");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginTitleLabel.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        loginTitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/icons/library.png"))); // NOI18N
        loginTitleLabel.setText("Library Book Portal Login");
        getContentPane().add(loginTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 410, 94));

        passwordLabel.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 203, 86, 34));

        uidLable.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        uidLable.setText("UID");
        uidLable.setToolTipText("");
        getContentPane().add(uidLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 158, 86, 34));

        uidTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(uidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 158, 234, 30));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 203, 234, 34));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 275, -1, -1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uidTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String uid = uidTextField.getText();
        char[] passwordArray = passwordField.getPassword();
        String password = String.valueOf(passwordArray);        
        if (uid.equals("admin") && password.equals("admin")){
            new AdminPage().setVisible(true);
        } else if(uid.equals("rishabh") && password.equals("rishabh")){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomepageFrame().setVisible(true);
            }
        });
        }  
        uidTextField.setText("");
        passwordField.setText("");
        this.setVisible(false);
        
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginTitleLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel uidLable;
    private javax.swing.JTextField uidTextField;
    // End of variables declaration//GEN-END:variables
}
