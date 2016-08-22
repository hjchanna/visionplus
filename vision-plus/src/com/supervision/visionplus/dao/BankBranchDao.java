/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MBankBranch;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public boolean addBankBranch(MBankBranch bankBranch) throws SQLException {
        String query = "INSERT INTO bank_branch VALUES(?,?,?)";
        Connection con = DBConnection.getInstance().getConnection();
        MBankBranch search = searchBankBranch(bankBranch);
        if (search == null) {

            PreparedStatement stm = con.prepareStatement(query);
            stm.setObject(1, bankBranch.getCode());
            stm.setObject(2, bankBranch.getBank());
            stm.setObject(3, bankBranch.getBranch());
            return stm.executeUpdate() > 0;
        } else {
            return false;
        }

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

    public MBankBranch searchBankBranch(MBankBranch bankBranch) throws SQLException {
        String query = "SELECT * FROM bank_branch WHERE code=? and (bank=? or branch=?)";
        Connection con = DBConnection.getInstance().getConnection();
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1, bankBranch.getCode());
        stm.setObject(2, bankBranch.getBank());
        stm.setObject(3, bankBranch.getBranch());
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new MBankBranch(rst.getString(1), rst.getString(2), rst.getString(3));
        }
        return null;
    }

}
