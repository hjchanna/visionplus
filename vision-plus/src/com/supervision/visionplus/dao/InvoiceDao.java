/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.TInvoice;
//import com.supervision.visionplus.service.InvoiceService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016
 * Time : 12:37:48 PM
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class InvoiceDao {

    public static boolean addInvoice(TInvoice invoice) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO t_invoice VALUES(?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, invoice.getIndexNo());
        stm.setObject(2, invoice.getTransaction());
        stm.setObject(3, invoice.getMCustomer());
        stm.setObject(4, invoice.getTPayment());
        stm.setObject(5, invoice.getTInvoicePatientInfomation());
        stm.setObject(6, invoice.getInvoiceDate());
        stm.setObject(7, invoice.getAmount());
        stm.setObject(8, invoice.getStatus());
        
        return  stm.executeUpdate()>0;
    }

    public static boolean updateInvoice(TInvoice invoice) throws ClassNotFoundException, SQLException {
         String sql = "UPDATE T_Invoice SET transaction=?,customer=?,payment=?,patient_information=?,invoice_date=? ,amount=? ,status=? WHERE index_no=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, invoice.getTransaction());
        stm.setObject(1, invoice.getMCustomer());
        stm.setObject(1, invoice.getTPayment());
        stm.setObject(1, invoice.getTInvoicePatientInfomation());
        stm.setObject(1, invoice.getInvoiceDate());
        stm.setObject(1, invoice.getAmount());
        stm.setObject(1, invoice.getStatus());
        return  stm.executeUpdate()>0;
    }

    public static ArrayList<TInvoice> searchInvoice(String index_no) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM t_invoice WHERE index_no=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, index_no);
        ResultSet rst = stm.executeQuery();
        ArrayList<TInvoice> invoices=new ArrayList<>();
        while(rst.next()){
            TInvoice invoice=new TInvoice(rst.getInt("index_no"), rst.getInt("transaction"), rst.getDate("invoice_date"), rst.getDouble("amount"), rst.getString("status"), rst.getInt("patient_information"),rst.getInt("payment"),rst.getInt("customer"));
            invoices.add(invoice);
        }
        return invoices;
    }

    public static ArrayList<TInvoice> getAllInvoice() throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM t_invoice";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        ArrayList<TInvoice> invoices=new ArrayList<>();
        while(rst.next()){
            TInvoice invoice=new TInvoice(rst.getInt("index_no"), rst.getInt("transaction"), rst.getDate("invoice_date"), rst.getDouble("amount"), rst.getString("status"), rst.getInt("patient_information"),rst.getInt("payment"),rst.getInt("customer"));
            invoices.add(invoice);
        }
        return invoices;
    }

  
}
