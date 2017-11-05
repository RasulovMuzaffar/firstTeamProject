/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uty.vc.dbconn;

import java.sql.Connection;

/**
 *
 * @author Muzaffar
 */
public interface DB {
    public Connection getJNDIConn();
}
