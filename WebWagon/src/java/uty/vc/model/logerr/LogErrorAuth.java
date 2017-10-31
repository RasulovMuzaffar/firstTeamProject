package uty.vc.model.logerr;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class LogErrorAuth implements Serializable {

    private int id_log;

    private String ipAdress;

    private String login;

    private String pass;

    private Timestamp dateLogIn;

    public LogErrorAuth() {
    }

    public LogErrorAuth(int id_log, String ipAdress, String login, String pass, Timestamp dateLogIn) {
        this.id_log = id_log;
        this.ipAdress = ipAdress;
        this.login = login;
        this.pass = pass;
        this.dateLogIn = dateLogIn;
    }

    public int getId_log() {
        return id_log;
    }

    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
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

    public Timestamp getDateLogIn() {
        return dateLogIn;
    }

    public void setDateLogIn(Timestamp dateLogIn) {
        this.dateLogIn = dateLogIn;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id_log;
        hash = 17 * hash + Objects.hashCode(this.ipAdress);
        hash = 17 * hash + Objects.hashCode(this.login);
        hash = 17 * hash + Objects.hashCode(this.pass);
        hash = 17 * hash + Objects.hashCode(this.dateLogIn);
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
        final LogErrorAuth other = (LogErrorAuth) obj;
        if (this.id_log != other.id_log) {
            return false;
        }
        if (!Objects.equals(this.ipAdress, other.ipAdress)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.pass, other.pass)) {
            return false;
        }
        if (!Objects.equals(this.dateLogIn, other.dateLogIn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LogErrorAuth{" + "id_log=" + id_log + ", ipAdress=" + ipAdress + ", login=" + login + ", pass=" + pass + ", dateLogIn=" + dateLogIn + '}';
    }

}
