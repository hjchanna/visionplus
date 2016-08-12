/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.service;

import java.util.ArrayList;

/**
 * Date : Aug 12, 2016 Time : 2:12:10 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface GrnDetailService {

    public boolean addGrnDetails(Object object);

    public boolean updateGrnDetails(Object object);

    public ArrayList<Object> searchGrnDetails(String id);

    public ArrayList<Object> getAllGrnDetails();
}
