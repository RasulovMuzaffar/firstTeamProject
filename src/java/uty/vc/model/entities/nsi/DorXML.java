package uty.vc.model.entities.nsi;

import java.io.Serializable;
import java.util.Objects;

public class DorXML implements Serializable {

    //dor_id
    private int dorId;
    //sname
    private String sName;

    public DorXML() {
    }

    public DorXML(int dorId, String sName) {
        this.dorId = dorId;
        this.sName = sName;
    }

    public int getDorId() {
        return dorId;
    }

    public void setDorId(int dorId) {
        this.dorId = dorId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.dorId;
        hash = 97 * hash + Objects.hashCode(this.sName);
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
        final DorXML other = (DorXML) obj;
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
        return "DorXML{" + "dorId=" + dorId + ", sName=" + sName + '}';
    }
}
