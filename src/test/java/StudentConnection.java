import java.sql.Connection;
import java.sql.DriverManager;

public class StudentConnection {


    public static Connection getStudentConnection() {
        // TODO: Fix the parameters to connect to the database
        try (Connection connection = DriverManager.getConnection("", "", "")) {
            return connection;
        } catch (Exception e) {
            System.out.println("Conneciton Error:\n"+e);
        }
        return null;
    }
}