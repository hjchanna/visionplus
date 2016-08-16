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

    public boolean addItems(MItem item,TStockLedger ladger) throws SQLException {
        String query = "INSERT INTO MItem VALUE(?,?,?,?,?)";
        Connection con = DBConnection.getInstance().getConnection();
        con.setAutoCommit(false);
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, item.getIndexNo());
        stm.setObject(2, item.getCode());
        stm.setObject(3, item.getName());
        stm.setObject(4, item.getSalePrice());
        stm.setObject(5, item.getCostPrice());
        
        try{
            int isSaved = stm.executeUpdate();
            if (isSaved > 0) {
                boolean isAllAdded = StockLedgerDao.getInstance().addStockLedger(ladger,con);
                if (isAllAdded) {
                    return true;
                } else {
                    con.rollback();
                    return false;
                }
            } else {
                return false;
            }
        } finally {
            con.setAutoCommit(true);
        }
    }

    public boolean deleteItems(String id) throws SQLException {
        String query = "DELETE FROM MItem WHERE index_no=" + id + "";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        return stm.executeUpdate() > 0;
    }

    public boolean updateItems(MItem item) throws SQLException {
        String query = "UPDATE MItem SET code=?,name=?,salePrice=?,costPrice=? WHERE index_no=?";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, item.getIndexNo());
        stm.setObject(2, item.getCode());
        stm.setObject(3, item.getName());
        stm.setObject(4, item.getSalePrice());
        stm.setObject(5, item.getCostPrice());
        return stm.executeUpdate() > 0;
    }

    public ArrayList<MItem> searchItems(String id) throws SQLException {
        String query = "SELECT * FROM MItem WHERE index_no=" + id + "";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MItem> items = new ArrayList<>();
        if (rst.next()) {
            items.add(new MItem(rst.getInt("IndexNo"), rst.getString("code"), rst.getString("name"), rst.getDouble("salePrice"), rst.getDouble("costPrice")));
        }
        return items;
    }

    public ArrayList<MItem> getAllItems() throws SQLException {
        String query = "SELECT * FROM MItem";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MItem> items = new ArrayList<>();
        if (rst.next()) {
            items.add(new MItem(rst.getInt("IndexNo"), rst.getString("code"), rst.getString("name"), rst.getDouble("salePrice"), rst.getDouble("costPrice")));
        }
        return items;
    }

    public boolean isItem(String code) throws SQLException {
        String query = "SELECT * FROM m_item WHERE index_no=" + code + "";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return true;
        }
        return false;
    }
}
