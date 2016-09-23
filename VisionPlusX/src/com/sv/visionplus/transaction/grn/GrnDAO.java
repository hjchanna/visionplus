/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.grn;

import com.sv.visionplus.transaction.grn.model.TGrn;
import com.sv.visionplus.transaction.grn.model.GrnMix;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.logFile.LogFileDAO;

/**
 *
 * @author KAZA
 */
public class GrnDAO {
    private static GrnDAO INSTANCE;
    private final QueryUtil<TGrn> Query;
    private Connection connection;

    public static GrnDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new GrnDAO();
        }

        return INSTANCE;
    }

    public GrnDAO() {
        Query = QueryUtil.getInstance(TGrn.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(GrnDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public int saveGrn(GrnMix mix){
        try {
            try {
                int grnId = Query.executeInsert(connection, mix.getGrn());
                if (grnId > 0) {
                    
                    int count=GrnItemDAO.getInstance().saveGrnItem(connection,mix.getGrnDetail(),grnId);
                    if (count > 0) {
                        int res=StockLedgerDOA.getInstance().saveStockLedgres(connection,mix.getLedger());
                        if (res > 0) {
                            int logId = LogFileDAO.getInstance().saveLog(connection, mix.getLogFileModel());
                            if (logId > 0) {
                                return grnId; 
                                
                            } else {
                                connection.rollback();
                                return -1;
                            }
                        } else {
                            connection.rollback();
                            return -1;
                        }
                    } else {
                        connection.rollback();
                        return -1;
                    }
                } else {
                    connection.rollback();
                    return -1;
                }
            } finally {
                connection.setAutoCommit(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GrnDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    
    }
}
