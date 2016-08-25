/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.base.AbstractObjectCreator;
import com.sv.visionplus.base.transaction.AbstractTransactionForm;
import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.transaction.grn.model.TGrn;

/**
 *
 * @author KAZA
 */
public class GrnForm extends AbstractTransactionForm<TGrn>{

    @Override
    protected AbstractTransactionFormService<TGrn> getTransactionFormService() {
        return new GrnService();
    }

    @Override
    protected AbstractObjectCreator<TGrn> getObjectCreator() {
        return new PCGrn(this);
    }
    
}
