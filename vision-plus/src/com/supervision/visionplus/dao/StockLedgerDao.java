/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.TStockLedger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Date : Aug 16, 2016 Time : 6:03:11 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class StockLedgerDao {

    private static StockLedgerDao INSTANCE;

    public static final StockLedgerDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StockLedgerDao();
        }
        return INSTANCE;
    }

    private StockLedgerDao() {

    }

    public boolean addStockLedger(TStockLedger ledger,Connection con) throws SQLException {
        String query = "INSERT INTO t_Stock_ledger VALUES(?,?,?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, ledger.getIndexNo());
        stm.setObject(2, ledger.getDate());
        stm.setObject(3, ledger.getStore());
        stm.setObject(4, ledger.getMItem());
        stm.setObject(5, ledger.getInQty());
        stm.setObject(6, ledger.getOutQty());
        return stm.executeUpdate() > 0;
    }

}
