package uty.vc.model.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import uty.vc.model.entities.nsi.KodPredXML;
import uty.vc.model.entities.nsi.SobsXML;

public class KodPredXMLBean implements KodPredXMLBeanInterface {

    Context ctxDB2;
    DataSource dsDB2 = null;

    public DataSource getDSDB2() {
        try {
            ctxDB2 = new InitialContext();
            dsDB2 = (DataSource) ctxDB2.lookup("java:jboss/datasources/db2WAGON");

        } catch (Exception ex) {
            Logger.getLogger(KodPredXMLBean.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("NamingException | SQLException ex--> " + ex);
        }
        return dsDB2;
    }

    public String getVersionDB() {
        String dbVersion = "";
        try {
            dbVersion = getDSDB2().getConnection().getMetaData().getDatabaseProductName();
        } catch (SQLException ex) {
            try {
                throw new SQLException(dbVersion);
            } catch (SQLException ex1) {
                Logger.getLogger(KodPredXMLBean.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(KodPredXMLBean.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQLException ex-|-> " + ex);
        }
        return dbVersion;
    }

    @Override
    public Map<Short, KodPredXML> getAllKodPred() {
        Map<Short, KodPredXML> ml = new HashMap<>();
        KodPredXML s = null;

        String query = "select kod, sname, dor_id "
                + "from asp2qb.kod_pred_xml";
        try (Connection conn = getDSDB2().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                s = new KodPredXML(rs.getShort("kod"), rs.getString("sname"), rs.getInt("dor_id"));
                ml.put(s.getKod(), s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KodPredXMLBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return ml;
    }

}
