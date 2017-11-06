/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uty.vc.dbconn;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class JNDIConnection implements DB{

    @Override
    public Connection getJNDIConn() {
        Context ctx = null;
        Connection conn = null;
        try {
            ctx = new InitialContext();
            conn = ((DataSource) ctx.lookup("mysqlREST")).getConnection();
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(JNDIConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ctx.close();
            } catch (NamingException ex) {
                Logger.getLogger(JNDIConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }
}
