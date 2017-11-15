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
import org.json.simple.JSONObject;
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
        
        List<Wagon> lw = wbi.getWagonsByNumbers(nvag);

        JSONObject obj = new JSONObject();

        for (Wagon w : lw) {
            mkd.containsKey(w.getZav());
            mkd.containsKey(w.getMestDep());
            mkd.containsKey(w.getMestKap());
            ms.containsKey(w.getPred());

            obj.put("nvag", w.getnVag());
            obj.put("datePost", w.getDatePost());
            for (Map.Entry<Short, KodPredXML> o : mkd.entrySet()) {
                if (o.getKey().equals(w.getZav())) {
                    obj.put("zavKod", o.getValue().getKod());
                    obj.put("zavSName", o.getValue().getsName());
                }
                if (o.getKey().equals(w.getMestDep())) {
                    obj.put("mestDepKod", o.getValue().getKod());
                    obj.put("mestDepSName", o.getValue().getsName());
                    obj.put("mestDepDorId", o.getValue().getDorId());
                }
                if (o.getKey().equals(w.getMestKap())) {
                    obj.put("mestKapKod", o.getValue().getKod());
                    obj.put("mestKapSName", o.getValue().getsName());
                    obj.put("mestKapDorId", o.getValue().getDorId());
                }
            }
            for (Map.Entry<Integer, SobsXML> o : ms.entrySet()) {
                if (o.getKey().equals(w.getPred())) {
                    obj.put("kodSobs", o.getValue().getKodSob());
                    obj.put("sNameSobs", o.getValue().getsName());
                }
            }
            obj.put("tip", w.getTip());
            obj.put("modelKod", w.getModelKod());
            obj.put("model", w.getModel());
            obj.put("rod", w.getRod());
            obj.put("nZav", w.getnZav());
            obj.put("tara", w.getTara());
            obj.put("gruzP", w.getGruzP());
            obj.put("dlina", w.getDlina());
            obj.put("gab", w.getGab());
            obj.put("matKuz", w.getMatKuz());
            obj.put("vozd", w.getVozD());
            obj.put("aregRp", w.getAregRp());
            obj.put("rycPer", w.getRycPer());
            obj.put("aregim", w.getAregim());
            obj.put("rTorm", w.getrTorm());
            obj.put("tipAvs", w.getTipAvs());
            obj.put("tipPogl", w.getTipPogl());
            obj.put("buf", w.getBuf());
            obj.put("teleg", w.getTeleg());
            obj.put("bal", w.getBal());
            obj.put("tipKotl", w.getTipKotl());
            obj.put("sliv", w.getSliv());
            obj.put("rama", w.getRama());
            obj.put("uklon", w.getUklon());
            obj.put("nVagS", w.getnVagS());
            obj.put("datePr", w.getDatePr());
            obj.put("dateRemPr", w.getDateRemPr());
            obj.put("vidSlr", w.getVidSlr());
            obj.put("dateSlr", w.getDateSlr());
            obj.put("dateDep", w.getDateDep());
            obj.put("dateKap", w.getDateKap());
            obj.put("porog", w.getPorog());
            obj.put("razrPrb", w.getRazrPrb());
            obj.put("kmNorm", w.getKmNorm());
            obj.put("kmPrb", w.getKmPrb());
            obj.put("kmGr", w.getKmGr());
            obj.put("wes", w.getWes());
            obj.put("sob", w.getSob());
            obj.put("dorPrip", w.getDorPrip());
            obj.put("stanPrip", w.getStanPrip());
            obj.put("depoPrip", w.getDepoPrip());
            obj.put("datePReg", w.getDatePReg());
            obj.put("sobA", w.getSobA());
            obj.put("predA", w.getPredA());
            obj.put("dorPripA", w.getDorPripA());
            obj.put("stanPripA", w.getStanPripA());
            obj.put("dateAK", w.getDateAK());
            obj.put("sobIskl", w.getSobIskl());
            obj.put("dorIskl", w.getDorIskl());
            obj.put("depoIskl", w.getDepoIskl());
            obj.put("stanIskl", w.getStanIskl());
            obj.put("pricIskl", w.getPricIskl());
            obj.put("timeIskl", w.getTimeIskl());
            obj.put("dateAkt", w.getDateAkt());
            obj.put("dateVost", w.getDateVost());
            obj.put("dorVost", w.getDorVost());
            obj.put("datc", w.getDatC());
            obj.put("poligon", w.getPoligon());
            obj.put("zKur", w.getzKur());
            obj.put("arRZD", w.getArRzd());
            obj.put("prod", w.getProd());
            obj.put("smgs", w.getSmgs());

        }

        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.print(obj);
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
