package uty.vc.model.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private int id_user;

    private String fName;

    private String lName;

    private String login;

    private String pass;

    private String email;

    private Slujba slujba;

    private Doljnost doljnost;

    public User() {
    }

    public User(int id_user, String fName, String lName, String login, String pass, String email, Slujba slujba, Doljnost doljnost) {
        this.id_user = id_user;
        this.fName = fName;
        this.lName = lName;
        this.login = login;
        this.pass = pass;
        this.email = email;
        this.slujba = slujba;
        this.doljnost = doljnost;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Slujba getSlujba() {
        return slujba;
    }

    public void setSlujba(Slujba slujba) {
        this.slujba = slujba;
    }

    public Doljnost getDoljnost() {
        return doljnost;
    }

    public void setDoljnost(Doljnost doljnost) {
        this.doljnost = doljnost;
    }

    @Override
    public String toString() {
        return "User{" + "id_user=" + id_user + ", fName=" + fName + ", lName=" + lName + ", login=" + login + ", pass=" + pass + ", email=" + email + ", slujba=" + slujba + ", doljnost=" + doljnost + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id_user;
        hash = 47 * hash + Objects.hashCode(this.fName);
        hash = 47 * hash + Objects.hashCode(this.lName);
        hash = 47 * hash + Objects.hashCode(this.login);
        hash = 47 * hash + Objects.hashCode(this.pass);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + Objects.hashCode(this.slujba);
        hash = 47 * hash + Objects.hashCode(this.doljnost);
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
        final User other = (User) obj;
        if (this.id_user != other.id_user) {
            return false;
        }
        if (!Objects.equals(this.fName, other.fName)) {
            return false;
        }
        if (!Objects.equals(this.lName, other.lName)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.pass, other.pass)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.slujba, other.slujba)) {
            return false;
        }
        if (!Objects.equals(this.doljnost, other.doljnost)) {
            return false;
        }
        return true;
    }

    
}
