/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Date : Aug 18, 2016 Time : 3:22:41 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class CategoryDao {

    private static CategoryDao INSTANCE;

    public static final CategoryDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CategoryDao();
        }
        return INSTANCE;
    }

    private CategoryDao() {

    }

    public ArrayList<MCategory> getAllCategory() throws SQLException {
        String query = "SELECT * FROM m_category";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MCategory> categorys = new ArrayList<>();
        while (rst.next()) {
            categorys.add(new MCategory(rst.getInt(1), rst.getString(2)
            ));
        }
        return categorys;
    }

    public MCategory searchCategory(String name) throws SQLException {
        String query = "SELECT * FROM m_category WHERE name=" + name + "";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return new MCategory(rst.getInt(1), rst.getString(2)
            );
        }
        return null;
    }
}
