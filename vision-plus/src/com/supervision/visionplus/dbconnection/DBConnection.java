/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Date : Aug 12, 2016 Time : 12:52:19 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class DBConnection {

    private Connection connection;

    //singleton instance
    private static DBConnection instance;

    private DBConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
        connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "mysql");
    }

    public static DBConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return connection;
    }

}
