/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx.controller;

import com.sv.visionplus.util.connection.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.model.MUser;

/**
 * Date : Aug 23, 2016 Time : 11:48:45 AM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class UserDAO implements UserService {

    private static UserDAO INSTANCE;

    public static UserDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserDAO();
        }
        return INSTANCE;
    }

    private UserDAO() {

    }

    public MUser checkUser(String username, String password) throws SQLException {
        String query = "Select * From m_user where user_name=? and password=?";
        Connection openConnection = ConnectionUtil.getInstance().openConnection();
        PreparedStatement stm = openConnection.prepareStatement(query);
        stm.setObject(1, username);
        stm.setObject(2, password);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new MUser(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
        }
        return null;
    }
}
