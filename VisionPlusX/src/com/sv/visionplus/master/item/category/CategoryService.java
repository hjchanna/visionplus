/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sv.visionplus.master.item.category;

import com.sv.visionplus.system.exception.VPException;
import com.sv.visionplus.util.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Date : Aug 29, 2016
 * Time : 7:15:54 PM
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class CategoryService {

     public static CategoryService INSTANCE;

    public static CategoryService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CategoryService();
        }
        return INSTANCE;
    }

    public CategoryService() {

    }

    public int save(MCategory category){
        int save = 0;
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
            save = CategoryFormDAO.getInstance().save(connection, category);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return save;
    }

    public List<MCategory> getAllCategory() {
        List<MCategory> allCategory=new ArrayList<>();
        try {
            Connection connection = DatabaseUtil.getInstance().openConnection();
             allCategory = CategoryFormDAO.getInstance().getAllCategory(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allCategory;
    }

}
