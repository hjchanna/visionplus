package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.check_In.InvoiceItemDAO;
import com.sv.visionplus.transaction.invoice.model.InvoiceMix;
import com.sv.visionplus.transaction.invoice.model.TInvoice;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import visionplusx.logFile.LogFileDAO;

/**
 *
 * @author Mohan
 */
public class InvoiceDAO {

    private static InvoiceDAO INSTANCE;
    private final QueryUtil<TInvoice> Query;
    private Connection connection;

    public static InvoiceDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InvoiceDAO();
        }

        return INSTANCE;
    }

    public InvoiceDAO() {
        Query = QueryUtil.getInstance(TInvoice.class);
        try {
            connection = DatabaseUtil.getInstance().openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int saveInvoice(InvoiceMix mix) {
        try {
            connection.setAutoCommit(false);
            try {
                int invoiceId = InvoiceDAO.getInstance().saveOnlyInvoice(connection, mix.getInvoice());
                mix.getPatientInformation().setInvoice(invoiceId);
                if (invoiceId > 0) {
                    int infoId = PatientInformationDAO.getInstance().savePatientInformation(connection, mix.getPatientInformation());
                    mix.getStatus().setInvoice(invoiceId);
                    if (infoId > 0) {
                        int statusId = StatusDAO.getInstance().saveStatus(connection, mix.getStatus());

                        if (statusId > 0) {
                            int logId = LogFileDAO.getInstance().saveLog(connection, mix.getLogFile());
                            if (logId > 0) {

                                boolean items = InvoiceItemService.getInstance().saveItem(connection, mix.getInvoiceItem(), invoiceId);
                                if (items) {
                                    boolean saveStockLedger = StockLedgerService.getInstance().saveStockLedger(connection, mix.getStockLedgerList());
                                    if (saveStockLedger) {
                                        int paymentId = TPaymentDAO.getInstance().savePayment(connection, mix.getPayment());
                                        if (paymentId > 0) {
                                            mix.getCustomerPayment().setInvoice(invoiceId);
                                            mix.getCustomerPayment().setPayment(paymentId);
                                            int customerDetail = TCustomerPaymentDAO.getInstance().savePaymentDetail(connection, mix.getCustomerPayment());
                                            if (customerDetail > 0) {
                                                int paymentLog = LogFileDAO.getInstance().saveLog(connection, mix.getPaymentLog());
                                                if (paymentLog > 0) {
                                                    int accId = MAccountDAO.getInstance().saveAccount(connection, mix.getAccount());
                                                    if (accId > 0) {
                                                        mix.getAccountTransaction().setAccount(accId);
                                                        int transactionId = AccountTransactionDAO.getInstance().saveTransaction(connection, mix.getAccountTransaction());
                                                        if (transactionId > 0) {
                                                            connection.commit();
                                                            return invoiceId;
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
            } finally {
                connection.setAutoCommit(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int saveOnlyInvoice(Connection connection, TInvoice invoice) {
        int indexNo = 0;
        try {
            indexNo = Query.executeInsert(connection, invoice);
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return indexNo;

    }
}
