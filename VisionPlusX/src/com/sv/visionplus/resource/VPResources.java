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
    public static final String MASTER_USER = "icons/master/users.png";
    public static final String MASTER_ITEM = "icons/master/item.png";
    public static final String MASTER_BRANCH = "icons/master/branch.png";

    public static final String TRANSACTION_INVOICE = "icons/transaction/invoice.png";
    public static final String TRANSACTION_PAYMENT = "icons/transaction/payment.png";
    public static final String SUPPLIER_PAYMENT = "icons/transaction/supplier_payment.png";
    public static final String TRANSACTION_GRN = "icons/transaction/grn.png";
    public static final String TRANSACTION_CHECK = "icons/transaction/check.png";
    
    public static final String ACCOUNT_VOUCHER = "icons/account/voucher.png";
    public static final String ACCOUNT_MONEY = "icons/account/Z_money.png";

    public static final String STOCK_TRANSFER = "icons/stock/transfer.png";
    public static final String STOCK_ADJUST = "icons/stock/adjust.png";
    
    public static final String BACKUP_EXPORT = "icons/backup/export.png";
    public static final String BACKUP_IMPORT = "icons/backup/import.png";
    
    public static final String HOME_IMAGE = "icons/home/home.png";
   
    public static final String LOG_FILE = "icons/log/log.png";
    
    public static URL getImageUrl(String path) {
        return VPResources.class.getResource(path);
    }

}
