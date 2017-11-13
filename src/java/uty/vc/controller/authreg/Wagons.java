package uty.vc.controller.authreg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uty.vc.model.beans.DorXMLBean;
import uty.vc.model.beans.DorXMLBeanInterface;
import uty.vc.model.beans.KodPredXMLBean;
import uty.vc.model.beans.KodPredXMLBeanInterface;
import uty.vc.model.beans.SobsXMLBean;
import uty.vc.model.beans.SobsXMLBeanInterface;
import uty.vc.model.beans.WagonBean;
import uty.vc.model.beans.WagonBeanInterface;
import uty.vc.model.entities.nsi.DorXML;
import uty.vc.model.entities.nsi.KodPredXML;
import uty.vc.model.entities.nsi.SobsXML;
import uty.vc.model.entities.wagon.Wagon;

@WebServlet(name = "Wagons", urlPatterns = {"/wagons"})
public class Wagons extends HttpServlet {

    private final WagonBeanInterface wbi = new WagonBean();
    private final DorXMLBeanInterface dxbi = new DorXMLBean();
    private final KodPredXMLBeanInterface kpxbi = new KodPredXMLBean();
    private final SobsXMLBeanInterface sxbi = new SobsXMLBean();

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nvag = "";

        try {
            nvag = request.getParameter("nvag");
        } catch (Exception e) {
            System.out.println("что то с вагонами " + e);
        }

        Map<Integer, DorXML> md = dxbi.getAllDors();
        Map<Short, KodPredXML> mkd = kpxbi.getAllKodPred();
        Map<Integer, SobsXML> ms = sxbi.getAllSobs();

        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            List<Wagon> lw = wbi.getWagonsByNumbers(nvag);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
