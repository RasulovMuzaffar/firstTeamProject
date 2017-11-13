package uty.vc.controller.authreg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import uty.vc.model.beans.UserBean;
import uty.vc.model.entities.user.User;
import uty.vc.utils.MD5Parser;
import uty.vc.model.beans.UserBeanInterface;

@WebServlet(name = "Reg", urlPatterns = {"/reg"})
public class Reg extends HttpServlet {

    private final UserBeanInterface bi = new UserBean();

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String fName = null;
        String lName = null;
        String login = null;
        String password = null;
        String eMail = null;
        int idDolj = 0;
        int idSljb = 0;
        int idRole = 0;
        try {
            fName = request.getParameter("fName");
            lName = request.getParameter("lName");
            login = request.getParameter("login");
            password = request.getParameter("password");
            eMail = request.getParameter("eMail");
            idDolj = Integer.parseInt(request.getParameter("idDolj"));
            idSljb = Integer.parseInt(request.getParameter("idSljb"));
            idRole = Integer.parseInt(request.getParameter("idRole"));
        } catch (Exception e) {
            System.out.println("проблема в авторизации " + e);
        }
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            MD5Parser md5 = new MD5Parser();
            JSONObject obj = new JSONObject();
            bi.addUser(fName, lName, login, md5.getMD5(password), eMail, idDolj, idSljb, idRole);
            User u = bi.getUserByLoginPass(login, md5.getMD5(password));
            System.out.println("u--> " + u);
            if (u != null) {
                obj.put("id", u.getIdUser());
                obj.put("fName", u.getfName());
                obj.put("lName", u.getlName());
                obj.put("login", u.getLogin());
                obj.put("password", u.getPass());
                obj.put("eMail", u.getEmail());
                obj.put("idDolj", u.getIdDolj());
                obj.put("idSljb", u.getIdSljb());
                obj.put("idRole", u.getIdRole());
                System.out.println("JSON obj -->> " + obj);
                out.println("new user is added!");
                out.print(obj);
//                request.getSession().setAttribute("u", obj);

//                request.getRequestDispatcher("index.jsp").forward(request, response);
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
