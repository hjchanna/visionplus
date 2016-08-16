/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dao;

import com.supervision.visionplus.dbconnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public int getLastId(String tableName, String columnName) throws SQLException {
        String sql = "select max(?) as id from ?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, columnName);
        preparedStatement.setString(2, tableName);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }

        return 0;
    }

}
