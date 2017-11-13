package uty.vc.model.entities.nsi;

import java.io.Serializable;
import java.util.Objects;

public class SobsXML implements Serializable {

    private int kod_sob;

    private String sName;

    public SobsXML() {
    }

    public SobsXML(int kod_sob, String sName) {
        this.kod_sob = kod_sob;
        this.sName = sName;
    }

    /**
     * Get the value of sName
     *
     * @return the value of sName
     */
    public String getsName() {
        return sName;
    }

    /**
     * Set the value of sName
     *
     * @param sName new value of sName
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * Get the value of kod_sob
     *
     * @return the value of kod_sob
     */
    public int getKod_sob() {
        return kod_sob;
    }

    /**
     * Set the value of kod_sob
     *
     * @param kod_sob new value of kod_sob
     */
    public void setKod_sob(int kod_sob) {
        this.kod_sob = kod_sob;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.kod_sob;
        hash = 23 * hash + Objects.hashCode(this.sName);
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
        if (this.kod_sob != other.kod_sob) {
            return false;
        }
        if (!Objects.equals(this.sName, other.sName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SobsXML{" + "kod_sob=" + kod_sob + ", sName=" + sName + '}';
    }

}
