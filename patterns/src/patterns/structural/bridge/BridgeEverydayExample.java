package patterns.structural.bridge;

import java.sql.DriverManager;

public class BridgeEverydayExample {
    public static void showExample() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            DriverManager
                    .getConnection("jdbc:derby:memory:codejava/webdb;create=true")
                    .createStatement()
                    .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");

            System.out.println("Table created!!!");
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}