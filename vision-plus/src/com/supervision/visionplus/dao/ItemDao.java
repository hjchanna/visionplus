/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MItem;
import com.supervision.visionplus.model.TStockLedger;
//import com.supervision.visionplus.service.ItemService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016 Time : 12:44:49 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */

/*
 private Integer indexNo;
 private String code;
 private String name;
 private Double salePrice;
 private Double costPrice;
 */
public class ItemDao {

    private static ItemDao INSTANCE;

    public static final ItemDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ItemDao();
        }
        return INSTANCE;
    }

    private ItemDao() {

    }

    public boolean addItems(MItem item) throws SQLException {
        String query = "INSERT INTO m_item VALUES(?,?,?,?,?,?,?,?)";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, item.getIndexNo());
        stm.setObject(2, item.getBrand());
        stm.setObject(3, item.getCategory());
        stm.setObject(4, item.getCode());
        stm.setObject(5, item.getName());
        stm.setObject(6, item.getSalePrice());
        stm.setObject(7, item.getCostPrice());
        stm.setObject(8, item.getReorderQty());
        return stm.executeUpdate() > 0;

    }

    public boolean deleteItems(String code) throws SQLException {
        String query = "DELETE FROM m_item WHERE code=?";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, code);
        return stm.executeUpdate() > 0;
    }

    public boolean updateItems(MItem item) throws SQLException {
        String query = "UPDATE m_item SET index_no=?,name=?,sale_price=?,cost_price=?,reorder_qty=? WHERE code=?";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(6, item.getCode());
        stm.setObject(1, item.getIndexNo());
        stm.setObject(2, item.getName());
        stm.setObject(3, item.getSalePrice());
        stm.setObject(4, item.getCostPrice());
        stm.setObject(5, item.getReorderQty());
        return stm.executeUpdate() > 0;
    }

    public ArrayList<MItem> searchItems(String id) throws SQLException {
        String query = "SELECT * FROM m_item WHERE index_no=" + id + "";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MItem> items = new ArrayList<>();
        while (rst.next()) {
            items.add(new MItem(rst.getInt(1), rst.getInt(2),
                    rst.getInt(3), rst.getString(4),
                    rst.getString(5), rst.getDouble(6),
                    rst.getDouble(6), rst.getInt(7)
            ));
        }
        return items;
    }

    public ArrayList<MItem> getAllItems() throws SQLException {
        String query = "SELECT * FROM m_item";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MItem> items = new ArrayList<>();
        while (rst.next()) {
            items.add(new MItem(rst.getInt(1), rst.getInt(2),
                    rst.getInt(3), rst.getString(4),
                    rst.getString(5), rst.getDouble(6),
                    rst.getDouble(6), rst.getInt(7)
            ));
        }
        return items;
    }

    public boolean isItem(String code) throws SQLException {
        String query = "SELECT * FROM m_item WHERE code=?";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, code);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return true;
        }
        return false;
    }
}
