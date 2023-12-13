package practice.database;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Data
public class DatabaseConnection {
    private String username = "root";
    private String password = "Kaisenjujutsu@101010";

    public Connection newConnection() throws SQLException {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        }catch (Exception e){
//            System.out.println(e);
//        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/guestCheckIn", username, password);
        return connection;
    }
}
