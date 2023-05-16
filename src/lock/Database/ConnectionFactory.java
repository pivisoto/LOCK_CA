package lock.Database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
    
    public static Connection getConnection() throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("./nbproject/private/config.properties"));
        String DATABASE_USERNAME = properties.getProperty("DATABASE_USERNAME");
        String DATABASE_PASSWORD = properties.getProperty("DATABASE_PASSWORD");
        String url = "jdbc:mysql://localhost:3306/dbcalok";
        Connection con = null;

        try {
            con = DriverManager.getConnection(url, DATABASE_USERNAME, DATABASE_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
