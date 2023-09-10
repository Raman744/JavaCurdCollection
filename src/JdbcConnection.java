import java.io.FileInputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcConnection {

    private static Properties properties = new Properties();
    static {
        try {
            properties.load(new FileInputStream(
                    "D://JAVA Practice//JavaJDBC//JavaCURDUsingCollection//JavaCurdCollection//src//db.properties"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            String url = properties.getProperty("db.url");
            String name = properties.getProperty("db.userName");
            String password = properties.getProperty("db.password");

            System.out.println(properties);
            connection = DriverManager.getConnection(url, name, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static String getInsertUserSQL() {
        return properties.getProperty("INSERT_USER_SQL");
    }

}