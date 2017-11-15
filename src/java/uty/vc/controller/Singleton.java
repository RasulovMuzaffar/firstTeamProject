package uty.vc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import uty.vc.model.beans.UserBean;

public class Singleton {

    private static Singleton ourInstance;
    public static Context ctx;
    public static DataSource ds = null;

    public static Context ctxDB2;
    public static DataSource dsDB2 = null;

    public static void getOurInstance() {

        if (ourInstance == null) {
            try {
                ctx = new InitialContext();
                ds = (DataSource) ctx.lookup("java:jboss/datasources/mysqlWAGON");
                ctxDB2 = new InitialContext();
                dsDB2 = (DataSource) ctxDB2.lookup("java:jboss/datasources/db2WAGON");
                ourInstance = new Singleton();
            } catch (NamingException ex) {
                Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//
//    public DataSource getDS() {
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        try {
//            ctx = new InitialContext();
//            ds = (DataSource) ctx.lookup("java:jboss/datasources/mysqlWAGON");
//
//        } catch (NamingException ex) {
//            Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("NamingException | SQLException ex--> " + ex);
//        }
//        return ds;
//    }

//    public DataSource getDSDB2() {
//        try {
//            ctxDB2 = new InitialContext();
//            dsDB2 = (DataSource) ctxDB2.lookup("java:jboss/datasources/db2WAGON");
//
//        } catch (Exception ex) {
//            Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("NamingException | SQLException ex--> " + ex);
//        }
//        return dsDB2;
//    }
//    public Connection getConnection() {
//        try {
//            return ds.getConnection();
//        } catch (SQLException ex) {
//            Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
}
