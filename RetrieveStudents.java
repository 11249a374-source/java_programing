// Experiment 10(a): Backend connectivity and data retrieval using JDBC
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveStudents {
    public static void main(String[] args) {
        String sql = "SELECT student_id, student_name, department FROM students";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("ID\tName\t\tDepartment");
            System.out.println("--------------------------------");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("student_id") + "\t" +
                    rs.getString("student_name") + "\t\t" +
                    rs.getString("department")
                );
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
