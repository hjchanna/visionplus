package com.sv.visionplus.transaction.grn.dialog.item;

import com.sv.visionplus.transaction.grn.dialog.item.model.MItem;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Nidura Prageeth
 */
public class ItemFormDAO {

    public static ItemFormDAO INSTANCE;
    private QueryUtil<MItem> queryUtil;

    public static ItemFormDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ItemFormDAO();
        }
        return INSTANCE;
    }

    public ItemFormDAO() {
        this.queryUtil = QueryUtil.getInstance(MItem.class);
    }

    public List<MItem> getSearchResult(Connection connection, MItem item) throws SQLException {
        return queryUtil.executeSelect(connection, "code LIKE ? OR name LIKE ? OR brand LIKE ? OR category LIKE ?", "%" + item.getCode() + "%", "%" + item.getName() + "%", "%" + item.getBrand() + "%", "%" + item.getCategory() + "%");
    }

    public List<MItem> getAllItems(Connection connection) throws SQLException {
        return queryUtil.executeSelect(connection);
    }
}
