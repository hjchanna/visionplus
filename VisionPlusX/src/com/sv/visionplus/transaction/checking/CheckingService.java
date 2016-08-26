/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.checking;

import com.sv.visionplus.base.transaction.AbstractTransactionFormService;
import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.transaction.invoice.model.TInvoice;
import com.sv.visionplus.util.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class CheckingService extends AbstractTransactionFormService<TInvoice>{

    @Override
    protected TInvoice select(Integer indexNo) throws VPException {
            TInvoice select = null;
        try {
            Connection connection=DatabaseUtil.getInstance().openConnection();
            select = CheckingDAO.getInstance().select(connection, indexNo);
        
        } catch (SQLException ex) {
            Logger.getLogger(CheckingService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return select;
    }

    @Override
    protected void save(TInvoice object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void update(TInvoice object) throws VPException {
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            CheckingDAO.getInstance().update(connection, object);
        } catch (SQLException ex) {
            Logger.getLogger(CheckingService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void delete(TInvoice object) throws VPException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
