/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author KAZA
 */
public class IDGeneraterDao {
 private static IDGeneraterDao INSTANCE;

    public static final IDGeneraterDao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new IDGeneraterDao();
        }

        return INSTANCE;
    }

    private IDGeneraterDao() {
    }

    public  String getLastId(String tableName, String columnName) throws ClassNotFoundException, SQLException {
        String sql = "select "+columnName + " from "+tableName+" order by 1 desc limit 1";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }
    
}
