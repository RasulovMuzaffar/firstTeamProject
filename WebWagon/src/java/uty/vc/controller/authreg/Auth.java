package uty.vc.controller.authreg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import uty.vc.model.beans.BeanInterface;
import uty.vc.model.beans.ClassBean;
import uty.vc.model.entities.User;
import uty.vc.utils.MD5Parser;
//import uty.vc.dbconn.DBConnectionLocal;

@WebServlet(name = "Auth", urlPatterns = {"/auth"})
public class Auth extends HttpServlet {

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

        String login = null;
        String password = null;
        try {
            login = request.getParameter("login");
            password = request.getParameter("password");
        } catch (Exception e) {
            System.out.println("проблема в авторизации " + e);
        }
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<body>");
//            out.println("<h1>Login: " + login + "</h1>");
//            out.println("<h1>Password: " + password + "</h1>");
//            try {
//                out.println("<h1>dbVersion: " + bi.getVersionDB() + "</h1>");
//            } catch (Exception e) {
//                System.out.println("EXCEPTION " + e);
//            }
//            out.println("<h1>USERS</h1>");
//            User u = new User();
            MD5Parser md5 = new MD5Parser();
            JSONObject obj = new JSONObject();
            User u = bi.getUserByLoginPass(login, md5.getMD5(password));
            System.out.println("u--> " + u);
            if (u != null) {
                obj.put("id", u.getId_user());
                obj.put("fName", u.getfName());
                obj.put("lName", u.getlName());
                obj.put("login", u.getLogin());
                obj.put("password", u.getPass());
                obj.put("eMail", u.getEmail());
                obj.put("idDolj", u.getId_dolj());
                obj.put("idSljb", u.getId_sljb());
                System.out.println("JSON obj -->> " + obj);
                out.print(obj);
                request.getSession().setAttribute("u", obj);
                request.getRequestDispatcher("index.jsp").forward(request, response);
//                out.println(new Gson().toJson(u));
            } else {
                out.println("NO!!!!");
            }

//            out.println("</body>");
//            out.println("</html>");
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