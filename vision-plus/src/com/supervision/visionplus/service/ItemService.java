/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.service;

import com.supervision.visionplus.model.MItem;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016 Time : 12:42:52 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface ItemService {

    public boolean addItems(MItem item);

    public boolean deleteItems(String id);

    public boolean updateItems(MItem item);

    public ArrayList<MItem> searchItems(String id);

    public ArrayList<MItem> getAllItems();

}
