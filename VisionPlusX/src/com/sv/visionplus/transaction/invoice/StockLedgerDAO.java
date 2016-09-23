/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.TInvoiceItem;
import com.sv.visionplus.transaction.invoice.model.TStockLedger;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author KAZA
 */
public class StockLedgerDAO {

    private static StockLedgerDAO INSTANCE;
    private final QueryUtil<TStockLedger> Query;

    public static StockLedgerDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StockLedgerDAO();
        }

        return INSTANCE;
    }

    public StockLedgerDAO() {
        Query = QueryUtil.getInstance(TStockLedger.class);
    }

    boolean saveStockLedger(Connection connection, List<TStockLedger> stockLedgerList) {
        int count = 0;
        for (TStockLedger stock : stockLedgerList) {
            try {
                int indexNo = Query.executeInsert(connection, stock);
                if (indexNo > 0) {
                    count++;
                }
            } catch (SQLException ex) {
                Logger.getLogger(StockLedgerDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (count == stockLedgerList.size()) {
            return true;
        }
        return false;
    }

}
