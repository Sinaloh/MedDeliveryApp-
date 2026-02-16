import java.sql.*;

public class DatabaseConnection {
    private static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/meddeliverydb";
            String user = "root";
            String password = "";
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean loginUser(String email, String password, String role) {
        try (Connection conn = connect()) {
            String query = "SELECT * FROM users WHERE email = ? AND password = ? AND role = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, password);
            stmt.setString(3, role);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void placeOrder(String email, String medication, String address) {
        try (Connection conn = connect()) {
            String query = "INSERT INTO orders (patient_email, medication, address, status) VALUES (?, ?, ?, 'Pending')";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, medication);
            stmt.setString(3, address);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
