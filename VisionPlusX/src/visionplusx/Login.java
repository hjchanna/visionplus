/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx;

import javax.swing.JOptionPane;
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

    }

    private void validateLogin() {
        //TODO:read user form db and return if available

        this.user =  ?;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private MUser user;
}
