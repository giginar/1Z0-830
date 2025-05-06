package section7_jdbc;

import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:h2:mem:testdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            stmt.execute("CREATE TABLE account (id INT PRIMARY KEY, name VARCHAR(100), balance DOUBLE)");
            stmt.execute("INSERT INTO account VALUES (1, 'Alice', 1000), (2, 'Bob', 500)");

            String sql = "SELECT * FROM account WHERE balance > ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setDouble(1, 600);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(rs.getString("name") + " has $" + rs.getDouble("balance"));
                    }
                }
            }
        }
    }
}

