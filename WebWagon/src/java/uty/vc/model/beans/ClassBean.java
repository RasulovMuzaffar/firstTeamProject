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
import uty.vc.model.entities.Role;
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
            try {
                throw new SQLException(dbVersion);
            } catch (SQLException ex1) {
                Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQLException ex-|-> " + ex);
        }
        return dbVersion;
    }

    @Override
    public List<User> getAllUsers() {
        User u = new User();
        List<User> l = new ArrayList<>();

        String query = "select id, fam, name, login, pass, email, id_dolj, id_sljb, id_role from users";
        try (Connection conn = getDS().getConnection(); PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                u = new User(rs.getInt("id"), rs.getString("fam"),
                        rs.getString("name"), rs.getString("login"),
                        rs.getString("pass"), rs.getString("email"),
                        rs.getInt("id_dolj"), rs.getInt("id_sljb"),
                        rs.getInt("id_role"));
                l.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public User getUserByLoginPass(String login, String password) {
        User u = null;
        String query = "select id, fam, name, login, pass, email, id_dolj, id_sljb, id_role"
                + " from users where login=? and pass=?";

        try (Connection conn = getDS().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, login);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    u = new User(rs.getInt("id"), rs.getString("fam"),
                            rs.getString("name"), rs.getString("login"),
                            rs.getString("pass"), rs.getString("email"),
                            rs.getInt("id_dolj"), rs.getInt("id_sljb"),
                            rs.getInt("id_role"));
                }
            } catch (SQLException ex) {
//                throw new SQLException("Exception on the ResultSet getUserByLoginPass");
                Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        return u;
    }

    @Override
    public User getUserById(int id) {
        User u = null;
        String query = "select id, fam, name, login, pass, email, id_dolj, id_sljb, id_role"
                + " from users where id=?";
        try (Connection conn = getDS().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    u = new User(rs.getInt("id"), rs.getString("fam"),
                            rs.getString("name"), rs.getString("login"),
                            rs.getString("pass"), rs.getString("email"),
                            rs.getInt("id_dolj"), rs.getInt("id_sljb"),
                            rs.getInt("id_role"));

                }
            } catch (SQLException ex) {
//                throw new SQLException("Exception on the ResultSet getUserByLoginPass");
                Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return u;
    }

    @Override
    public String addUser(String fName, String lName, String login,
            String pass, String email, int idDolj, int idSljb, int idRole) {
        String query = "insert into users "
                + "(fam, name, login, pass, email, id_dolj, id_sljb, id_role) "
                + "values (?,?,?,?,?,?,?,?)";
        try (Connection conn = getDS().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, lName);
            pstmt.setString(2, fName);
            pstmt.setString(3, login);
            pstmt.setString(4, pass);
            pstmt.setString(5, email);
            pstmt.setInt(6, idDolj);
            pstmt.setInt(7, idSljb);
            pstmt.setInt(8, idRole);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
//                throw new SQLException("Exception on the ResultSet getUserByLoginPass");
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return "new user added!";
    }

    @Override
    public Role getRoleById(int idRole) {
        Role r = null;
        String query = "select id, role from role where id=?";
        try (Connection conn = getDS().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, idRole);
            try (ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    r = new Role(rs.getInt("id"), rs.getString("role"));
                }
            } catch (SQLException ex) {
//                throw new SQLException("Exception on the ResultSet getUserByLoginPass");
                Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return r;
    }

    @Override
    public String addUserByFailedAuth(String ip, String login, String password) {
        String query = "insert into log_err_auth "
                + "(ip, login, pass) "
                + "values (?,?,?)";
        try (Connection conn = getDS().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, ip);
            pstmt.setString(2, login);
            pstmt.setString(3, password);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
//                throw new SQLException("Exception on the ResultSet getUserByLoginPass");
            Logger.getLogger(ClassBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return "autorization is error!";
    }
}
