/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.TInvoiceItem;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class InvoiceItemDAO {

    private static InvoiceItemDAO INSTANCE;
    private final QueryUtil<TInvoiceItem> Query;

    public static InvoiceItemDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceItemDAO();
        }

        return INSTANCE;
    }

    public InvoiceItemDAO() {
        Query = QueryUtil.getInstance(TInvoiceItem.class);
    }

    boolean saveItems(Connection connection, List<TInvoiceItem> list,int invoiceId) {
        int val = 0;
        for (TInvoiceItem item : list) {
            item.setInvoice(invoiceId);
            try {
                Query.executeInsert(connection, item);
            } catch (SQLException ex) {
                Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            val++;
        }
        if (val == list.size()) {
            return true;
        }
        return false;
    }

}
