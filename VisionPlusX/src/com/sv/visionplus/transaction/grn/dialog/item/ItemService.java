package com.sv.visionplus.transaction.grn.dialog.item;

import com.sv.visionplus.transaction.grn.dialog.item.model.MItem;
import com.sv.visionplus.util.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Nidura Prageeth
 */
public class ItemService {

    public static ItemService INSTANCE;

    public static ItemService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ItemService();
        }
        return INSTANCE;
    }

    public ItemService() {

    }

    public List<MItem> getAllItems() {
        List<MItem> allItems = new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            allItems = ItemFormDAO.getInstance().getAllItems(connection);
        } catch (SQLException ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allItems;
    }

    public List<MItem> getSearchResult(MItem item) {
        List<MItem> items = new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            items = ItemFormDAO.getInstance().getSearchResult(connection, item);
        } catch (SQLException ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
}
