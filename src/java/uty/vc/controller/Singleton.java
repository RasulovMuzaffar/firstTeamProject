//package uty.vc.controller;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;
//import uty.vc.model.beans.UserBean;
//
//public class Singleton {
//
//    private static Singleton ourInstance;
// 
//
//    public static Singleton getOurInstance() {
//        System.out.println(" ----------------------------------------- com.Singleton.getOurInstance() старт начало");
//        if (ourInstance == null) {
//            ourInstance = new Singleton();
//        }
//        System.out.println(" ----------------------------------------- com.Singleton.getOurInstance() старт конец ");
//        return ourInstance;
//    }
//    
//    public static Context ctx;
//    public static DataSource ds = null;
//
//    public static Context ctxDB2;
//    public static DataSource dsDB2 = null;
//
//    public DataSource getDS() {
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
//
//    public DataSource getDSDB2() {
//        try {
//            ctxDB2 = new InitialContext();
//            dsDB2 = (DataSource) ctxDB2.lookup("java:jboss/datasources/db2WAGON");
//
//        } catch (Exception ex) {
//            Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("NamingException | SQLException ex--> " + ex);
//        }
//        return dsDB2;
//    }
//}
