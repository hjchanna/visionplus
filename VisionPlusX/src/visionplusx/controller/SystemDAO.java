/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visionplusx.controller;

import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import visionplusx.model.MUser;

/**
 *
 * @author Mohan
 */
public class SystemDAO {

    private static SystemDAO INSTANCE;

    public static SystemDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SystemDAO();
        }

        return INSTANCE;
    }

    public MUser login(Connection connection, String username, String password) throws SQLException {
        QueryUtil<MUser> loginQueryUtil = QueryUtil.getInstance(MUser.class);
        return loginQueryUtil.executeUniqueSelect(connection, "user_name=? AND password=?", username, password);
    }

}
