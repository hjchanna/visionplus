package com.sv.visionplus.util.connection;

import java.sql.Connection;

/**
 *
 * @author Mohan
 */
//XXX:NIDURA
public class ConnectionUtil {

    //TODO: create singleton ConnectionUtil
    /*
     *
     */
    private ConnectionUtil() {
        //TODO:init connection pool
    }

    //conncetion pooling
    public Connection openConnection() {
        //TODO:return new connection
    }

    public void closeConnection(Connection connection) {
        //TODO:close or release connection
    }
}
