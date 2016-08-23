package com.sv.visionplus.util.database;

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
public class DatabaseUtil {

    private static DatabaseUtil INSTANCE;
    private Connection connection;

    private DatabaseUtil() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DatabaseUtil getInstance() throws SQLException {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseUtil();
        }
        return INSTANCE;
    }

    //conncetion pooling
    public Connection openConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "mysql");
        return connection;
    }

    public void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
