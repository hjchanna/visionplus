/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.TInvoiceItem;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author KAZA
 */
public class InvoiceItemService {

    private static InvoiceItemService INSTANCE;

    public static InvoiceItemService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceItemService();
        }

        return INSTANCE;
    }

    public boolean saveItem(Connection connection, List<TInvoiceItem> list,int invoiceId) {
        boolean saveItems = InvoiceItemDAO.getInstance().saveItems(connection, list,invoiceId);
        return saveItems;
    }

}
