package patterns.structural.bridge;

import java.sql.DriverManager;
import java.sql.SQLException;

public class BridgeEverydayExample {
    public static void showExample() {
        try {
            DriverManager
                    .getConnection(
                            "jdbc:derby:memory:codejava/webdb;create=true")
                    .createStatement()
                    .executeUpdate(
                            "CREATE TABLE Address (ID INT, StreetName VARCHAR" +
                                    "(20), City VARCHAR(20))");

            System.out.println("Table created!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}