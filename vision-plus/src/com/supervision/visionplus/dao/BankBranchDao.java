/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MBankBranch;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author KAZA
 */
public class BankBranchDao {
    private static BankBranchDao INSTANCE;

    public static final BankBranchDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BankBranchDao();
        }
        return INSTANCE;
    }

    private BankBranchDao() {

    }
    
     public ArrayList<MBankBranch> getAllBankBranch() throws SQLException {
        String query = "SELECT * FROM bank_branch group by 2";
        Connection con = DBConnection.getInstance().getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        ArrayList<MBankBranch> branches = new ArrayList<>();
        while (rst.next()) {
            branches.add(new MBankBranch(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return branches;
    }

}
