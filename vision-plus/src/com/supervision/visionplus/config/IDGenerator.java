/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.config;

import com.supervision.visionplus.dao.IDGeneraterDao;
import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author C_KASA
 */
public class IDGenerator {
    
    public static String getNewId(String tableName, String columnName) throws ClassNotFoundException, SQLException {
        String lastId = IDGeneraterDao.getInstance().getLastId(tableName, columnName);
        int id=1;
        if (lastId != null) {
            id = Integer.parseInt(lastId);
            id++;
        }
        return id+"";
    }
}
