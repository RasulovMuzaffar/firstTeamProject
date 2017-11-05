package uty.vc.model.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private int idUser;

    private String fName;

    private String lName;

    private String login;

    private String pass;

    private String email;

    private int idSljb;

    private int idDolj;
    private int idRole;

    public User() {
    }

    public User(int idUser, String fName, String lName, String login, String pass, String email, int idSljb, int idDolj, int idRole) {
        this.idUser = idUser;
        this.fName = fName;
        this.lName = lName;
        this.login = login;
        this.pass = pass;
        this.email = email;
        this.idSljb = idSljb;
        this.idDolj = idDolj;
        this.idRole = idRole;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public int getIdSljb() {
        return idSljb;
    }

    public void setIdSljb(int idSljb) {
        this.idSljb = idSljb;
    }

    public int getIdDolj() {
        return idDolj;
    }

    public void setIdDolj(int idDolj) {
        this.idDolj = idDolj;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.idUser;
        hash = 73 * hash + Objects.hashCode(this.fName);
        hash = 73 * hash + Objects.hashCode(this.lName);
        hash = 73 * hash + Objects.hashCode(this.login);
        hash = 73 * hash + Objects.hashCode(this.pass);
        hash = 73 * hash + Objects.hashCode(this.email);
        hash = 73 * hash + this.idSljb;
        hash = 73 * hash + this.idDolj;
        hash = 73 * hash + this.idRole;
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
        if (this.idUser != other.idUser) {
            return false;
        }
        if (this.idSljb != other.idSljb) {
            return false;
        }
        if (this.idDolj != other.idDolj) {
            return false;
        }
        if (this.idRole != other.idRole) {
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
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", fName=" + fName + ", lName=" + lName + ", login=" + login + ", pass=" + pass + ", email=" + email + ", idSljb=" + idSljb + ", idDolj=" + idDolj + ", idRole=" + idRole + '}';
    }

}
