/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.supervision.visionplus.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Date : Aug 12, 2016
 * Time : 12:52:19 PM
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class DBConnection {
    
    private Connection connection;
    private static DBConnection dBConnection;

    private DBConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "mysql");
    }

    public static DBConnection getDBConnection() throws SQLException, ClassNotFoundException {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return connection;
    }

}
