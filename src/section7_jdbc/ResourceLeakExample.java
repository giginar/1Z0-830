package section7_jdbc;

import java.sql.*;

public class ResourceLeakExample {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:h2:mem:testdb";

        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT 1");

        // ❌ Never closed → resource leak!
    }
}

