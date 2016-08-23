/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import visionplusx.controller.UserDAO;
import visionplusx.controller.UserService;
import visionplusx.model.MUser;

//XXX:NIDUARA
public class Login extends javax.swing.JDialog {

    private static Login instance;

    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }

        return instance;
    }

    private Login() {
        super();

        initComponents();

        initOthers();
    }

    public MUser attemptLogin() {
        setVisible(true);
        
//      MUser user = new MUser(WIDTH, null, null, null, null);
//      return user;
    }

    private void validateLogin() {
        //TODO:read user form db and return if available
        
        this.user = new MUser();

        if (this.user != null) {
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login failed, please try again.", "Login", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void discardLogin() {
        this.user = null;

        dispose();
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        setModal(true);

        //TODO:login and cancel button actions
        //validateLogin -> login button
        //discard -> discard button
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        PasswordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("User Name ");

        jLabel2.setText("Password");

        loginButton.setText("login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordText))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(loginButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       String userName=userNameText.getText();
       String password=PasswordText.getText();
       
        try {
           MUser user = UserDAO.getInstance().checkUser(userName, password);
           if(user!=null){
               //TODO
           }else{
               //TODO
           }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
    private MUser user;
}
