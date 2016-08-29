/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx.controller;

import com.sv.visionplus.master.item.brand.model.MBrand;
import com.sv.visionplus.util.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.model.MUser;

/**
 *
 * @author Mohan
 */
public class SystemService {

    private SystemDAO systemDAO;

    private static SystemService INSTANCE;

    public static SystemService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SystemService();
        }

        return INSTANCE;
    }

    private SystemService() {
        this.systemDAO = SystemDAO.getInstance();
    }

    //functions
    public MUser login(String username, String password) {
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();

            MUser user = systemDAO.login(connection, username, password);
            return user;

        } catch (SQLException ex) {
            Logger.getLogger(SystemService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<MUser> listUser() {
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            return systemDAO.listUsers(connection);
        } catch (SQLException e) {
            return Collections.emptyList();
        }
    }
    public List<MBrand> listBrand() {
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            return systemDAO.listBrand(connection);
        } catch (SQLException e) {
            return Collections.emptyList();
        }
    }

}
