package uty.vc.model.entities;

import java.sql.Timestamp;
import java.util.Objects;

public class LogErrAuth {
private int id;
private String ip;
private String login;
private String password;
private Timestamp currDate;

    public LogErrAuth() {
    }

    public LogErrAuth(int id, String ip, String login, String password, Timestamp currDate) {
        this.id = id;
        this.ip = ip;
        this.login = login;
        this.password = password;
        this.currDate = currDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCurrDate() {
        return currDate;
    }

    public void setCurrDate(Timestamp currDate) {
        this.currDate = currDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.ip);
        hash = 67 * hash + Objects.hashCode(this.login);
        hash = 67 * hash + Objects.hashCode(this.password);
        hash = 67 * hash + Objects.hashCode(this.currDate);
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
        final LogErrAuth other = (LogErrAuth) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.ip, other.ip)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.currDate, other.currDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LogErrAuth{" + "id=" + id + ", ip=" + ip + ", login=" + login + ", password=" + password + ", currDate=" + currDate + '}';
    }


}
