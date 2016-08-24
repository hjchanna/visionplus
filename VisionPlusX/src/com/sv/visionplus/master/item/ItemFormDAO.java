/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.item;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.master.item.model.MBrand;
import com.sv.visionplus.master.item.model.MCategory;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Date : Aug 24, 2016 Time : 12:19:51 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class ItemFormDAO extends AbstractMasterFormDAO<MItem> {

    private QueryUtil<MItem> queryUtil;

    public ItemFormDAO() {
        this.queryUtil = QueryUtil.getInstance(MItem.class);
    }

    @Override
    public void save(Connection connection, MItem item) throws SQLException {
        queryUtil.executeInsert(connection, item);
    }

    @Override
    public void update(Connection connection, MItem item) throws SQLException {
        queryUtil.executeUpdate(connection, item, "code=?", item.getCode());
    }

    @Override
    public void delete(Connection connection, MItem item) throws SQLException {
        queryUtil.executeDelete(connection, "code=?", item.getCode());
    }

    @Override
    public List<MItem> getSearchResult(Connection connection, String text) throws SQLException {
        text = "%" + text + "%";
        return queryUtil.executeSelect(connection, "code LIKE ? OR name LIKE ? OR brand LIKE ? OR category LIKE ?", text, text, text, text);
    }

    public List<MBrand> listBrand(Connection connection) throws SQLException {
        QueryUtil<MBrand> queryUtil = QueryUtil.getInstance(MBrand.class);
        return queryUtil.executeSelect(connection);
    }

    public List<MCategory> listCategory(Connection connection) throws SQLException {
        QueryUtil<MCategory> queryUtil = QueryUtil.getInstance(MCategory.class);
        return queryUtil.executeSelect(connection);
    }

}
