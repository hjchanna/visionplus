/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.visionplus.transaction.customer_payment;

import com.sv.visionplus.transaction.customer_payment.model.CustomerPaymentMix;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.logFile.LogFileDAO;

/**
 *
 * @author KAZA
 */
public class CustomerPaymentDAO {

    private static CustomerPaymentDAO INSTANCE;
    private final QueryUtil<CustomerPaymentMix> Query;
    private Connection connection;

    public static CustomerPaymentDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CustomerPaymentDAO();
        }

        return INSTANCE;
    }

    public CustomerPaymentDAO() {
        Query = QueryUtil.getInstance(CustomerPaymentMix.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    int saveCustomerPayment(CustomerPaymentMix mix) {
        System.out.println("mix");
        if (mix != null) {
            try {
                connection.setAutoCommit(false);
                int paymentId = TPaymentDAO.getInstance().savePayment(connection, mix.getPayment());
                if (paymentId > 0) {
                    System.out.println(paymentId);
                    mix.getCustomerPayment().setPayment(paymentId);
                    int id = TCustomerPaymentDAO.getInstance().saveCustomerPayment(connection, mix.getCustomerPayment());
                    if (id > 0) {
                        int saveLog = LogFileDAO.getInstance().saveLog(connection, mix.getLogFile());
                        if (saveLog > 0) {
                            System.out.println(saveLog);
                            if (mix.getStatus() != null) {
                                int statusId = StatusDAO.getInstance().saveStatus(connection, mix.getStatus());
                                if (statusId > 0) {
                                    int invoiceNo = InvoiceDAO.getInstance().updateStatus(connection, mix.getInvoice());
                                    if (invoiceNo > 0) {
                                        int accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                                        if (accId > 0) {
                                            System.out.println(2);
                                            mix.getAccountTransaction().setAccount(accId);
                                            int transactionId = AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());
                                            if (transactionId > 0) {
                                                System.out.println(3);
                                                connection.commit();
                                                return paymentId;
                                            } else {
                                                connection.rollback();
                                                return -1;
                                            }
                                        } else {
                                            connection.rollback();
                                            return -1;
                                        }
                                    } else {
                                        connection.rollback();
                                        return -1;
                                    }
                                } else {
                                    connection.rollback();
                                    return -1;
                                }
                            } else {
                                int accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                                if (accId > 0) {
                                    System.out.println(2);
                                    mix.getAccountTransaction().setAccount(accId);
                                    int transactionId = AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());
                                    if (transactionId > 0) {
                                        System.out.println(3);
                                        connection.commit();
                                        return paymentId;
                                    } else {
                                        connection.rollback();
                                        return -1;
                                    }
                                } else {
                                    connection.rollback();
                                    return -1;
                                }
                            }
                        } else {
                            connection.rollback();
                            return -1;
                        }
                    } else {
                        connection.rollback();
                        return -1;
                    }

                } else {
                    connection.rollback();
                    return -1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(CustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    connection.setAutoCommit(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerPaymentDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        return 0;
    }
}
