/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.learnbyproject.service;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DBService {
    public static String DRIVER="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/cbooksocial?zeroDateTimeBehavior=CONVERT_TO_NULL";
    public static String USER="root";
    public static String PASSWORD="Guru@2003";
    private static final String DATE_PATTERN = "yyyy-MM-dd";
    public static Connection openConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cbooksocial?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Guru@2003");
            return c;
        } catch (ClassNotFoundException | SQLException ex) {
            out.println("Not Connected to Database");
        }
        return null;
    }
    
    public static String getFormattedDate(Date date) {
        return new SimpleDateFormat(DATE_PATTERN).format(date);
    }
    
    public static Date getFormattedDate(String date) throws ParseException{
        SimpleDateFormat sf = new SimpleDateFormat(DATE_PATTERN);
        java.util.Date parsedDate = sf.parse(date);
        return new Date(parsedDate.getTime());
    }
}
