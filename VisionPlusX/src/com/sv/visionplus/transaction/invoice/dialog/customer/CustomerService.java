/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice.dialog.customer;

import com.sv.visionplus.transaction.invoice.dialog.customer.model.MCustomer;
import com.sv.visionplus.util.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KAZA
 */
public class CustomerService {
    public static CustomerService INSTANCE;

    public static CustomerService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerService();
        }
        return INSTANCE;
    }
 public List<MCustomer> allCustomer() {
        Connection connection;
        List<MCustomer> allCustomer = null;
        try {
            connection = DatabaseUtil.getInstance().openConnection();
            allCustomer = CustomerDAO.getInstance().allCustomer(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allCustomer;

    }
 public int saveCustomer(MCustomer customer){
            Connection connection;
        try {
            connection = DatabaseUtil.getInstance().openConnection();
            return CustomerDAO.getInstance().saveCustomer(connection,customer);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;

 }

   public List<MCustomer> searchCustomer(MCustomer customer) {
         Connection connection;
        try {
            connection = DatabaseUtil.getInstance().openConnection();
            return CustomerDAO.getInstance().searchCustomer(connection,customer);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
