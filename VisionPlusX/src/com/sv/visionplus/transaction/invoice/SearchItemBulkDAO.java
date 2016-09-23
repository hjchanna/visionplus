/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.invoice.model.SearchItemBulk;
import com.sv.visionplus.transaction.invoice.model.TInvoiceItem;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class SearchItemBulkDAO {

    private static SearchItemBulkDAO INSTANCE;
    private final QueryUtil<SearchItemBulk> Query;
    private Connection connection;

    public static SearchItemBulkDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SearchItemBulkDAO();
        }

        return INSTANCE;
    }

    public SearchItemBulkDAO() {
        Query = QueryUtil.getInstance(SearchItemBulk.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SearchItemBulkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<SearchItemBulk> getItem() {
        List<SearchItemBulk> itemList = new ArrayList<>();
        try {
            itemList = Query.executeSelect(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SearchItemBulkDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemList;
    }

    public List<SearchItemBulk> searchItem(String code, String name) {
        List<SearchItemBulk> itemList = new ArrayList<>();
        try {
            itemList = Query.executeSelect(connection, "code LIKE ? AND item_name LIKE ? ", "%"+code+"%","%"+name+"%");
        } catch (SQLException ex) {
            Logger.getLogger(SearchItemFrontDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemList;
    }
}
