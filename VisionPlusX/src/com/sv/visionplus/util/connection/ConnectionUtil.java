package com.sv.visionplus.util.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohan
 */
//XXX:NIDURA
public class ConnectionUtil {

    private static ConnectionUtil INSTANCE;
    private Connection connection;

    private ConnectionUtil() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "mysql");
    }

    public static ConnectionUtil getInstance() throws SQLException {
        if (INSTANCE == null) {
            INSTANCE = new ConnectionUtil();
        }
        return INSTANCE;
    }

    //conncetion pooling
    public Connection openConnection() throws SQLException {
        return connection;
    }

    public void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
