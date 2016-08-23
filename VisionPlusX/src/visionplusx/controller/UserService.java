/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visionplusx.controller;

import java.sql.SQLException;
import visionplusx.model.MUser;

/**
 * Date : Aug 23, 2016
 * Time : 12:07:12 PM
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface UserService {
    
    public MUser checkUser(String usernam, String password) throws SQLException;

}
