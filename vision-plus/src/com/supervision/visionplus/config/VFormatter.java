/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.visionplus.config;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mohan
 */
public class VFormatter {

    //formatters
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#,##0.00");
    private static final DecimalFormat INTEGER_FORMAT = new DecimalFormat("#,##0");
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    //singleton instance
    private static VFormatter INSTANCE;

    public static VFormatter getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new VFormatter();
        }

        return INSTANCE;
    }

    //functions
    public String formatDouble(Double d) {
        return DECIMAL_FORMAT.format(d);
    }

    public String formatInteger(Integer i) {
        return INTEGER_FORMAT.format(i);
    }

    public String formatDate(Date d) {
        return DATE_FORMAT.format(d);
    }

    public Double parseDouble(String s) throws ParseException {
        return (Double) DECIMAL_FORMAT.parse(s);
    }

    public Integer parseInteger(String s) throws ParseException {
        return (Integer) INTEGER_FORMAT.parse(s);
    }

    public Date parseDate(String s) throws ParseException {
        return (Date) DATE_FORMAT.parse(s);
    }

}
