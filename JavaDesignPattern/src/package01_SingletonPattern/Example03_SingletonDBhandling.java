package package01_SingletonPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example03_SingletonDBhandling {
    private static String db_url;
    private static String db_port;
    private static String db_name;
    private static String db_user;
    private static String db_password;
    private static Statement connection;

    private Example03_SingletonDBhandling() {
        db_url = "jdbc:mysql://localhost";
        db_port = "8080";
        db_name = "mysql";
        db_user = "root";
        db_password = "admin123";
        connection = setConnection();
    }

    private static Statement setConnection() {
        try {
            String url                           = "" + db_url + ":" + db_port + "/" + db_name + "";
            Connection connection   = DriverManager.getConnection(url, db_user, db_password);
            Statement statement      = connection.createStatement();
            return (Statement) statement;
        } catch (SQLException ex) {
            Logger.getLogger(
            		Example03_SingletonDBhandling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static class DbSingletonManagerHolder {
        private final static Example03_SingletonDBhandling instance = 
        		new Example03_SingletonDBhandling();
    }

    public static Example03_SingletonDBhandling getInstance() {
        try {
            return DbSingletonManagerHolder.instance;
        } catch (ExceptionInInitializerError ex) {}
        return null;
    }
    public static Statement getStatement() {
        return connection;
    }
}
