package uty.vc.model.entities.user;

import java.io.Serializable;
import java.util.Objects;

public class Slujba implements Serializable {

    private int idSlujba;

    private String name;

    public Slujba() {
    }

    public Slujba(int idSlujba, String name) {
        this.idSlujba = idSlujba;
        this.name = name;
    }

    public int getIdSlujba() {
        return idSlujba;
    }

    public void setIdSlujba(int idSlujba) {
        this.idSlujba = idSlujba;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idSlujba;
        hash = 79 * hash + Objects.hashCode(this.name);
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
        final Slujba other = (Slujba) obj;
        if (this.idSlujba != other.idSlujba) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Slujba{" + "idSlujba=" + idSlujba + ", name=" + name + '}';
    }
}
