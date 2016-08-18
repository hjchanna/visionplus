/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MBrand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Date : Aug 18, 2016 Time : 4:07:37 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class BrandDao {

    private static BrandDao INSTANCE;

    public static final BrandDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BrandDao();
        }
        return INSTANCE;
    }

    private BrandDao() {

    }

    public boolean addBrand(MBrand brand) throws SQLException {
        System.out.println("1");
        String query = "INSERT INTO m_brand VALUES(?,?)";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, brand.getIndexNo());
        stm.setObject(2, brand.getName());
        System.out.println(brand.getIndexNo());
        System.out.println(brand.getName());
        return stm.executeUpdate() > 0;

    }

    public boolean deleteBrand(String id) throws SQLException {
        String query = "DELETE FROM m_brand WHERE index_no=" + id + "";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        return stm.executeUpdate() > 0;
    }

    public MBrand searchBrand(String name) throws SQLException {
        String query = "SELECT * FROM m_brand WHERE name=" + name + "";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return new MBrand(rst.getInt(1), rst.getString(2)
            );
        }
        return null;
    }

    public ArrayList<MBrand> getAllBrands() throws SQLException {
        String query = "SELECT * FROM m_brand";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MBrand> brands = new ArrayList<>();
        if (rst.next()) {
            brands.add(new MBrand(rst.getInt(1), rst.getString(2)
            ));
        }
        return brands;
    }

    public boolean isBrand(String name) throws SQLException {
        String query = "SELECT * FROM m_brand WHERE name=" + name;
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return true;
        }
        return false;
    }
}
