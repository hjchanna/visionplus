/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.service;

import com.supervision.visionplus.model.TGrnItem;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016 Time : 2:12:10 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface GrnDetailService {

    public boolean addGrnDetails(TGrnItem grn);

    public boolean updateGrnDetails(TGrnItem grn);

    public ArrayList<TGrnItem> searchGrnDetails(String id);

    public ArrayList<TGrnItem> getAllGrnDetails();
}
