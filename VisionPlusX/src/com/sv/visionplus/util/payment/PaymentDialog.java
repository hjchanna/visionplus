package com.sv.visionplus.util.payment;

import com.sv.visionplus.util.payment.model.TPayment;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Mohan
 */
//XXX:KASUN
public class PaymentDialog extends javax.swing.JDialog {
    //TODO: singleton instance of payment dialog

    private PaymentDialog() {
        super();

        initComponents();

        initOthers();
    }

    public TPayment getPayment(Double totalAmount) {
        this.totalAmount = totalAmount;

        //show dialog
        //parse payment object
        //return payment object
    }

    private void validatePayment() {
        this.payment = new TPayment();
        //TODO:set other fields, payment information
    }

    private void discardPayment() {
        this.payment = null;

        dispose();
    }

    @SuppressWarnings("unchecked")
    private void initOthers() {
        setModal(true);

        //validation of payment
        FocusListener focusListener = new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                validatePayment();
            }
        };
        //TODO:set focus listener to input components

        //TODO:button actions
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private Double totalAmount;
    private TPayment payment;
}
