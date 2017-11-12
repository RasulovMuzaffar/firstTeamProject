package uty.vc.model.entities.user;

import java.io.Serializable;
import java.util.Objects;

public class Doljnost implements Serializable {

    private int idDoljnost;

    private String name;

    public Doljnost() {
    }

    public Doljnost(int idDoljnost, String name) {
        this.idDoljnost = idDoljnost;
        this.name = name;
    }

    public int getIdDoljnost() {
        return idDoljnost;
    }

    public void setIdDoljnost(int idDoljnost) {
        this.idDoljnost = idDoljnost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idDoljnost;
        hash = 89 * hash + Objects.hashCode(this.name);
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
        final Doljnost other = (Doljnost) obj;
        if (this.idDoljnost != other.idDoljnost) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doljnost{" + "idDoljnost=" + idDoljnost + ", name=" + name + '}';
    }    
}
