package uty.vc.controller.auth;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import uty.vc.model.beans.BeanInterface;
import uty.vc.model.beans.ClassBean;
import uty.vc.model.entities.User;
//import uty.vc.dbconn.DBConnectionLocal;

@WebServlet(name = "Auth", urlPatterns = {"/auth"})
public class Auth extends HttpServlet {

//    @EJB
//    private DBConnectionLocal dBConnection;
    private BeanInterface bi = new ClassBean();

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        Connection conDb2 = null;
//        try {
//            conDb2 = dBConnection.connect();
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(Auth.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//            conDb2.close();
//            dBConnection.closeCon();
//        } catch (SQLException ex) {
//            Logger.getLogger(Auth.class.getName()).log(Level.SEVERE, null, ex);
//        }

        String login = null;
        String password = null;
        try {
            login = request.getParameter("login");
            password = request.getParameter("password");
        } catch (Exception e) {
            System.out.println("проблема в авторизации " + e);
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Login: " + login + "</h1>");
            out.println("<h1>Password: " + password + "</h1>");
            try {
                out.println("<h1>dbVersion: " + bi.getVersionDB() + "</h1>");
            } catch (Exception e) {
                System.out.println("EXCEPTION " + e);
            }
            out.println("<h1>USERS</h1>");
//            User u = new User();
            User u = bi.getUserByLoginPass(login, password);
            if (u!=null) {
                out.println("<h1>User Name: " + u.getlName() + "</h1>");
            }else{
                out.println("NO!!!!");
            }
            out.println("</body>");
            out.println("</html>");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
