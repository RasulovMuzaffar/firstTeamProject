package uty.vc.dbconn;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.ejb.Stateless;

@Stateless
public class DBConnection implements DBConnectionLocal {

    private Connection con;

    /**
     *
     * @return @throws IOException
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public Connection connect() throws IOException, ClassNotFoundException, SQLException {

        String driverName = "com.ibm.db2.jcc.DB2Driver";
        Class<?> forName = Class.forName(driverName);
        String url = "jdbc:db2://10.73.2.30:1446/UZGVCDB2AST2";
        String name = "user10";
        String password = "123";
        con = DriverManager.getConnection(url, name, password);
        if (con != null) {
            return con;
        } else {
            return null;
        }
    }

    /**
     *
     * @throws SQLException
     */
    @Override
    public void closeCon() throws SQLException {

        con.close();

    }
}
