/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.invoice.dialog_form.customer_dialog;

import com.sv.visionplus.transaction.invoice.dialog_form.customer_dialog.model.MCustomer;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author KAZA
 */
public class CustomerDAO {

    public static CustomerDAO INSTANCE;
    private QueryUtil<MCustomer> queryUtil;

    public static CustomerDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerDAO();
        }
        return INSTANCE;
    }

    public CustomerDAO() {
        this.queryUtil = QueryUtil.getInstance(MCustomer.class);
    }

    List<MCustomer> allCustomer(Connection connection) throws SQLException {
        return queryUtil.executeSelect(connection);
    }

    int saveCustomer(Connection connection, MCustomer customer) throws SQLException {
        return queryUtil.executeInsert(connection, customer);
    }

    List<MCustomer> searchCustomer(Connection connection, MCustomer customer) throws SQLException {
        return queryUtil.executeSelect(connection, "name LIKE ? AND nic LIKE ? AND contact_no LIKE ? AND address LIKE ? ", "%" + customer.getName() + "%", "%" + customer.getNic() + "%", "%" + customer.getContactNo() + "%", "%" + customer.getAddress() + "%");
    }

}
