package com.sv.visionplus.transaction.grn.dialog.item;

import com.sv.visionplus.transaction.grn.dialog.item.model.ItemMix;
import com.sv.visionplus.transaction.grn.dialog.item.model.MItem;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public List<ItemMix> getSearchResult(Connection connection, ItemMix items ) throws SQLException {
        String sql = "select i.code,i.name,b.name,c.name,i.sale_price,i.cost_price from m_item i,m_brand b,m_category c where b.index_no=i.brand and i.category=c.index_no and i.code LIKE '%"+items.getCode()+"%' and i.name LIKE '%"+items.getName()+"%' and c.name LIKE '%"+items.getCategory()+"%' and b.name LIKE '%"+items.getBrand()+"%'";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<ItemMix> list = new ArrayList<>();
        while (resultSet.next()) {
            ItemMix item = new ItemMix(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getDouble(5), resultSet.getDouble(6));
            list.add(item);
        }
        return list;
    }

    public List<ItemMix> getAllItems(Connection connection) throws SQLException {
        String sql = "select i.code,i.name,b.name,c.name,i.sale_price,i.cost_price from m_item i,m_brand b,m_category c where b.index_no=i.brand and i.category=c.index_no LIMIT 50";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<ItemMix> list = new ArrayList<>();
        while (resultSet.next()) {
            ItemMix item = new ItemMix(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getDouble(5), resultSet.getDouble(6));
            list.add(item);
        }
        return list;
    }

}
