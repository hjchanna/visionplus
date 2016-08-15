/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MSupplier;
import com.supervision.visionplus.service.SupplierService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Date : Aug 15, 2016 Time : 10:25:57 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
/*
 private Integer indexNo;
 private String name;
 private String contactNo;
 private String email;
 */
public class SupplierDao implements SupplierService {

    @Override
    public boolean addSupplier(MSupplier supplier) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO MSupplier VALUE(?,?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, supplier.getIndexNo());
        stm.setObject(2, supplier.getName());
        stm.setObject(3, supplier.getContactNo());
        stm.setObject(4, supplier.getEmail());
        return stm.executeUpdate() > 0;
    }

    @Override
    public boolean deleteSupplier(String id) throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM MSupplier WHERE index_no=" + id + "";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        return stm.executeUpdate() > 0;
    }

    @Override
    public boolean updateSupplier(MSupplier supplier) throws ClassNotFoundException, SQLException {
        String query = "UPDATE MSupplier SET name=?,contactNo=?,email=? WHERE index_no=?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, supplier.getIndexNo());
        stm.setObject(2, supplier.getName());
        stm.setObject(3, supplier.getContactNo());
        stm.setObject(4, supplier.getEmail());
        return stm.executeUpdate() > 0;
    }

    @Override
    public ArrayList<MSupplier> searchSupplier(String id) throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM MSupplier WHERE index_no=" + id + "";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MSupplier> suppliers = new ArrayList<>();
        if (rst.next()) {
            suppliers.add(new MSupplier(rst.getInt("index_no"), rst.getString("name"), rst.getString("contactNo"), rst.getString("email")));

        }
        return suppliers;
    }

    @Override
    public ArrayList<MSupplier> getAllSupplier() throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM MSupplier";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MSupplier> suppliers = new ArrayList<>();
        if (rst.next()) {
            suppliers.add(new MSupplier(rst.getInt("index_no"), rst.getString("name"), rst.getString("contactNo"), rst.getString("email")));

        }
        return suppliers;
    }

}
