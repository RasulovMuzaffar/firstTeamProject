package uty.vc.model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Slujba implements Serializable {

    private int id_slujba;

    private String name;

    public Slujba() {
    }

    public Slujba(int id_slujba, String name) {
        this.id_slujba = id_slujba;
        this.name = name;
    }

    public int getId_slujba() {
        return id_slujba;
    }

    public void setId_slujba(int id_slujba) {
        this.id_slujba = id_slujba;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id_slujba;
        hash = 41 * hash + Objects.hashCode(this.name);
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
        if (this.id_slujba != other.id_slujba) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Slujba{" + "id_slujba=" + id_slujba + ", name=" + name + '}';
    }

}
