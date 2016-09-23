/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.master.item;

import com.sv.visionplus.base.master.AbstractMasterFormDAO;
import com.sv.visionplus.master.item.model.MItem;
import com.sv.visionplus.stock.stock_transfer.StockLedgerDAO;
import com.sv.visionplus.stock.stock_transfer.model.TStockLedger;
import com.sv.visionplus.util.database.QueryUtil;
import com.sv.visionplus.util.formatter.FormatterUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

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
        
        int indexNo = queryUtil.executeInsert(connection, item);
        if (indexNo>0) {
            JOptionPane.showMessageDialog(null, "Item Save SuccessFully..");
        }
    
    }

    @Override
    public void update(Connection connection, MItem item) throws SQLException {
        queryUtil.executeUpdate(connection, item, "index_no=?", item.getIndexNo());
    }

    @Override
    public void delete(Connection connection, MItem item) throws SQLException {
        queryUtil.executeDelete(connection, "index_no=?", item.getIndexNo());
    }

    @Override
    public List<MItem> getSearchResult(Connection connection, String text) throws SQLException {
        text = "%" + text + "%";
        return queryUtil.executeSelect(connection, "code LIKE ? OR name LIKE ? OR brand LIKE ? OR category LIKE ?", text, text,text,text);
    }


}
