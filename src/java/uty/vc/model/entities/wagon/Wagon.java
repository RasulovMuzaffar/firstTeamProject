package uty.vc.model.entities.wagon;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

public class Wagon implements Serializable {

    //nvag
    private int nVag;
//date_post
    private Date datePost;
//zav
    private short zav;
//tip
    private short tip;
//model_kod
    private short modelKod;
//model
    private String model;
//rod
    private short rod;
//nzav
    private String nZav;
//tara
    private short tara;
//gruzp
    private short gruzP;
//dlina
    private int dlina;
//gab
    private short gab;
//mat_kuz
    private short matKuz;
//vozd
    private short vozD;
//areg_rp
    private short aregRp;
//ryc_per
    private String rycPer;
//aregim
    private String aregim;
//r_torm
    private short rTorm;
//tip_avs
    private short tipAvs;
//tip_pogl
    private short tipPogl;
//buf
    private String buf;
//teleg
    private short teleg;
//bal
    private String bal;
//tip_kotl
    private short tipKotl;
//sliv
    private String sliv;
//rama
    private short rama;
//uklon
    private String uklon;
//nvag_s
    private int nVagS;
//date_pr
    private Date datePr;
//date_rem_pr
    private Date dateRemPr;
//vid_slr
    private String vidSlr;
//date_slr
    private Date dateSlr;
//mest_dep
    private short mestDep;
//date_dep
    private Date dateDep;
//mest_kap
    private short mestKap;
//date_kap
    private Date dateKap;
//porog
    private short porog;
//razr_prb
    private String razrPrb;
//km_norm
    private int kmNorm;
//km_prb
    private int kmPrb;
//km_gr
    private int kmGr;
//wes
    private short wes;
//sob
    private short sob;
//pred
    private int pred;
//dor_prip
    private short dorPrip;
//stan_prip
    private int stanPrip;
//depo_prip
    private short depoPrip;
//date_p_reg
    private Date datePReg;
//sob_a
    private short sobA;
//pred_a
    private int predA;
//dor_prip_a
    private short dorPripA;
//stan_prip_a
    private int stanPripA;
//date_a_k
    private Date dateAK;
//sob_iskl
    private short sobIskl;
//dor_iskl
    private short dorIskl;
//depo_iskl
    private short depoIskl;
//stan_iskl
    private int stanIskl;
//pric_iskl
    private short pricIskl;
//time_iskl
    private Timestamp timeIskl;
//date_akt
    private Date dateAkt;
//date_vost
    private Date dateVost;
//dor_vost
    private short dorVost;
//datc
    private String datC;
//poligon
    private short poligon;
//z_kur
    private String zKur;
//prz_sob
    private double przSob;
//ar_rzd
    private String arRzd;
//prod
    private String prod;
//smgs
    private String smgs;

    public Wagon() {
    }

    public Wagon(int nVag, Date datePost, short zav, short tip, short modelKod, String model, short rod, String nZav, short tara, short gruzP, int dlina, short gab, short matKuz, short vozD, short aregRp, String rycPer, String aregim, short rTorm, short tipAvs, short tipPogl, String buf, short teleg, String bal, short tipKotl, String sliv, short rama, String uklon, int nVagS, Date datePr, Date dateRemPr, String vidSlr, Date dateSlr, short mestDep, Date dateDep, short mestKap, Date dateKap, short porog, String razrPrb, int kmNorm, int kmPrb, int kmGr, short wes, short sob, int pred, short dorPrip, int stanPrip, short depoPrip, Date datePReg, short sobA, int predA, short dorPripA, int stanPripA, Date dateAK, short sobIskl, short dorIskl, short depoIskl, int stanIskl, short pricIskl, Timestamp timeIskl, Date dateAkt, Date dateVost, short dorVost, String datC, short poligon, String zKur, double przSob, String arRzd, String prod, String smgs) {
        this.nVag = nVag;
        this.datePost = datePost;
        this.zav = zav;
        this.tip = tip;
        this.modelKod = modelKod;
        this.model = model;
        this.rod = rod;
        this.nZav = nZav;
        this.tara = tara;
        this.gruzP = gruzP;
        this.dlina = dlina;
        this.gab = gab;
        this.matKuz = matKuz;
        this.vozD = vozD;
        this.aregRp = aregRp;
        this.rycPer = rycPer;
        this.aregim = aregim;
        this.rTorm = rTorm;
        this.tipAvs = tipAvs;
        this.tipPogl = tipPogl;
        this.buf = buf;
        this.teleg = teleg;
        this.bal = bal;
        this.tipKotl = tipKotl;
        this.sliv = sliv;
        this.rama = rama;
        this.uklon = uklon;
        this.nVagS = nVagS;
        this.datePr = datePr;
        this.dateRemPr = dateRemPr;
        this.vidSlr = vidSlr;
        this.dateSlr = dateSlr;
        this.mestDep = mestDep;
        this.dateDep = dateDep;
        this.mestKap = mestKap;
        this.dateKap = dateKap;
        this.porog = porog;
        this.razrPrb = razrPrb;
        this.kmNorm = kmNorm;
        this.kmPrb = kmPrb;
        this.kmGr = kmGr;
        this.wes = wes;
        this.sob = sob;
        this.pred = pred;
        this.dorPrip = dorPrip;
        this.stanPrip = stanPrip;
        this.depoPrip = depoPrip;
        this.datePReg = datePReg;
        this.sobA = sobA;
        this.predA = predA;
        this.dorPripA = dorPripA;
        this.stanPripA = stanPripA;
        this.dateAK = dateAK;
        this.sobIskl = sobIskl;
        this.dorIskl = dorIskl;
        this.depoIskl = depoIskl;
        this.stanIskl = stanIskl;
        this.pricIskl = pricIskl;
        this.timeIskl = timeIskl;
        this.dateAkt = dateAkt;
        this.dateVost = dateVost;
        this.dorVost = dorVost;
        this.datC = datC;
        this.poligon = poligon;
        this.zKur = zKur;
        this.przSob = przSob;
        this.arRzd = arRzd;
        this.prod = prod;
        this.smgs = smgs;
    }

    
    /**
     * Get the value of smgs
     *
     * @return the value of smgs
     */
    public String getSmgs() {
        return smgs;
    }

    /**
     * Set the value of smgs
     *
     * @param smgs new value of smgs
     */
    public void setSmgs(String smgs) {
        this.smgs = smgs;
    }

    /**
     * Get the value of prod
     *
     * @return the value of prod
     */
    public String getProd() {
        return prod;
    }

    /**
     * Set the value of prod
     *
     * @param prod new value of prod
     */
    public void setProd(String prod) {
        this.prod = prod;
    }

    /**
     * Get the value of arRzd
     *
     * @return the value of arRzd
     */
    public String getArRzd() {
        return arRzd;
    }

    /**
     * Set the value of arRzd
     *
     * @param arRzd new value of arRzd
     */
    public void setArRzd(String arRzd) {
        this.arRzd = arRzd;
    }

    /**
     * Get the value of przSob
     *
     * @return the value of przSob
     */
    public double getPrzSob() {
        return przSob;
    }

    /**
     * Set the value of przSob
     *
     * @param przSob new value of przSob
     */
    public void setPrzSob(double przSob) {
        this.przSob = przSob;
    }

    /**
     * Get the value of zKur
     *
     * @return the value of zKur
     */
    public String getzKur() {
        return zKur;
    }

    /**
     * Set the value of zKur
     *
     * @param zKur new value of zKur
     */
    public void setzKur(String zKur) {
        this.zKur = zKur;
    }

    /**
     * Get the value of poligon
     *
     * @return the value of poligon
     */
    public short getPoligon() {
        return poligon;
    }

    /**
     * Set the value of poligon
     *
     * @param poligon new value of poligon
     */
    public void setPoligon(short poligon) {
        this.poligon = poligon;
    }

    /**
     * Get the value of datC
     *
     * @return the value of datC
     */
    public String getDatC() {
        return datC;
    }

    /**
     * Set the value of datC
     *
     * @param datC new value of datC
     */
    public void setDatC(String datC) {
        this.datC = datC;
    }

    /**
     * Get the value of dorVost
     *
     * @return the value of dorVost
     */
    public short getDorVost() {
        return dorVost;
    }

    /**
     * Set the value of dorVost
     *
     * @param dorVost new value of dorVost
     */
    public void setDorVost(short dorVost) {
        this.dorVost = dorVost;
    }

    /**
     * Get the value of dateVost
     *
     * @return the value of dateVost
     */
    public Date getDateVost() {
        return dateVost;
    }

    /**
     * Set the value of dateVost
     *
     * @param dateVost new value of dateVost
     */
    public void setDateVost(Date dateVost) {
        this.dateVost = dateVost;
    }

    /**
     * Get the value of dateAkt
     *
     * @return the value of dateAkt
     */
    public Date getDateAkt() {
        return dateAkt;
    }

    /**
     * Set the value of dateAkt
     *
     * @param dateAkt new value of dateAkt
     */
    public void setDateAkt(Date dateAkt) {
        this.dateAkt = dateAkt;
    }

    /**
     * Get the value of timeIskl
     *
     * @return the value of timeIskl
     */
    public Timestamp getTimeIskl() {
        return timeIskl;
    }

    /**
     * Set the value of timeIskl
     *
     * @param timeIskl new value of timeIskl
     */
    public void setTimeIskl(Timestamp timeIskl) {
        this.timeIskl = timeIskl;
    }

    /**
     * Get the value of pricIskl
     *
     * @return the value of pricIskl
     */
    public short getPricIskl() {
        return pricIskl;
    }

    /**
     * Set the value of pricIskl
     *
     * @param pricIskl new value of pricIskl
     */
    public void setPricIskl(short pricIskl) {
        this.pricIskl = pricIskl;
    }

    /**
     * Get the value of stanIskl
     *
     * @return the value of stanIskl
     */
    public int getStanIskl() {
        return stanIskl;
    }

    /**
     * Set the value of stanIskl
     *
     * @param stanIskl new value of stanIskl
     */
    public void setStanIskl(int stanIskl) {
        this.stanIskl = stanIskl;
    }

    /**
     * Get the value of depoIskl
     *
     * @return the value of depoIskl
     */
    public short getDepoIskl() {
        return depoIskl;
    }

    /**
     * Set the value of depoIskl
     *
     * @param depoIskl new value of depoIskl
     */
    public void setDepoIskl(short depoIskl) {
        this.depoIskl = depoIskl;
    }

    /**
     * Get the value of dorIskl
     *
     * @return the value of dorIskl
     */
    public short getDorIskl() {
        return dorIskl;
    }

    /**
     * Set the value of dorIskl
     *
     * @param dorIskl new value of dorIskl
     */
    public void setDorIskl(short dorIskl) {
        this.dorIskl = dorIskl;
    }

    /**
     * Get the value of sobIskl
     *
     * @return the value of sobIskl
     */
    public short getSobIskl() {
        return sobIskl;
    }

    /**
     * Set the value of sobIskl
     *
     * @param sobIskl new value of sobIskl
     */
    public void setSobIskl(short sobIskl) {
        this.sobIskl = sobIskl;
    }

    /**
     * Get the value of dateAK
     *
     * @return the value of dateAK
     */
    public Date getDateAK() {
        return dateAK;
    }

    /**
     * Set the value of dateAK
     *
     * @param dateAK new value of dateAK
     */
    public void setDateAK(Date dateAK) {
        this.dateAK = dateAK;
    }

    /**
     * Get the value of stanPripA
     *
     * @return the value of stanPripA
     */
    public int getStanPripA() {
        return stanPripA;
    }

    /**
     * Set the value of stanPripA
     *
     * @param stanPripA new value of stanPripA
     */
    public void setStanPripA(int stanPripA) {
        this.stanPripA = stanPripA;
    }

    /**
     * Get the value of dorPripA
     *
     * @return the value of dorPripA
     */
    public short getDorPripA() {
        return dorPripA;
    }

    /**
     * Set the value of dorPripA
     *
     * @param dorPripA new value of dorPripA
     */
    public void setDorPripA(short dorPripA) {
        this.dorPripA = dorPripA;
    }

    /**
     * Get the value of predA
     *
     * @return the value of predA
     */
    public int getPredA() {
        return predA;
    }

    /**
     * Set the value of predA
     *
     * @param predA new value of predA
     */
    public void setPredA(int predA) {
        this.predA = predA;
    }

    /**
     * Get the value of sobA
     *
     * @return the value of sobA
     */
    public short getSobA() {
        return sobA;
    }

    /**
     * Set the value of sobA
     *
     * @param sobA new value of sobA
     */
    public void setSobA(short sobA) {
        this.sobA = sobA;
    }

    /**
     * Get the value of datePReg
     *
     * @return the value of datePReg
     */
    public Date getDatePReg() {
        return datePReg;
    }

    /**
     * Set the value of datePReg
     *
     * @param datePReg new value of datePReg
     */
    public void setDatePReg(Date datePReg) {
        this.datePReg = datePReg;
    }

    /**
     * Get the value of depoPrip
     *
     * @return the value of depoPrip
     */
    public short getDepoPrip() {
        return depoPrip;
    }

    /**
     * Set the value of depoPrip
     *
     * @param depoPrip new value of depoPrip
     */
    public void setDepoPrip(short depoPrip) {
        this.depoPrip = depoPrip;
    }

    /**
     * Get the value of stanPrip
     *
     * @return the value of stanPrip
     */
    public int getStanPrip() {
        return stanPrip;
    }

    /**
     * Set the value of stanPrip
     *
     * @param stanPrip new value of stanPrip
     */
    public void setStanPrip(int stanPrip) {
        this.stanPrip = stanPrip;
    }

    /**
     * Get the value of dorPrip
     *
     * @return the value of dorPrip
     */
    public short getDorPrip() {
        return dorPrip;
    }

    /**
     * Set the value of dorPrip
     *
     * @param dorPrip new value of dorPrip
     */
    public void setDorPrip(short dorPrip) {
        this.dorPrip = dorPrip;
    }

    /**
     * Get the value of pred
     *
     * @return the value of pred
     */
    public int getPred() {
        return pred;
    }

    /**
     * Set the value of pred
     *
     * @param pred new value of pred
     */
    public void setPred(int pred) {
        this.pred = pred;
    }

    /**
     * Get the value of sob
     *
     * @return the value of sob
     */
    public short getSob() {
        return sob;
    }

    /**
     * Set the value of sob
     *
     * @param sob new value of sob
     */
    public void setSob(short sob) {
        this.sob = sob;
    }

    /**
     * Get the value of wes
     *
     * @return the value of wes
     */
    public short getWes() {
        return wes;
    }

    /**
     * Set the value of wes
     *
     * @param wes new value of wes
     */
    public void setWes(short wes) {
        this.wes = wes;
    }

    /**
     * Get the value of kmGr
     *
     * @return the value of kmGr
     */
    public int getKmGr() {
        return kmGr;
    }

    /**
     * Set the value of kmGr
     *
     * @param kmGr new value of kmGr
     */
    public void setKmGr(int kmGr) {
        this.kmGr = kmGr;
    }

    /**
     * Get the value of kmPrb
     *
     * @return the value of kmPrb
     */
    public int getKmPrb() {
        return kmPrb;
    }

    /**
     * Set the value of kmPrb
     *
     * @param kmPrb new value of kmPrb
     */
    public void setKmPrb(int kmPrb) {
        this.kmPrb = kmPrb;
    }

    /**
     * Get the value of kmNorm
     *
     * @return the value of kmNorm
     */
    public int getKmNorm() {
        return kmNorm;
    }

    /**
     * Set the value of kmNorm
     *
     * @param kmNorm new value of kmNorm
     */
    public void setKmNorm(int kmNorm) {
        this.kmNorm = kmNorm;
    }

    /**
     * Get the value of razrPrb
     *
     * @return the value of razrPrb
     */
    public String getRazrPrb() {
        return razrPrb;
    }

    /**
     * Set the value of razrPrb
     *
     * @param razrPrb new value of razrPrb
     */
    public void setRazrPrb(String razrPrb) {
        this.razrPrb = razrPrb;
    }

    /**
     * Get the value of porog
     *
     * @return the value of porog
     */
    public short getPorog() {
        return porog;
    }

    /**
     * Set the value of porog
     *
     * @param porog new value of porog
     */
    public void setPorog(short porog) {
        this.porog = porog;
    }

    /**
     * Get the value of dateKap
     *
     * @return the value of dateKap
     */
    public Date getDateKap() {
        return dateKap;
    }

    /**
     * Set the value of dateKap
     *
     * @param dateKap new value of dateKap
     */
    public void setDateKap(Date dateKap) {
        this.dateKap = dateKap;
    }

    /**
     * Get the value of mestKap
     *
     * @return the value of mestKap
     */
    public short getMestKap() {
        return mestKap;
    }

    /**
     * Set the value of mestKap
     *
     * @param mestKap new value of mestKap
     */
    public void setMestKap(short mestKap) {
        this.mestKap = mestKap;
    }

    /**
     * Get the value of dateDep
     *
     * @return the value of dateDep
     */
    public Date getDateDep() {
        return dateDep;
    }

    /**
     * Set the value of dateDep
     *
     * @param dateDep new value of dateDep
     */
    public void setDateDep(Date dateDep) {
        this.dateDep = dateDep;
    }

    /**
     * Get the value of mestDep
     *
     * @return the value of mestDep
     */
    public short getMestDep() {
        return mestDep;
    }

    /**
     * Set the value of mestDep
     *
     * @param mestDep new value of mestDep
     */
    public void setMestDep(short mestDep) {
        this.mestDep = mestDep;
    }

    /**
     * Get the value of dateSlr
     *
     * @return the value of dateSlr
     */
    public Date getDateSlr() {
        return dateSlr;
    }

    /**
     * Set the value of dateSlr
     *
     * @param dateSlr new value of dateSlr
     */
    public void setDateSlr(Date dateSlr) {
        this.dateSlr = dateSlr;
    }

    /**
     * Get the value of vidSlr
     *
     * @return the value of vidSlr
     */
    public String getVidSlr() {
        return vidSlr;
    }

    /**
     * Set the value of vidSlr
     *
     * @param vidSlr new value of vidSlr
     */
    public void setVidSlr(String vidSlr) {
        this.vidSlr = vidSlr;
    }

    /**
     * Get the value of dateRemPr
     *
     * @return the value of dateRemPr
     */
    public Date getDateRemPr() {
        return dateRemPr;
    }

    /**
     * Set the value of dateRemPr
     *
     * @param dateRemPr new value of dateRemPr
     */
    public void setDateRemPr(Date dateRemPr) {
        this.dateRemPr = dateRemPr;
    }

    /**
     * Get the value of datePr
     *
     * @return the value of datePr
     */
    public Date getDatePr() {
        return datePr;
    }

    /**
     * Set the value of datePr
     *
     * @param datePr new value of datePr
     */
    public void setDatePr(Date datePr) {
        this.datePr = datePr;
    }

    /**
     * Get the value of nVagS
     *
     * @return the value of nVagS
     */
    public int getnVagS() {
        return nVagS;
    }

    /**
     * Set the value of nVagS
     *
     * @param nVagS new value of nVagS
     */
    public void setnVagS(int nVagS) {
        this.nVagS = nVagS;
    }

    /**
     * Get the value of uklon
     *
     * @return the value of uklon
     */
    public String getUklon() {
        return uklon;
    }

    /**
     * Set the value of uklon
     *
     * @param uklon new value of uklon
     */
    public void setUklon(String uklon) {
        this.uklon = uklon;
    }

    /**
     * Get the value of rama
     *
     * @return the value of rama
     */
    public short getRama() {
        return rama;
    }

    /**
     * Set the value of rama
     *
     * @param rama new value of rama
     */
    public void setRama(short rama) {
        this.rama = rama;
    }

    /**
     * Get the value of sliv
     *
     * @return the value of sliv
     */
    public String getSliv() {
        return sliv;
    }

    /**
     * Set the value of sliv
     *
     * @param sliv new value of sliv
     */
    public void setSliv(String sliv) {
        this.sliv = sliv;
    }

    /**
     * Get the value of tipKotl
     *
     * @return the value of tipKotl
     */
    public short getTipKotl() {
        return tipKotl;
    }

    /**
     * Set the value of tipKotl
     *
     * @param tipKotl new value of tipKotl
     */
    public void setTipKotl(short tipKotl) {
        this.tipKotl = tipKotl;
    }

    /**
     * Get the value of bal
     *
     * @return the value of bal
     */
    public String getBal() {
        return bal;
    }

    /**
     * Set the value of bal
     *
     * @param bal new value of bal
     */
    public void setBal(String bal) {
        this.bal = bal;
    }

    /**
     * Get the value of teleg
     *
     * @return the value of teleg
     */
    public short getTeleg() {
        return teleg;
    }

    /**
     * Set the value of teleg
     *
     * @param teleg new value of teleg
     */
    public void setTeleg(short teleg) {
        this.teleg = teleg;
    }

    /**
     * Get the value of buf
     *
     * @return the value of buf
     */
    public String getBuf() {
        return buf;
    }

    /**
     * Set the value of buf
     *
     * @param buf new value of buf
     */
    public void setBuf(String buf) {
        this.buf = buf;
    }

    /**
     * Get the value of tipPogl
     *
     * @return the value of tipPogl
     */
    public short getTipPogl() {
        return tipPogl;
    }

    /**
     * Set the value of tipPogl
     *
     * @param tipPogl new value of tipPogl
     */
    public void setTipPogl(short tipPogl) {
        this.tipPogl = tipPogl;
    }

    /**
     * Get the value of tipAvs
     *
     * @return the value of tipAvs
     */
    public short getTipAvs() {
        return tipAvs;
    }

    /**
     * Set the value of tipAvs
     *
     * @param tipAvs new value of tipAvs
     */
    public void setTipAvs(short tipAvs) {
        this.tipAvs = tipAvs;
    }

    /**
     * Get the value of rTorm
     *
     * @return the value of rTorm
     */
    public short getrTorm() {
        return rTorm;
    }

    /**
     * Set the value of rTorm
     *
     * @param rTorm new value of rTorm
     */
    public void setrTorm(short rTorm) {
        this.rTorm = rTorm;
    }

    /**
     * Get the value of aregim
     *
     * @return the value of aregim
     */
    public String getAregim() {
        return aregim;
    }

    /**
     * Set the value of aregim
     *
     * @param aregim new value of aregim
     */
    public void setAregim(String aregim) {
        this.aregim = aregim;
    }

    /**
     * Get the value of rycPer
     *
     * @return the value of rycPer
     */
    public String getRycPer() {
        return rycPer;
    }

    /**
     * Set the value of rycPer
     *
     * @param rycPer new value of rycPer
     */
    public void setRycPer(String rycPer) {
        this.rycPer = rycPer;
    }

    /**
     * Get the value of aregRp
     *
     * @return the value of aregRp
     */
    public short getAregRp() {
        return aregRp;
    }

    /**
     * Set the value of aregRp
     *
     * @param aregRp new value of aregRp
     */
    public void setAregRp(short aregRp) {
        this.aregRp = aregRp;
    }

    /**
     * Get the value of vozD
     *
     * @return the value of vozD
     */
    public short getVozD() {
        return vozD;
    }

    /**
     * Set the value of vozD
     *
     * @param vozD new value of vozD
     */
    public void setVozD(short vozD) {
        this.vozD = vozD;
    }

    /**
     * Get the value of matKuz
     *
     * @return the value of matKuz
     */
    public short getMatKuz() {
        return matKuz;
    }

    /**
     * Set the value of matKuz
     *
     * @param matKuz new value of matKuz
     */
    public void setMatKuz(short matKuz) {
        this.matKuz = matKuz;
    }

    /**
     * Get the value of gab
     *
     * @return the value of gab
     */
    public short getGab() {
        return gab;
    }

    /**
     * Set the value of gab
     *
     * @param gab new value of gab
     */
    public void setGab(short gab) {
        this.gab = gab;
    }

    /**
     * Get the value of dlina
     *
     * @return the value of dlina
     */
    public int getDlina() {
        return dlina;
    }

    /**
     * Set the value of dlina
     *
     * @param dlina new value of dlina
     */
    public void setDlina(int dlina) {
        this.dlina = dlina;
    }

    /**
     * Get the value of gruzP
     *
     * @return the value of gruzP
     */
    public short getGruzP() {
        return gruzP;
    }

    /**
     * Set the value of gruzP
     *
     * @param gruzP new value of gruzP
     */
    public void setGruzP(short gruzP) {
        this.gruzP = gruzP;
    }

    /**
     * Get the value of tara
     *
     * @return the value of tara
     */
    public short getTara() {
        return tara;
    }

    /**
     * Set the value of tara
     *
     * @param tara new value of tara
     */
    public void setTara(short tara) {
        this.tara = tara;
    }

    /**
     * Get the value of nZav
     *
     * @return the value of nZav
     */
    public String getnZav() {
        return nZav;
    }

    /**
     * Set the value of nZav
     *
     * @param nZav new value of nZav
     */
    public void setnZav(String nZav) {
        this.nZav = nZav;
    }

    /**
     * Get the value of rod
     *
     * @return the value of rod
     */
    public short getRod() {
        return rod;
    }

    /**
     * Set the value of rod
     *
     * @param rod new value of rod
     */
    public void setRod(short rod) {
        this.rod = rod;
    }

    /**
     * Get the value of model
     *
     * @return the value of model
     */
    public String getModel() {
        return model;
    }

    /**
     * Set the value of model
     *
     * @param model new value of model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Get the value of modelKod
     *
     * @return the value of modelKod
     */
    public short getModelKod() {
        return modelKod;
    }

    /**
     * Set the value of modelKod
     *
     * @param modelKod new value of modelKod
     */
    public void setModelKod(short modelKod) {
        this.modelKod = modelKod;
    }

    /**
     * Get the value of tip
     *
     * @return the value of tip
     */
    public short getTip() {
        return tip;
    }

    /**
     * Set the value of tip
     *
     * @param tip new value of tip
     */
    public void setTip(short tip) {
        this.tip = tip;
    }

    /**
     * Get the value of zav
     *
     * @return the value of zav
     */
    public short getZav() {
        return zav;
    }

    /**
     * Set the value of zav
     *
     * @param zav new value of zav
     */
    public void setZav(short zav) {
        this.zav = zav;
    }

    /**
     * Get the value of datePost
     *
     * @return the value of datePost
     */
    public Date getDatePost() {
        return datePost;
    }

    /**
     * Set the value of datePost
     *
     * @param datePost new value of datePost
     */
    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    /**
     * Get the value of nVag
     *
     * @return the value of nVag
     */
    public int getnVag() {
        return nVag;
    }

    /**
     * Set the value of nVag
     *
     * @param nVag new value of nVag
     */
    public void setnVag(int nVag) {
        this.nVag = nVag;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.nVag;
        hash = 67 * hash + Objects.hashCode(this.datePost);
        hash = 67 * hash + this.zav;
        hash = 67 * hash + this.tip;
        hash = 67 * hash + this.modelKod;
        hash = 67 * hash + Objects.hashCode(this.model);
        hash = 67 * hash + this.rod;
        hash = 67 * hash + Objects.hashCode(this.nZav);
        hash = 67 * hash + this.tara;
        hash = 67 * hash + this.gruzP;
        hash = 67 * hash + this.dlina;
        hash = 67 * hash + this.gab;
        hash = 67 * hash + this.matKuz;
        hash = 67 * hash + this.vozD;
        hash = 67 * hash + this.aregRp;
        hash = 67 * hash + Objects.hashCode(this.rycPer);
        hash = 67 * hash + Objects.hashCode(this.aregim);
        hash = 67 * hash + this.rTorm;
        hash = 67 * hash + this.tipAvs;
        hash = 67 * hash + this.tipPogl;
        hash = 67 * hash + Objects.hashCode(this.buf);
        hash = 67 * hash + this.teleg;
        hash = 67 * hash + Objects.hashCode(this.bal);
        hash = 67 * hash + this.tipKotl;
        hash = 67 * hash + Objects.hashCode(this.sliv);
        hash = 67 * hash + this.rama;
        hash = 67 * hash + Objects.hashCode(this.uklon);
        hash = 67 * hash + this.nVagS;
        hash = 67 * hash + Objects.hashCode(this.datePr);
        hash = 67 * hash + Objects.hashCode(this.dateRemPr);
        hash = 67 * hash + Objects.hashCode(this.vidSlr);
        hash = 67 * hash + Objects.hashCode(this.dateSlr);
        hash = 67 * hash + this.mestDep;
        hash = 67 * hash + Objects.hashCode(this.dateDep);
        hash = 67 * hash + this.mestKap;
        hash = 67 * hash + Objects.hashCode(this.dateKap);
        hash = 67 * hash + this.porog;
        hash = 67 * hash + Objects.hashCode(this.razrPrb);
        hash = 67 * hash + this.kmNorm;
        hash = 67 * hash + this.kmPrb;
        hash = 67 * hash + this.kmGr;
        hash = 67 * hash + this.wes;
        hash = 67 * hash + this.sob;
        hash = 67 * hash + this.pred;
        hash = 67 * hash + this.dorPrip;
        hash = 67 * hash + this.stanPrip;
        hash = 67 * hash + this.depoPrip;
        hash = 67 * hash + Objects.hashCode(this.datePReg);
        hash = 67 * hash + this.sobA;
        hash = 67 * hash + this.predA;
        hash = 67 * hash + this.dorPripA;
        hash = 67 * hash + this.stanPripA;
        hash = 67 * hash + Objects.hashCode(this.dateAK);
        hash = 67 * hash + this.sobIskl;
        hash = 67 * hash + this.dorIskl;
        hash = 67 * hash + this.depoIskl;
        hash = 67 * hash + this.stanIskl;
        hash = 67 * hash + this.pricIskl;
        hash = 67 * hash + Objects.hashCode(this.timeIskl);
        hash = 67 * hash + Objects.hashCode(this.dateAkt);
        hash = 67 * hash + Objects.hashCode(this.dateVost);
        hash = 67 * hash + this.dorVost;
        hash = 67 * hash + Objects.hashCode(this.datC);
        hash = 67 * hash + this.poligon;
        hash = 67 * hash + Objects.hashCode(this.zKur);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.przSob) ^ (Double.doubleToLongBits(this.przSob) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.arRzd);
        hash = 67 * hash + Objects.hashCode(this.prod);
        hash = 67 * hash + Objects.hashCode(this.smgs);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wagon other = (Wagon) obj;
        if (this.nVag != other.nVag) {
            return false;
        }
        if (this.zav != other.zav) {
            return false;
        }
        if (this.tip != other.tip) {
            return false;
        }
        if (this.modelKod != other.modelKod) {
            return false;
        }
        if (this.rod != other.rod) {
            return false;
        }
        if (this.tara != other.tara) {
            return false;
        }
        if (this.gruzP != other.gruzP) {
            return false;
        }
        if (this.dlina != other.dlina) {
            return false;
        }
        if (this.gab != other.gab) {
            return false;
        }
        if (this.matKuz != other.matKuz) {
            return false;
        }
        if (this.vozD != other.vozD) {
            return false;
        }
        if (this.aregRp != other.aregRp) {
            return false;
        }
        if (this.rTorm != other.rTorm) {
            return false;
        }
        if (this.tipAvs != other.tipAvs) {
            return false;
        }
        if (this.tipPogl != other.tipPogl) {
            return false;
        }
        if (this.teleg != other.teleg) {
            return false;
        }
        if (this.tipKotl != other.tipKotl) {
            return false;
        }
        if (this.rama != other.rama) {
            return false;
        }
        if (this.nVagS != other.nVagS) {
            return false;
        }
        if (this.mestDep != other.mestDep) {
            return false;
        }
        if (this.mestKap != other.mestKap) {
            return false;
        }
        if (this.porog != other.porog) {
            return false;
        }
        if (this.kmNorm != other.kmNorm) {
            return false;
        }
        if (this.kmPrb != other.kmPrb) {
            return false;
        }
        if (this.kmGr != other.kmGr) {
            return false;
        }
        if (this.wes != other.wes) {
            return false;
        }
        if (this.sob != other.sob) {
            return false;
        }
        if (this.pred != other.pred) {
            return false;
        }
        if (this.dorPrip != other.dorPrip) {
            return false;
        }
        if (this.stanPrip != other.stanPrip) {
            return false;
        }
        if (this.depoPrip != other.depoPrip) {
            return false;
        }
        if (this.sobA != other.sobA) {
            return false;
        }
        if (this.predA != other.predA) {
            return false;
        }
        if (this.dorPripA != other.dorPripA) {
            return false;
        }
        if (this.stanPripA != other.stanPripA) {
            return false;
        }
        if (this.sobIskl != other.sobIskl) {
            return false;
        }
        if (this.dorIskl != other.dorIskl) {
            return false;
        }
        if (this.depoIskl != other.depoIskl) {
            return false;
        }
        if (this.stanIskl != other.stanIskl) {
            return false;
        }
        if (this.pricIskl != other.pricIskl) {
            return false;
        }
        if (this.dorVost != other.dorVost) {
            return false;
        }
        if (this.poligon != other.poligon) {
            return false;
        }
        if (Double.doubleToLongBits(this.przSob) != Double.doubleToLongBits(other.przSob)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.nZav, other.nZav)) {
            return false;
        }
        if (!Objects.equals(this.rycPer, other.rycPer)) {
            return false;
        }
        if (!Objects.equals(this.aregim, other.aregim)) {
            return false;
        }
        if (!Objects.equals(this.buf, other.buf)) {
            return false;
        }
        if (!Objects.equals(this.bal, other.bal)) {
            return false;
        }
        if (!Objects.equals(this.sliv, other.sliv)) {
            return false;
        }
        if (!Objects.equals(this.uklon, other.uklon)) {
            return false;
        }
        if (!Objects.equals(this.vidSlr, other.vidSlr)) {
            return false;
        }
        if (!Objects.equals(this.razrPrb, other.razrPrb)) {
            return false;
        }
        if (!Objects.equals(this.datC, other.datC)) {
            return false;
        }
        if (!Objects.equals(this.zKur, other.zKur)) {
            return false;
        }
        if (!Objects.equals(this.arRzd, other.arRzd)) {
            return false;
        }
        if (!Objects.equals(this.prod, other.prod)) {
            return false;
        }
        if (!Objects.equals(this.smgs, other.smgs)) {
            return false;
        }
        if (!Objects.equals(this.datePost, other.datePost)) {
            return false;
        }
        if (!Objects.equals(this.datePr, other.datePr)) {
            return false;
        }
        if (!Objects.equals(this.dateRemPr, other.dateRemPr)) {
            return false;
        }
        if (!Objects.equals(this.dateSlr, other.dateSlr)) {
            return false;
        }
        if (!Objects.equals(this.dateDep, other.dateDep)) {
            return false;
        }
        if (!Objects.equals(this.dateKap, other.dateKap)) {
            return false;
        }
        if (!Objects.equals(this.datePReg, other.datePReg)) {
            return false;
        }
        if (!Objects.equals(this.dateAK, other.dateAK)) {
            return false;
        }
        if (!Objects.equals(this.timeIskl, other.timeIskl)) {
            return false;
        }
        if (!Objects.equals(this.dateAkt, other.dateAkt)) {
            return false;
        }
        if (!Objects.equals(this.dateVost, other.dateVost)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wagon{" + "nVag=" + nVag + ", datePost=" + datePost + ", zav=" + zav + ", tip=" + tip + ", modelKod=" + modelKod + ", model=" + model + ", rod=" + rod + ", nZav=" + nZav + ", tara=" + tara + ", gruzP=" + gruzP + ", dlina=" + dlina + ", gab=" + gab + ", matKuz=" + matKuz + ", vozD=" + vozD + ", aregRp=" + aregRp + ", rycPer=" + rycPer + ", aregim=" + aregim + ", rTorm=" + rTorm + ", tipAvs=" + tipAvs + ", tipPogl=" + tipPogl + ", buf=" + buf + ", teleg=" + teleg + ", bal=" + bal + ", tipKotl=" + tipKotl + ", sliv=" + sliv + ", rama=" + rama + ", uklon=" + uklon + ", nVagS=" + nVagS + ", datePr=" + datePr + ", dateRemPr=" + dateRemPr + ", vidSlr=" + vidSlr + ", dateSlr=" + dateSlr + ", mestDep=" + mestDep + ", dateDep=" + dateDep + ", mestKap=" + mestKap + ", dateKap=" + dateKap + ", porog=" + porog + ", razrPrb=" + razrPrb + ", kmNorm=" + kmNorm + ", kmPrb=" + kmPrb + ", kmGr=" + kmGr + ", wes=" + wes + ", sob=" + sob + ", pred=" + pred + ", dorPrip=" + dorPrip + ", stanPrip=" + stanPrip + ", depoPrip=" + depoPrip + ", datePReg=" + datePReg + ", sobA=" + sobA + ", predA=" + predA + ", dorPripA=" + dorPripA + ", stanPripA=" + stanPripA + ", dateAK=" + dateAK + ", sobIskl=" + sobIskl + ", dorIskl=" + dorIskl + ", depoIskl=" + depoIskl + ", stanIskl=" + stanIskl + ", pricIskl=" + pricIskl + ", timeIskl=" + timeIskl + ", dateAkt=" + dateAkt + ", dateVost=" + dateVost + ", dorVost=" + dorVost + ", datC=" + datC + ", poligon=" + poligon + ", zKur=" + zKur + ", przSob=" + przSob + ", arRzd=" + arRzd + ", prod=" + prod + ", smgs=" + smgs + '}';
    }

}
