/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.resource;

import java.net.URL;

/**
 *
 * @author Mohan
 */
public class VPResources {

    public static final String MASTER_CUSTOMER = "icons/master/customer.png";
    public static final String MASTER_SUPPLIER = "icons/master/supplier.png";
    public static final String MASTER_USER = "icons/master/user.png";
    public static final String MASTER_ITEM = "icons/master/item.png";

    public static URL getImageUrl(String path) {
        return VPResources.class.getResource(path);
    }

}
