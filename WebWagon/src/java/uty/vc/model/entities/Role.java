/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uty.vc.model.entities;

import java.util.Objects;

/**
 *
 * @author Muzaffar
 */
public class Role {

    private int idRole;
    private String role;

    public Role() {
    }

    public Role(int idRole, String role) {
        this.idRole = idRole;
        this.role = role;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.idRole;
        hash = 61 * hash + Objects.hashCode(this.role);
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
        final Role other = (Role) obj;
        if (this.idRole != other.idRole) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Role{" + "idRole=" + idRole + ", role=" + role + '}';
    }
}