package uty.vc.model.beans;

import java.sql.Connection;
import java.util.List;
import javax.sql.DataSource;
import uty.vc.model.entities.User;

public interface BeanInterface {

    public DataSource getDS();

    public String getVersionDB();
    
    public List<User> getAllUsers();
    
    public User getUserByLoginPass(String login, String password);
    
    public User getUserById();
}
