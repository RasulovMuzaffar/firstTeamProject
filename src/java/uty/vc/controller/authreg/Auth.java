package uty.vc.controller.authreg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import uty.vc.controller.Singleton;
import uty.vc.model.beans.UserBean;
import uty.vc.model.entities.user.Role;
import uty.vc.model.entities.user.User;
import uty.vc.utils.MD5Parser;
import uty.vc.model.beans.UserBeanInterface;
import uty.vc.model.beans.WagonBean;
import uty.vc.model.beans.WagonBeanInterface;
import uty.vc.model.entities.wagon.Wagon;

@WebServlet(name = "Auth", urlPatterns = {"/auth"})
public class Auth extends HttpServlet {

    private UserBeanInterface ubi = new UserBean();
    private WagonBeanInterface wbi = new WagonBean();

    public void init(ServletConfig config) throws ServletException {
        Singleton.getOurInstance();
        super.init(config);
    }

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

        String ip = null;
        String login = null;
        String password = null;
        try {
//            ip = request.getParameter("ip");
            login = request.getParameter("username");
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
//                out.println("<h1>dbVersion: " + ubi.getVersionDB() + "</h1>");
//            } catch (Exception e) {
//                System.out.println("EXCEPTION " + e);
//            }
//            out.println("<h1>USERS</h1>");
//            User u = new User();
            MD5Parser md5 = new MD5Parser();
            JSONObject obj = new JSONObject();
            System.out.println("Ds >--->>-> " + ubi.getVersionDB());

//            List<Wagon> lw = wbi.getAllWagons();
//            System.out.println("------>>> "+lw.size());
//            for (Wagon w : lw) {
//                System.out.println(w.toString());
//            }
//            String s = "77891398, 76710227, 76710235,62768569, 62768577, 62768585, 62768601, 62768619,      62768643,62768676,11111111";
//            
//            List<Wagon> lw1 = wbi.getWagonsByNumbers(s);
//            for (Wagon w : lw1) {
//                System.out.println(w.toString());
//            }
            User u = ubi.getUserByLoginPass(login, md5.getMD5(password));
            if (u != null) {
                Role r = ubi.getRoleById(u.getIdRole());
                if (r != null) {

                    switch (r.getRole()) {
                        case "admin":
                            request.getRequestDispatcher("adminPage.jsp").forward(request, response);
                            break;
                        case "user":
                            request.getRequestDispatcher("userPage.jsp").forward(request, response);
                            break;
                    }
                }
            } //            System.out.println("u--> " + u);
            //            if (u != null) {
            //                obj.put("id", u.getIdUser());
            //                obj.put("fName", u.getfName());
            //                obj.put("lName", u.getlName());
            //                obj.put("login", u.getLogin());
            //                obj.put("password", u.getPass());
            //                obj.put("eMail", u.getEmail());
            //                obj.put("idDolj", u.getIdDolj());
            //                obj.put("idSljb", u.getIdSljb());
            //                System.out.println("JSON obj -->> " + obj);
            //                out.print(obj);
            //                request.getSession().setAttribute("u", obj);
            //                request.getRequestDispatcher("index.jsp").forward(request, response);
            ////                out.println(new Gson().toJson(u));
            else {
                ip = request.getRemoteHost();
                ubi.addUserByFailedAuth(ip, login, password);
                out.println("I cannot find !!!!");
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
