/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.account.payment_voucher;

import com.sv.visionplus.account.payment_voucher.model.TAccountTransaction;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;

/**
 *
 * @author KAZA
 */
public class PaymentVoucherService extends AbstractTransactionFormService<TAccountTransaction>{

    @Override
    protected TAccountTransaction select(Integer indexNo) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void save(TAccountTransaction object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void update(TAccountTransaction object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void delete(TAccountTransaction object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
