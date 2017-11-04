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

@WebServlet(name = "Reg", urlPatterns = {"/reg"})
public class Reg extends HttpServlet {
    private final BeanInterface bi = new ClassBean();

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
        try {
            fName = request.getParameter("fName");
            lName = request.getParameter("lName");
            login = request.getParameter("login");
            password = request.getParameter("password");
            eMail = request.getParameter("eMail");
        } catch (Exception e) {
            System.out.println("проблема в авторизации " + e);
        }
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

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
