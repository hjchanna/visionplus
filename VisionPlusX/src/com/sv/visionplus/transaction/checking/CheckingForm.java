/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.checking;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.checking.model.InvoiceMix;
import com.sv.visionplus.transaction.checking.model.TInvoice;

/**
 *
 * @author KAZA
 */
public class CheckingForm extends AbstractTransactionForm<TInvoice>{

    @Override
    protected AbstractTransactionFormService<TInvoice> getTransactionFormService() {
        return new CheckingService();
    }

    @Override
    protected AbstractObjectCreator<TInvoice> getObjectCreator() {
        return new PCChecking(this);
    }
    
}
