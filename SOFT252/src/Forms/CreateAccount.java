/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author dforeman
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAdminAccount
     */
    public CreateAccount() {
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

        txtEnterName = new javax.swing.JTextField();
        lblEnterAdminName = new javax.swing.JLabel();
        lblCreateNewAdminAccount = new javax.swing.JLabel();
        txtEnterAddress = new javax.swing.JTextField();
        lblEnterAdminAddress = new javax.swing.JLabel();
        lblEnterAdminID = new javax.swing.JLabel();
        txtEnterID = new javax.swing.JTextField();
        txtEnterPassword = new javax.swing.JTextField();
        lblEnterAdminPassword = new javax.swing.JLabel();
        btnEnterAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEnterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterNameActionPerformed(evt);
            }
        });

        lblEnterAdminName.setText("Enter User Name");

        lblCreateNewAdminAccount.setText("Create New User Account");

        txtEnterAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterAddressActionPerformed(evt);
            }
        });

        lblEnterAdminAddress.setText("Enter User Address");

        lblEnterAdminID.setText("Enter User ID");

        txtEnterID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterIDActionPerformed(evt);
            }
        });

        txtEnterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterPasswordActionPerformed(evt);
            }
        });

        lblEnterAdminPassword.setText("Enter User Password");

        btnEnterAccount.setText("Enter New Account");
        btnEnterAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEnterName)
                                .addComponent(lblEnterAdminName)
                                .addComponent(lblCreateNewAdminAccount)
                                .addComponent(txtEnterAddress)
                                .addComponent(lblEnterAdminAddress)
                                .addComponent(lblEnterAdminID)
                                .addComponent(txtEnterID)
                                .addComponent(txtEnterPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                            .addComponent(lblEnterAdminPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnEnterAccount)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCreateNewAdminAccount)
                .addGap(18, 18, 18)
                .addComponent(lblEnterAdminID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnterAdminPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEnterAdminName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEnterAdminAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnterAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnterAccount)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterIDActionPerformed

    private void txtEnterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterPasswordActionPerformed

    private void txtEnterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterNameActionPerformed

    private void txtEnterAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterAddressActionPerformed

    private void btnEnterAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterAccountActionPerformed
        // TODO add your handling code here:
        
        ProcessAccount();
        
        Forms.AdminMenu returnToMenu = new Forms.AdminMenu();
        returnToMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEnterAccountActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }
    
    public void ProcessAccount()
    {               
        String newUserID = txtEnterID.getText();
        String newUserPassword = txtEnterPassword.getText();
        String newUserName = txtEnterName.getText();
        String newUserAddress = txtEnterAddress.getText();
        
        //check for valid ID starter
        if((newUserID.contains("A")) ||(newUserID.contains("D")) || (newUserID.contains("S")))
                {     
                      Classes.SystemUser newAccount = new Classes.SystemUser(newUserID, newUserPassword, newUserName, newUserAddress);
            
                      FileFunctions.AddAccount addNewAccount = new FileFunctions.AddAccount();
        
                      addNewAccount.AddAccount(newAccount);
                }
        //notify user of invalid ID
        else
        {
          System.out.println("bruh");  
        }
        //enter information into SystemUser Object
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterAccount;
    private javax.swing.JLabel lblCreateNewAdminAccount;
    private javax.swing.JLabel lblEnterAdminAddress;
    private javax.swing.JLabel lblEnterAdminID;
    private javax.swing.JLabel lblEnterAdminName;
    private javax.swing.JLabel lblEnterAdminPassword;
    private javax.swing.JTextField txtEnterAddress;
    private javax.swing.JTextField txtEnterID;
    private javax.swing.JTextField txtEnterName;
    private javax.swing.JTextField txtEnterPassword;
    // End of variables declaration//GEN-END:variables
}
