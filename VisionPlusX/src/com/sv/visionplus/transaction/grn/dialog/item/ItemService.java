package com.sv.visionplus.transaction.grn.dialog.item;

import com.sv.visionplus.transaction.grn.dialog.item.model.ItemMix;
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

    public List<ItemMix> getAllItems() {
        List<ItemMix> list = new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            list = ItemFormDAO.getInstance().getAllItems(connection);
        } catch (SQLException ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<ItemMix> getSearchResult(ItemMix item) {
        
        List<ItemMix> list = new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            list = ItemFormDAO.getInstance().getSearchResult(connection, item);
            System.out.println(list.size());
        } catch (SQLException ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
