package uty.vc.model.beans;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import uty.vc.model.entities.wagon.Wagon;

public class WagonBean implements WagonBeanInterface {

    Context ctxDB2;
    DataSource dsDB2 = null;

    public DataSource getDSDB2() {
        try {
            ctxDB2 = new InitialContext();
            dsDB2 = (DataSource) ctxDB2.lookup("java:jboss/datasources/db2WAGON");

        } catch (Exception ex) {
            Logger.getLogger(WagonBean.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("NamingException | SQLException ex--> " + ex);
        }
        return dsDB2;
    }

    @Override
    public String getVersionDB() {
        String dbVersion = "";
        try {
            dbVersion = getDSDB2().getConnection().getMetaData().getDatabaseProductName();
        } catch (SQLException ex) {
            try {
                throw new SQLException(dbVersion);
            } catch (SQLException ex1) {
                Logger.getLogger(WagonBean.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(WagonBean.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQLException ex-|-> " + ex);
        }
        return dbVersion;
    }

//nvag
//date_post
//zav
//tip
//model_kod
//model
//rod
//nzav
//tara
//gruzp
//dlina
//gab
//mat_kuz
//vozd
//areg_rp
//ryc_per
//aregim
//r_torm
//tip_avs
//tip_pogl
//buf
//teleg
//bal
//tip_kotl
//sliv
//rama
//uklon
//nvag_s
//date_pr
//date_rem_pr
//vid_slr
//date_slr
//mest_dep
//date_dep
//mest_kap
//date_kap
//porog
//razr_prb
//km_norm
//km_prb
//km_gr
//wes
//sob
//pred
//dor_prip
//stan_prip
//depo_prip
//date_p_reg
//sob_a
//pred_a
//dor_prip_a
//stan_prip_a
//date_a_k
//sob_iskl
//dor_iskl
//depo_iskl
//stan_iskl
//pric_iskl
//time_iskl
//date_akt
//date_vost
//dor_vost
//datc
//poligon
//z_kur
//prz_sob
//ar_rzd
//prod
//smgs
    @Override
    public Wagon getWagonByNumber(int nvag) {
        Wagon w = null;

        String query = "select "
                + "nvag, date_post, zav, tip, model_kod, model, "
                + "rod, nzav, tara, gruzp, dlina, gab, mat_kuz, "
                + "vozd, areg_rp, ryc_per, aregim, r_torm, tip_avs, "
                + "tip_pogl, buf, teleg, bal, tip_kotl, sliv, rama, "
                + "uklon, nvag_s, date_pr, date_rem_pr, vid_slr, date_slr, "
                + "mest_dep, date_dep, mest_kap, date_kap, porog, razr_prb, "
                + "km_norm, km_prb, km_gr, wes, sob, pred, dor_prip, stan_prip, "
                + "depo_prip, date_p_reg, sob_a, pred_a, dor_prip_a, stan_prip_a, "
                + "date_a_k, sob_iskl, dor_iskl, depo_iskl, stan_iskl, pric_iskl, "
                + "time_iskl, date_akt, date_vost, dor_vost, datc, poligon, "
                + "z_kur, prz_sob, ar_rzd, prod, smgs "
                + "from vagon where nvag=?";
        try (Connection conn = getDSDB2().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, nvag);
            try (ResultSet rs = pstmt.executeQuery()) {

                while (rs.next()) {
                    w = new Wagon(rs.getInt("nvag"), rs.getDate("date_post"),
                            rs.getShort("zav"), rs.getShort("tip"), rs.getShort("model_kod"),
                            rs.getString("model"), rs.getShort("rod"), rs.getString("nzav"),
                            rs.getShort("tara"), rs.getShort("gruzp"), rs.getInt("dlina"),
                            rs.getShort("gab"), rs.getShort("mat_kuz"), rs.getShort("vozd"),
                            rs.getShort("areg_rp"), rs.getString("ryc_per"), rs.getString("aregim"),
                            rs.getShort("r_torm"), rs.getShort("tip_avs"), rs.getShort("tip_pogl"),
                            rs.getString("buf"), rs.getShort("teleg"), rs.getString("bal"),
                            rs.getShort("tip_kotl"), rs.getString("sliv"), rs.getShort("rama"),
                            rs.getString("uklon"), rs.getInt("nvag_s"), rs.getDate("date_pr"),
                            rs.getDate("date_rem_pr"), rs.getString("vid_slr"), rs.getDate("date_slr"),
                            rs.getShort("mest_dep"), rs.getDate("date_dep"), rs.getShort("mest_kap"),
                            rs.getDate("date_kap"), rs.getShort("porog"), rs.getString("razr_prb"),
                            rs.getInt("km_norm"), rs.getInt("km_prb"), rs.getInt("km_gr"),
                            rs.getShort("wes"), rs.getShort("sob"), rs.getInt("pred"),
                            rs.getShort("dor_prip"), rs.getInt("stan_prip"), rs.getShort("depo_prip"),
                            rs.getDate("date_p_reg"), rs.getShort("sob_a"), rs.getInt("pred_a"),
                            rs.getShort("dor_prip_a"), rs.getInt("stan_prip_a"), rs.getDate("date_a_k"),
                            rs.getShort("sob_iskl"), rs.getShort("dor_iskl"), rs.getShort("depo_iskl"),
                            rs.getInt("stan_iskl"), rs.getShort("pric_iskl"), rs.getTimestamp("time_iskl"),
                            rs.getDate("date_akt"), rs.getDate("date_vost"), rs.getShort("dor_vost"),
                            rs.getString("datc"), rs.getShort("poligon"), rs.getString("z_kur"),
                            rs.getDouble("prz_sob"), rs.getString("ar_rzd"), rs.getString("prod"), rs.getString("smgs"));

                }
            } catch (SQLException ex) {
//                throw new SQLException("Exception on the ResultSet getUserByLoginPass");
                Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(WagonBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return w;
    }

    @Override
    public List<Wagon> getAllWagons() {
        List<Wagon> lw = new ArrayList<>();
        Wagon w = null;

        String query = "select "
                + "nvag, date_post, zav, tip, model_kod, model, "
                + "rod, nzav, tara, gruzp, dlina, gab, mat_kuz, "
                + "vozd, areg_rp, ryc_per, aregim, r_torm, tip_avs, "
                + "tip_pogl, buf, teleg, bal, tip_kotl, sliv, rama, "
                + "uklon, nvag_s, date_pr, date_rem_pr, vid_slr, date_slr, "
                + "mest_dep, date_dep, mest_kap, date_kap, porog, razr_prb, "
                + "km_norm, km_prb, km_gr, wes, sob, pred, dor_prip, stan_prip, "
                + "depo_prip, date_p_reg, sob_a, pred_a, dor_prip_a, stan_prip_a, "
                + "date_a_k, sob_iskl, dor_iskl, depo_iskl, stan_iskl, pric_iskl, "
                + "time_iskl, date_akt, date_vost, dor_vost, datc, poligon, "
                + "z_kur, prz_sob, ar_rzd, prod, smgs "
                + "from asp2qb.vagon fetch first 10 rows only";
        try (Connection conn = getDSDB2().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                w = new Wagon(rs.getInt("nvag"), rs.getDate("date_post"),
                        rs.getShort("zav"), rs.getShort("tip"), rs.getShort("model_kod"),
                        rs.getString("model"), rs.getShort("rod"), rs.getString("nzav"),
                        rs.getShort("tara"), rs.getShort("gruzp"), rs.getInt("dlina"),
                        rs.getShort("gab"), rs.getShort("mat_kuz"), rs.getShort("vozd"),
                        rs.getShort("areg_rp"), rs.getString("ryc_per"), rs.getString("aregim"),
                        rs.getShort("r_torm"), rs.getShort("tip_avs"), rs.getShort("tip_pogl"),
                        rs.getString("buf"), rs.getShort("teleg"), rs.getString("bal"),
                        rs.getShort("tip_kotl"), rs.getString("sliv"), rs.getShort("rama"),
                        rs.getString("uklon"), rs.getInt("nvag_s"), rs.getDate("date_pr"),
                        rs.getDate("date_rem_pr"), rs.getString("vid_slr"), rs.getDate("date_slr"),
                        rs.getShort("mest_dep"), rs.getDate("date_dep"), rs.getShort("mest_kap"),
                        rs.getDate("date_kap"), rs.getShort("porog"), rs.getString("razr_prb"),
                        rs.getInt("km_norm"), rs.getInt("km_prb"), rs.getInt("km_gr"),
                        rs.getShort("wes"), rs.getShort("sob"), rs.getInt("pred"),
                        rs.getShort("dor_prip"), rs.getInt("stan_prip"), rs.getShort("depo_prip"),
                        rs.getDate("date_p_reg"), rs.getShort("sob_a"), rs.getInt("pred_a"),
                        rs.getShort("dor_prip_a"), rs.getInt("stan_prip_a"), rs.getDate("date_a_k"),
                        rs.getShort("sob_iskl"), rs.getShort("dor_iskl"), rs.getShort("depo_iskl"),
                        rs.getInt("stan_iskl"), rs.getShort("pric_iskl"), rs.getTimestamp("time_iskl"),
                        rs.getDate("date_akt"), rs.getDate("date_vost"), rs.getShort("dor_vost"),
                        rs.getString("datc"), rs.getShort("poligon"), rs.getString("z_kur"),
                        rs.getDouble("prz_sob"), rs.getString("ar_rzd"), rs.getString("prod"), rs.getString("smgs"));
                lw.add(w);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WagonBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return lw;
    }

    @Override
    public List<Wagon> getWagonsByNumbers(String nvags) {
        List<Wagon> lw = new ArrayList<>();
        Wagon w = null;
        String[] nw = nvags.replaceAll("\\s+", "").split(",");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nw.length; i++) {
            if (i == 0) {
                sb.append(nw[i]);
            } else {
                sb.append(", " + nw[i]);
            }
        }

        System.out.println("****** " + sb.toString());

        String query = "select "
                + "nvag, date_post, zav, tip, model_kod, model, "
                + "rod, nzav, tara, gruzp, dlina, gab, mat_kuz, "
                + "vozd, areg_rp, ryc_per, aregim, r_torm, tip_avs, "
                + "tip_pogl, buf, teleg, bal, tip_kotl, sliv, rama, "
                + "uklon, nvag_s, date_pr, date_rem_pr, vid_slr, date_slr, "
                + "mest_dep, date_dep, mest_kap, date_kap, porog, razr_prb, "
                + "km_norm, km_prb, km_gr, wes, sob, pred, dor_prip, stan_prip, "
                + "depo_prip, date_p_reg, sob_a, pred_a, dor_prip_a, stan_prip_a, "
                + "date_a_k, sob_iskl, dor_iskl, depo_iskl, stan_iskl, pric_iskl, "
                + "time_iskl, date_akt, date_vost, dor_vost, datc, poligon, "
                + "z_kur, prz_sob, ar_rzd, prod, smgs "
                + "from asp2qb.vagon where nvag in (" + sb.toString() + ")";

        try (Connection conn = getDSDB2().getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                w = new Wagon(rs.getInt("nvag"), rs.getDate("date_post"),
                        rs.getShort("zav"), rs.getShort("tip"), rs.getShort("model_kod"),
                        rs.getString("model"), rs.getShort("rod"), rs.getString("nzav"),
                        rs.getShort("tara"), rs.getShort("gruzp"), rs.getInt("dlina"),
                        rs.getShort("gab"), rs.getShort("mat_kuz"), rs.getShort("vozd"),
                        rs.getShort("areg_rp"), rs.getString("ryc_per"), rs.getString("aregim"),
                        rs.getShort("r_torm"), rs.getShort("tip_avs"), rs.getShort("tip_pogl"),
                        rs.getString("buf"), rs.getShort("teleg"), rs.getString("bal"),
                        rs.getShort("tip_kotl"), rs.getString("sliv"), rs.getShort("rama"),
                        rs.getString("uklon"), rs.getInt("nvag_s"), rs.getDate("date_pr"),
                        rs.getDate("date_rem_pr"), rs.getString("vid_slr"), rs.getDate("date_slr"),
                        rs.getShort("mest_dep"), rs.getDate("date_dep"), rs.getShort("mest_kap"),
                        rs.getDate("date_kap"), rs.getShort("porog"), rs.getString("razr_prb"),
                        rs.getInt("km_norm"), rs.getInt("km_prb"), rs.getInt("km_gr"),
                        rs.getShort("wes"), rs.getShort("sob"), rs.getInt("pred"),
                        rs.getShort("dor_prip"), rs.getInt("stan_prip"), rs.getShort("depo_prip"),
                        rs.getDate("date_p_reg"), rs.getShort("sob_a"), rs.getInt("pred_a"),
                        rs.getShort("dor_prip_a"), rs.getInt("stan_prip_a"), rs.getDate("date_a_k"),
                        rs.getShort("sob_iskl"), rs.getShort("dor_iskl"), rs.getShort("depo_iskl"),
                        rs.getInt("stan_iskl"), rs.getShort("pric_iskl"), rs.getTimestamp("time_iskl"),
                        rs.getDate("date_akt"), rs.getDate("date_vost"), rs.getShort("dor_vost"),
                        rs.getString("datc"), rs.getShort("poligon"), rs.getString("z_kur"),
                        rs.getDouble("prz_sob"), rs.getString("ar_rzd"), rs.getString("prod"), rs.getString("smgs"));
                lw.add(w);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WagonBean.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return lw;
    }
}
