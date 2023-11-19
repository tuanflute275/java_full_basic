package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            var url = "jdbc:mysql://localhost:3306/java";
            var user = "root";
            var password = "";
            conn = DriverManager.getConnection(url, user, password);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

        return conn;
    }

    public static void closeConnection(Connection conn){
        try {
            if(conn != null){
                conn.close();
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
