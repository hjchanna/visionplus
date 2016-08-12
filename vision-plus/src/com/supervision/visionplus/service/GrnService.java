/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.service;

import com.supervision.visionplus.model.TGrn;
import java.util.ArrayList;

/**
 * Date : Aug 12, 2016 Time : 2:07:00 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public interface GrnService {

    public boolean addGrn(TGrn grn);

    public boolean updateGrn(TGrn grn);

    public ArrayList<TGrn> searchGrn(String id);

    public ArrayList<TGrn> getAllGrn();

}
