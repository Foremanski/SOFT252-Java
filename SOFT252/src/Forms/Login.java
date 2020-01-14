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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        EnterUserPassword = new javax.swing.JTextField();
        lblUserPassword = new javax.swing.JLabel();
        EnterUserID = new javax.swing.JTextField();
        lblUserID = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        EnterUserPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterUserPasswordActionPerformed(evt);
            }
        });

        lblUserPassword.setText("Enter User Password");

        EnterUserID.setToolTipText("");
        EnterUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterUserIDActionPerformed(evt);
            }
        });

        lblUserID.setText("Enter User ID");

        lblLogin.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin)
                    .addComponent(EnterUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserID)
                    .addComponent(lblUserPassword)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnLogin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSignUp))
                        .addComponent(EnterUserPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin)
                .addGap(7, 7, 7)
                .addComponent(lblUserID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnSignUp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        
        Forms.PatientSignUp newMenu = new Forms.PatientSignUp();
            newMenu.setVisible(true);
            //this.setVisible(false);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        //reads the file
        FileFunctions.ReadFile fileReader = new FileFunctions.ReadFile();
        fileReader.OpenFile();
        fileReader.ScanFile();
        fileReader.CloseFile();

        String UserId = EnterUserID.getText();
        String UserPassword = EnterUserPassword.getText();

        //loop for each username in the array
        for(int i = 0; i < fileReader.userArray.size(); i++)
        {
            //get correct ID and password from file array
            String correctUserID = fileReader.userArray.get(i).getUserId();
            String correctUserPassword = fileReader.userArray.get(i).getUserPassword();
            
            //check if ID's match
            if(UserId.equals(correctUserID))
            {
                
                //check if password matches
                if(UserPassword.equals(correctUserPassword))
                {
                    //check role of user
                    
                    checkRole(correctUserID);
                }
            }
        }

        
    }//GEN-LAST:event_btnLoginActionPerformed
    
    public void checkRole(String UserID)
    {
        System.out.println("checkRole");
        //Strategy Pattern: seperate User into 4 different forms doing differnt functions
        //check if admin
        if(UserID.contains("A"))
        {
            System.out.println("admin");
            //send user to specific admin window                      
            Forms.AdminMenu newMenu = new Forms.AdminMenu();
            //show new window
            newMenu.setVisible(true);
            //set current window to false
            this.setVisible(false);           
        }
        else if(UserID.contains("P"))
        {
            System.out.println("patient");
            //send user to specific patient window
        }
        else if(UserID.contains("S"))
        {
            System.out.println("secretary");
            //send user to specific secretary window
        }
        else if(UserID.contains("D"))
        {
            System.out.println("doctor");
            //send user to specific doctor window
            Forms.DoctorMenu newMenu = new Forms.DoctorMenu();
            newMenu.setVisible(true);
            this.setVisible(false);
        }
        
        else
        {
          System.out.println("Invalid Tag, contact Admin");
        }
    }
    
    private void EnterUserPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterUserPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterUserPasswordActionPerformed

    private void EnterUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterUserIDActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnterUserID;
    private javax.swing.JTextField EnterUserPassword;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserPassword;
    // End of variables declaration//GEN-END:variables
}
