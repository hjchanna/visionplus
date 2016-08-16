/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.config;

import com.supervision.visionplus.dao.IDGeneraterDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C_KASA
 */
public class IDGenerator {

    public static int getNewId(String tableName, String columnName) {

        Integer lastId;
        try {
            lastId = IDGeneraterDao.getInstance().getLastId(tableName, columnName);
        } catch (SQLException ex) {
            Logger.getLogger(IDGenerator.class.getName()).log(Level.SEVERE, null, ex);
            lastId = 0;
        }

        return lastId++;
    }
}
