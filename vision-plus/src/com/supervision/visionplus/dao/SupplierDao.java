/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MSupplier;
//import com.supervision.visionplus.service.SupplierService;
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
public class SupplierDao {

    private static SupplierDao INSTANCE;

    public static final SupplierDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SupplierDao();
        }

        return INSTANCE;
    }

    private SupplierDao() {
    }

    public  boolean addSupplier(MSupplier supplier) throws  SQLException {
        boolean isSupplier = isSupplier(supplier.getIndexNo());
        if (!isSupplier) {

            String query = "INSERT INTO m_supplier VALUES(?,?,?,?)";
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement(query);
            stm.setObject(1, supplier.getIndexNo());
            stm.setObject(2, supplier.getName());
            stm.setObject(3, supplier.getContactNo());
            stm.setObject(4, supplier.getEmail());
            return stm.executeUpdate() > 0;
        } else {
            boolean res = updateSupplier(supplier);
            return res;
        }
    }

    public boolean deleteSupplier(int id) throws SQLException {
        String query = "DELETE FROM m_supplier WHERE index_no=" + id + "";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        return stm.executeUpdate() > 0;
    }

    public boolean updateSupplier(MSupplier supplier) throws SQLException {
        String query = "UPDATE m_supplier SET name=?,contact_no=?,email=? WHERE index_no=?";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(4, supplier.getIndexNo());
        stm.setObject(1, supplier.getName());
        stm.setObject(2, supplier.getContactNo());
        stm.setObject(3, supplier.getEmail());
        return stm.executeUpdate() > 0;
    }

    public ArrayList<MSupplier> searchSupplier(MSupplier supplier) throws SQLException {
        String query = "SELECT * FROM m_supplier WHERE name like '%"+supplier.getName()+"%' and contact_no like '%"+supplier.getContactNo()+"%' and email like '%"+supplier.getEmail()+"%'  ";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MSupplier> suppliers = new ArrayList<>();
        while (rst.next()) {
            suppliers.add(new MSupplier(rst.getInt("index_no"), rst.getString("name"), rst.getString("contact_no"), rst.getString("email")));

        }
        return suppliers;
    }

    public boolean isSupplier(int id) throws SQLException {
        String query = "SELECT * FROM m_supplier WHERE index_no=" + id + "";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return true;
        }
        return false;
    }

    public ArrayList<MSupplier> getAllSupplier() throws SQLException {
        String query = "SELECT * FROM m_supplier";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MSupplier> suppliers = new ArrayList<>();
        while (rst.next()) {
            suppliers.add(new MSupplier(rst.getInt("index_no"), rst.getString("name"), rst.getString("contact_no"), rst.getString("email")));

        }
        return suppliers;
    }

}
