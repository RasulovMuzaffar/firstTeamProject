/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uty.vc.model.entities.nsi;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author User
 */
public class KodPredXML implements Serializable {

    private short kod;

    private String sName;

    private int dorId;

    /**
     * Get the value of dorId
     *
     * @return the value of dorId
     */
    public int getDorId() {
        return dorId;
    }

    /**
     * Set the value of dorId
     *
     * @param dorId new value of dorId
     */
    public void setDorId(int dorId) {
        this.dorId = dorId;
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
     * Get the value of kod
     *
     * @return the value of kod
     */
    public short getKod() {
        return kod;
    }

    /**
     * Set the value of kod
     *
     * @param kod new value of kod
     */
    public void setKod(short kod) {
        this.kod = kod;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.kod;
        hash = 53 * hash + Objects.hashCode(this.sName);
        hash = 53 * hash + this.dorId;
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
