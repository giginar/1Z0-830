package section7_jdbc.bank;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankService {
    private final Connection connection;

    public BankService(Connection connection) {
        this.connection = connection;
    }

    public void createTable() throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("""
                CREATE TABLE IF NOT EXISTS account (
                    id INT PRIMARY KEY,
                    name VARCHAR(100),
                    balance DOUBLE
                )
            """);
        }
    }

    public void insert(int id, String name, double balance) throws SQLException {
        try (PreparedStatement ps = connection.prepareStatement("INSERT INTO account VALUES (?, ?, ?)")) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, balance);
            ps.executeUpdate();
        }
    }

    public String getNameById(int id) throws SQLException {
        String sql = "SELECT name FROM account WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return rs.next() ? rs.getString("name") : null;
        }
    }

    public List<String> getAllNames() throws SQLException {
        List<String> names = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT name FROM account")) {
            while (rs.next()) {
                names.add(rs.getString("name"));
            }
        }
        return names;
    }

    public void updateBalance(int id, double newBalance) throws SQLException {
        try (PreparedStatement ps = connection.prepareStatement("UPDATE account SET balance = ? WHERE id = ?")) {
            ps.setDouble(1, newBalance);
            ps.setInt(2, id);
            ps.executeUpdate();
        }
    }

    public void deleteAccount(int id) throws SQLException {
        try (PreparedStatement ps = connection.prepareStatement("DELETE FROM account WHERE id = ?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}

