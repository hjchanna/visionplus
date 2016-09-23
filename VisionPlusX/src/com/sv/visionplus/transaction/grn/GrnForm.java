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
import com.sv.visionplus.transaction.grn.model.GrnMix;

/**
 *
 * @author KAZA
 */
public class GrnForm extends AbstractTransactionForm<GrnMix> {

    private PCGrn grn;

    @Override
    protected AbstractTransactionFormService<GrnMix> getTransactionFormService() {
        return new GrnService();
    }

    @Override
    protected AbstractObjectCreator<GrnMix> getObjectCreator() {
        grn = new PCGrn(this);
        return grn;
    }

    @Override
    public void doSave() {
        super.doSave();

        if (grn != null) {
            grn.resetFields();
        }
    }

}
