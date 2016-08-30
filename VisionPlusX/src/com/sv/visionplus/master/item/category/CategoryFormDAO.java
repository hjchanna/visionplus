package com.sv.visionplus.master.item.category;

import com.sv.visionplus.util.database.QueryUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale.Category;

/**
 * Date : Aug 29, 2016 Time : 7:15:28 PM
 *
 * @copyright : INCOSYZ
 * @author Nidura Prageeth
 */
public class CategoryFormDAO {

    public static CategoryFormDAO INSTANCE;
    private QueryUtil<MCategory> queryUtil;

    public static CategoryFormDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CategoryFormDAO();
        }
        return INSTANCE;
    }

    public CategoryFormDAO() {
        this.queryUtil = QueryUtil.getInstance(MCategory.class);
    }

    public int save(Connection connection, MCategory category) throws SQLException {
        int executeInsert = queryUtil.executeInsert(connection, category);
        return executeInsert;
    }

    public List<MCategory> getAllCategory(Connection connection) throws SQLException {
        return queryUtil.executeSelect(connection);
    }
}
