package uty.vc.model.entities.nsi;

import java.io.Serializable;
import java.util.Objects;

public class SobsXML implements Serializable {

    //kod_sob
    private int kodSob;
    //sname
    private String sName;

    public SobsXML() {
    }

    public SobsXML(int kodSob, String sName) {
        this.kodSob = kodSob;
        this.sName = sName;
    }

    public int getKodSob() {
        return kodSob;
    }

    public void setKodSob(int kodSob) {
        this.kodSob = kodSob;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.kodSob;
        hash = 67 * hash + Objects.hashCode(this.sName);
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
        final SobsXML other = (SobsXML) obj;
        if (this.kodSob != other.kodSob) {
            return false;
        }
        if (!Objects.equals(this.sName, other.sName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SobsXML{" + "kodSob=" + kodSob + ", sName=" + sName + '}';
    }

}
