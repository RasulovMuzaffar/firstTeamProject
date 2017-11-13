package uty.vc.model.entities.nsi;

import java.io.Serializable;
import java.util.Objects;

public class KodPredXML implements Serializable {

    //kod
    private short kod;
    //sname
    private String sName;
    //dor_id
    private int dorId;

    public KodPredXML() {
    }

    public KodPredXML(short kod, String sName, int dorId) {
        this.kod = kod;
        this.sName = sName;
        this.dorId = dorId;
    }

    public short getKod() {
        return kod;
    }

    public void setKod(short kod) {
        this.kod = kod;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getDorId() {
        return dorId;
    }

    public void setDorId(int dorId) {
        this.dorId = dorId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.kod;
        hash = 97 * hash + Objects.hashCode(this.sName);
        hash = 97 * hash + this.dorId;
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
        final KodPredXML other = (KodPredXML) obj;
        if (this.kod != other.kod) {
            return false;
        }
        if (this.dorId != other.dorId) {
            return false;
        }
        if (!Objects.equals(this.sName, other.sName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KodPredXML{" + "kod=" + kod + ", sName=" + sName + ", dorId=" + dorId + '}';
    }
}
