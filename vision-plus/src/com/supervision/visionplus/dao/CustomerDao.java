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
public class CustomerDao {

    private static CustomerDao INSTANCE;

    public static final CustomerDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerDao();
        }
        return INSTANCE;
    }

    private CustomerDao() {

    }

    public boolean addCustomer(MCustomer customer) throws SQLException {
        String query = "INSERT INTO m_customer VALUES(?,?,?,?,?)";
        Connection con = DBConnection.getInstance().getConnection();
        ArrayList<MCustomer> list = searchCustomer(customer);
        if (list.size()<1) {

            PreparedStatement stm = con.prepareStatement(query);
            stm.setObject(1, customer.getIndexNo());
            stm.setObject(2, customer.getName());
            stm.setObject(3, customer.getNic());
            stm.setObject(4, customer.getAddress());
            stm.setObject(5, customer.getContactNo());
            return stm.executeUpdate() > 0;
        } else {
            return false;
        }
    }

    public boolean deleteCustomer(String id) throws SQLException {
        String query = "DELETE FROM m_customer WHERE index_no=" + id + "";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        return stm.executeUpdate() > 0;
    }

    public boolean updateCustomer(MCustomer customer) throws SQLException {
        String query = "UPDATE m_customer SET name=?,nic=?,address=?,contact_no=? WHERE index_no=?";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(5, customer.getIndexNo());
        stm.setObject(1, customer.getName());
        stm.setObject(2, customer.getNic());
        stm.setObject(3, customer.getAddress());
        stm.setObject(4, customer.getContactNo());
        return stm.executeUpdate() > 0;
    }

    public ArrayList<MCustomer> searchCustomer(MCustomer customer) throws SQLException {
        String query = "SELECT * FROM m_customer WHERE name LIKE '%" + customer.getName() + "%' and nic LIKE '%" + customer.getNic() + "%' and address LIKE '%" + customer.getAddress() + "%' and contact_no LIKE '%" + customer.getContactNo() + "%'";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MCustomer> customers = new ArrayList<>();
        while (rst.next()) {
            customers.add(new MCustomer(rst.getInt("index_no"),
                    rst.getString("name"), rst.getString("nic"),
                    rst.getString("address"), rst.getString("contact_no")));
        }
        return customers;

    }

    public MCustomer searchCustomerById(Integer indexNo) throws SQLException {
        String query = "SELECT * FROM m_customer WHERE index_no=" + indexNo + "";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return new MCustomer(rst.getInt("index_no"),
                    rst.getString("name"), rst.getString("nic"),
                    rst.getString("address"), rst.getString("contact_no"));
        }
        return null;

    }

    public boolean isCustomer(String id) throws SQLException {
        String query = "SELECT * FROM m_customer WHERE index_no=" + id + "";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return true;
        }
        return false;

    }

    public ArrayList<MCustomer> getAllCustomer() throws SQLException {
        String query = "SELECT * FROM m_customer";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MCustomer> customers = new ArrayList<>();
        while (rst.next()) {
            customers.add(new MCustomer(rst.getInt("index_no"),
                    rst.getString("name"), rst.getString("nic"),
                    rst.getString("address"), rst.getString("contact_no")));
        }
        return customers;
    }

}
