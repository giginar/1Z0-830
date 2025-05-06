package section7_jdbc;

import java.sql.*;

public class CallableStatementExample {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:h2:mem:testdb";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            stmt.execute("CREATE ALIAS DOUBLE_SALARY FOR \"java.lang.Math.abs\""); // alias to simulate a stored proc

            try (CallableStatement cs = conn.prepareCall("{? = call DOUBLE_SALARY(?)}")) {
                cs.registerOutParameter(1, Types.DOUBLE);
                cs.setDouble(2, -1234.56);
                cs.execute();
                System.out.println("Result: " + cs.getDouble(1)); // 1234.56
            }
        }
    }
    // 🔹 Real DBs would call real stored procedures; H2 lets us simulate with ALIAS.
}

