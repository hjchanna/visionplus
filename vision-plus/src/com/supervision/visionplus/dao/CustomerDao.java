/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MCustomer;
//import com.supervision.visionplus.service.CustomerService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Date : Aug 12, 2016 Time : 12:33:51 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class CustomerDao  {

    public static boolean addCustomer(MCustomer customer) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO m_customer VALUES(?,?,?,?,?)";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, customer.getIndexNo());
        stm.setObject(2, customer.getName());
        stm.setObject(3, customer.getNic());
        stm.setObject(4, customer.getAddress());
        stm.setObject(5, customer.getContactNo());
        return stm.executeUpdate() > 0;
    }

    public static boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM m_customer WHERE index_no=" + id + "";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        return stm.executeUpdate() > 0;
    }

    public static boolean updateCustomer(MCustomer customer) throws ClassNotFoundException, SQLException {
        String query = "UPDATE m_customer SET name=?,nic=?,address=?,contactNo=? WHERE index_no=?";
        Connection con = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, customer.getIndexNo());
        stm.setObject(2, customer.getName());
        stm.setObject(3, customer.getNic());
        stm.setObject(4, customer.getAddress());
        stm.setObject(5, customer.getContactNo());
        return stm.executeUpdate() > 0;
    }

    public static ArrayList<MCustomer> searchCustomer(String id) throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM m_customer WHERE index_no=" + id + "";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MCustomer> customers = new ArrayList<>();
        if (rst.next()) {
            customers.add(new MCustomer(rst.getInt("index_no"),
                    rst.getString("name"), rst.getString("nic"),
                    rst.getString("address"), rst.getString("contactNo")));
        }
        return customers;

    }

    public  static ArrayList<MCustomer> getAllCustomer() throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM m_customer";
        Connection con = DBConnection.getDBConnection().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MCustomer> customers = new ArrayList<>();
        if (rst.next()) {
            customers.add(new MCustomer(rst.getInt("index_no"),
                    rst.getString("name"), rst.getString("nic"),
                    rst.getString("address"), rst.getString("contactNo")));
        }
        return customers;
    }

}
