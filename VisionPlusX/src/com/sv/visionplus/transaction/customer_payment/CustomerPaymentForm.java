/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.customer_payment.model.TPayment;

/**
 *
 * @author KAZA
 */
public class CustomerPaymentForm extends AbstractTransactionForm<TPayment> {

    @Override
    protected AbstractTransactionFormService<TPayment> getTransactionFormService() {
//        return new CustomerPaymentService();
        return null;
    
    }

    @Override
    protected AbstractObjectCreator<TPayment> getObjectCreator() {
        return new PCCustomerPayment(this);
    }

   
}