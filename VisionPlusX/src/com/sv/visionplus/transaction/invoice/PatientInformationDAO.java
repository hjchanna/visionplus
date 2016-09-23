package com.sv.visionplus.transaction.invoice;

import com.sv.visionplus.transaction.check_In.InvoiceItemDAO;
import com.sv.visionplus.transaction.invoice.model.InvoiceMix;
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
public class PatientInformationDAO {

    private static PatientInformationDAO INSTANCE;
    private final QueryUtil<TPatientInformation> Query;

    public static PatientInformationDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PatientInformationDAO();
        }

        return INSTANCE;
    }

    public PatientInformationDAO() {
        Query = QueryUtil.getInstance(TPatientInformation.class);
    }

    int savePatientInformation(Connection connection,TPatientInformation information) {
        int indexNo = 0;
        try {
            indexNo = Query.executeInsert(connection, information);
        } catch (SQLException ex) {
            Logger.getLogger(PatientInformationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return indexNo;
    }
}
