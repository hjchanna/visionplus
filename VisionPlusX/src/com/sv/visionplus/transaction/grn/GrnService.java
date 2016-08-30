/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.grn.model.TGrn;

/**
 *
 * @author KAZA
 */
public class GrnService extends AbstractTransactionFormService<TGrn>{

    @Override
    protected TGrn select(Integer indexNo) throws VPException {
        return null;
    }

    @Override
    protected void save(TGrn object) throws VPException {
    }

    @Override
    protected void update(TGrn object) throws VPException {
    }

    @Override
    protected void delete(TGrn object) throws VPException {
    }
    
}
