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
public class DorXML implements Serializable {

    private int dorId;

    private String sName;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.dorId;
        hash = 41 * hash + Objects.hashCode(this.sName);
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
