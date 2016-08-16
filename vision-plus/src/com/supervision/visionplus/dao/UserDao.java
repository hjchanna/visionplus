/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import com.supervision.visionplus.model.MItem;
import com.supervision.visionplus.model.MUser;
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
public class UserDao {

    public static MUser searchUser(String userName, String password) throws ClassNotFoundException, SQLException {
        String sql = "Select * From m_user where user_name=? and password=?";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, userName);
        stm.setObject(2, password);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            MUser user = new MUser(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
            return user;
        } else {
            return null;

        }
    }
}
