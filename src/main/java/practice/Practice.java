package practice;

import practice.database.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

    public static void main(String[] args) throws SQLException {

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.newConnection();

        String sql = "SELECT * FROM guestLists";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString("host"));
        }

        resultSet.close();
        statement.close();
        connection.close();

        Developer developer = new Developer("Front-end Developer", new String[] {"React", "Angular", "HTML", "CSS"});
        System.out.println(developer.toString());



    }
}
