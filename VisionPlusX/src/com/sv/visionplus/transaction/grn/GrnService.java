/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.grn.model.GrnMix;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZA
 */
public class GrnService extends AbstractTransactionFormService<GrnMix>{

    @Override
    protected GrnMix select(Integer indexNo) throws VPException {
        return null;
    }

    @Override
    protected void save(GrnMix grnMix) throws VPException {
        int grnId = GrnDAO.getInstance().saveGrn(grnMix);
        if (grnId>0) {
            JOptionPane.showMessageDialog(null, grnId+" Grn Saved Successfully..");
        }else{
            JOptionPane.showMessageDialog(null, grnId+" Grn Saved Fail..");
        }
    }

    @Override
    protected void update(GrnMix grnMix) throws VPException {
    }

    @Override
    protected void delete(GrnMix grnMix) throws VPException {
    }
    
}
