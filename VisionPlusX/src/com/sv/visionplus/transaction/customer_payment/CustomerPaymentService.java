/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.util.payment.model.TPayment;

/**
 *
 * @author KAZA
 */
public class CustomerPaymentService extends AbstractTransactionFormService<TPayment> {

    @Override
    protected TPayment select(Integer indexNo) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void save(TPayment object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void update(TPayment object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(TPayment object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
