/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice.dialog.Invoice_Payment.InvoicePayment;
import com.sv.visionplus.transaction.invoice.model.InvoiceMix;
import com.sv.visionplus.transaction.invoice.model.TInvoice;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohan
 */
public class InvoiceService extends AbstractTransactionFormService<InvoiceMix> {

    @Override
    protected InvoiceMix select(Integer indexNo) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void save(InvoiceMix invoiceMix) throws VPException {

        
        InvoicePayment payment = new InvoicePayment(null, true);
        payment.setValue(invoiceMix);
        payment.setModal(true);
        payment.setVisible(true);
        
        
        
        

    }

    @Override
    protected void update(InvoiceMix object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(InvoiceMix object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
