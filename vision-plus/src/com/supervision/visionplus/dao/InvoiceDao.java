/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.TInvoice;
import com.supervision.visionplus.model.TInvoicePatientInfomation;
import com.supervision.visionplus.model.mixModel.SearchInvoiceMix;
//import com.supervision.visionplus.service.InvoiceService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016 Time : 12:37:48 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class InvoiceDao {
     private static InvoiceDao INSTANCE;

    public static final InvoiceDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceDao();
        }
        return INSTANCE;
    }
    
    private InvoiceDao(){
        
    }

    public  boolean addInvoice(TInvoice invoice , TInvoicePatientInfomation patientInfomation) throws  SQLException {
        String sql = "INSERT INTO t_invoice VALUES(?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, invoice.getIndexNo());
        stm.setObject(2, invoice.getTransaction());
        stm.setObject(3, invoice.getMCustomer());
        stm.setObject(4, invoice.getTPayment());
        stm.setObject(6, invoice.getInvoiceDate());
        stm.setObject(7, invoice.getAmount());
        stm.setObject(8, invoice.getStatus());

        try {
            
                Integer indexNo = PatientHistoryDao.getInstance().addPatientHistory(patientInfomation);
            if (indexNo!=null) {
                stm.setObject(5, indexNo);
                if (stm.executeUpdate()>0) {
                    return true;
                } else {
                    conn.rollback();
                    return false;
                }
            } else {
                conn.rollback();
                return false;
            }
        } finally {
            conn.setAutoCommit(true);
        }
        
    }

    public  boolean updateInvoice(TInvoice invoice) throws  SQLException {
        String sql = "UPDATE T_Invoice SET transaction=?,customer=?,payment=?,patient_information=?,invoice_date=? ,amount=? ,status=? WHERE index_no=?";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, invoice.getTransaction());
        stm.setObject(1, invoice.getMCustomer());
        stm.setObject(1, invoice.getTPayment());
        stm.setObject(1, invoice.getTInvoicePatientInfomation());
        stm.setObject(1, invoice.getInvoiceDate());
        stm.setObject(1, invoice.getAmount());
        stm.setObject(1, invoice.getStatus());
        return stm.executeUpdate() > 0;
    }

    public  ArrayList<SearchInvoiceMix> searchInvoice(SearchInvoiceMix invoiceMix) throws  SQLException {
        String sql = "SELECT i.index_no, i.invoice_date, c.name, c.address, c.contact_no \n"
                + "from t_invoice i,m_customer c \n"
                + "where c.index_no=i.customer and\n"
                + " c.name like '%"+invoiceMix.getName()+"%' and c.address like '%"+invoiceMix.getAddress()+"%' and c.contact_no like '%"+invoiceMix.getContactNO()+"%' and i.invoice_date like '%"+invoiceMix.getDate()+"%' and i.index_no like '%"+invoiceMix.getInvoiceNo()+"%'GROUP BY 1 LIMIT 100;";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        
        ResultSet rst = stm.executeQuery();
        ArrayList<SearchInvoiceMix> invoices = new ArrayList<>();
        while (rst.next()) {
            SearchInvoiceMix mix=new SearchInvoiceMix(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            invoices.add(mix);
        }
        return invoices;
    }
    public  TInvoice searchInvoiceById(Integer invoiceNo) throws  SQLException {
        String sql = "SELECT * FROM t_invoice where index_no="+invoiceNo+"";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        while (rst.next()) {
            return new TInvoice(rst.getInt("index_no"), rst.getInt("transaction"), rst.getString("invoice_date"), rst.getDouble("amount"), rst.getString("status"), rst.getInt("patient_information"), rst.getInt("payment"), rst.getInt("customer"));
        }
        return null;
    }

    public  ArrayList<TInvoice> getAllInvoice() throws  SQLException {
        String sql = "SELECT * FROM t_invoice";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        ArrayList<TInvoice> invoices = new ArrayList<>();
        while (rst.next()) {
            TInvoice invoice = new TInvoice(rst.getInt("index_no"), rst.getInt("transaction"), rst.getString("invoice_date"), rst.getDouble("amount"), rst.getString("status"), rst.getInt("patient_information"), rst.getInt("payment"), rst.getInt("customer"));
            invoices.add(invoice);
        }
        return invoices;
    }

}
