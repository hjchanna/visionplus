package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.check_In.InvoiceItemDAO;
import com.sv.visionplus.transaction.invoice.model.InvoiceMix;
import com.sv.visionplus.transaction.invoice.model.Status;
import com.sv.visionplus.transaction.invoice.model.TPatientInformation;
import com.sv.visionplus.util.database.DatabaseUtil;
import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohan
 */
public class StatusDAO {

    private static StatusDAO INSTANCE;
    private final QueryUtil<Status> Query;

    public static StatusDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StatusDAO();
        }

        return INSTANCE;
    }

    public StatusDAO() {
        Query = QueryUtil.getInstance(Status.class);
    }

    int saveStatus(Connection connection,Status status) {
        int indexNo = 0;
        try {
            indexNo = Query.executeInsert(connection, status);
        } catch (SQLException ex) {
            Logger.getLogger(StatusDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return indexNo;
    }
}
