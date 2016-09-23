/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.check_In;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import com.sv.visionplus.transaction.check_In.model.Status;
import com.sv.visionplus.transaction.check_In.model.TInvoice;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZA
 */
public class InvoiceDAO {

    private static InvoiceDAO INSTANCE;
    private final QueryUtil<TInvoice> Query;
    private Connection connection;

    public static InvoiceDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceDAO();
        }

        return INSTANCE;
    }

    public InvoiceDAO() {
        Query = QueryUtil.getInstance(TInvoice.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    List<TInvoice> searchInvoice(String status) {
        try {
            List<TInvoice> invoices = Query.executeSelect(connection, "status=?", status);
            return invoices;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    List<TInvoice> searchInvoice(String status, String factoryId) {
        try {
            List<TInvoice> invoices = Query.executeSelect(connection, "status=? AND factory=?", status, factoryId);
            return invoices;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    int updateInvoice(TInvoice invoice, List<String> idList) {
        int count = 0;
        TInvoice tInvoice = invoice;
        try {
            try {
                connection.setAutoCommit(false);
                for (String invoiceNo : idList) {
                    tInvoice.setIndexNo(Integer.parseInt(invoiceNo));
                    int unicUpdate = updateUniqueInvoice(connection, tInvoice);
                    if (unicUpdate > 0) {
                        int statusId = StatusDAO.getInstance().addStatus(connection, tInvoice);
                        if (statusId > 0) {
                            count += 1;
                        } else {
                            connection.rollback();
                            return 0;
                        }
                    } else {
                        connection.rollback();
                        return 0;
                    }

                }
                if (count == idList.size()) {
                    System.out.print(count);
                    connection.commit();
                    return count;
                }

            } finally {
                connection.setAutoCommit(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private int updateUniqueInvoice(Connection connection, TInvoice invoice) {
        TInvoice tInvoice = invoice;
        int id = 0;
        
        TInvoice searchInvoice = InvoiceDAO.getInstance().searchInvoice(connection, invoice.getIndexNo());
        tInvoice.setAmount(searchInvoice.getAmount());
        tInvoice.setCustomer(searchInvoice.getCustomer());
        tInvoice.setIndexNo(searchInvoice.getIndexNo());
        tInvoice.setIsDelete(searchInvoice.getIsDelete());

        try {
            id = Query.executeUpdate(connection, invoice, "index_no=?", invoice.getIndexNo());
            System.out.println(id);

        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    private TInvoice searchInvoice(Connection connection, int invoiceNo) {
        TInvoice selectInvoice = new TInvoice();
        try {
            selectInvoice = Query.executeUniqueSelect(connection, "index_no=?", invoiceNo);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return selectInvoice;
    }
}
