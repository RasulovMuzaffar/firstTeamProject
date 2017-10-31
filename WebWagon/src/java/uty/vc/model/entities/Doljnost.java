package uty.vc.model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Doljnost implements Serializable {

    private int id_doljnost;

    private String name;

    public Doljnost() {
    }

    public Doljnost(int id_doljnost, String name) {
        this.id_doljnost = id_doljnost;
        this.name = name;
    }

    public int getId_doljnost() {
        return id_doljnost;
    }

    public void setId_doljnost(int id_doljnost) {
        this.id_doljnost = id_doljnost;
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
        hash = 67 * hash + this.id_doljnost;
        hash = 67 * hash + Objects.hashCode(this.name);
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
        if (this.id_doljnost != other.id_doljnost) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doljnost{" + "id_doljnost=" + id_doljnost + ", name=" + name + '}';
    }

}
