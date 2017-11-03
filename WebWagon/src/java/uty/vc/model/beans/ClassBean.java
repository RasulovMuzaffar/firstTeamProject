package uty.vc.model.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import uty.vc.controller.auth.Auth;
import uty.vc.model.entities.User;

public class ClassBean implements BeanInterface {

    Context ctx;
    DataSource ds = null;

    @Override
    public DataSource getDS() {
        try {
            ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("java:jboss/datasources/mysqlWAGON");

        } catch (NamingException ex) {
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("NamingException | SQLException ex--> " + ex);
        }
        return ds;
    }

    @Override
    public String getVersionDB() {
        String dbVersion = "";
        try {
            dbVersion = getDS().getConnection().getMetaData().getDatabaseProductVersion();
        } catch (SQLException ex) {
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQLException ex-|-> " + ex);
        }
        return dbVersion;
    }

    @Override
    public List<User> getAllUsers() {
        User u = new User();
        List<User> l = new ArrayList<>();

        String query = "select id, fam, name, login, pass, email, id_dolj, id_sljb from users";
        try (Connection conn = getDS().getConnection(); PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                u = new User(rs.getInt("id"), rs.getString("fam"),
                        rs.getString("name"), rs.getString("login"),
                        rs.getString("pass"), rs.getString("email"),
                        rs.getInt("id_dolj"), rs.getInt("id_sljb"));
                l.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    public User getUserByLoginPass(String login, String password) {
        User u = new User();
        String query = "select id, fam, name, login, pass, email, id_dolj, id_sljb"
                + " from users where login=? and pass=?";
        try (Connection conn = getDS().getConnection(); PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery()) {
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            while (rs.next()) {
                u = new User(rs.getInt("id"), rs.getString("fam"),
                        rs.getString("name"), rs.getString("login"),
                        rs.getString("pass"), rs.getString("email"),
                        rs.getInt("id_dolj"), rs.getInt("id_sljb"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return u;
    }

    @Override
    public User getUserById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
