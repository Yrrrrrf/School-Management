package db;
import java.sql.Connection;
import java.sql.DriverManager;

public class StudentConnection {


    public static Connection getStudentConnection() {
        try (Connection connection = DriverManager.getConnection("", "", "")) {
            return connection;
        } catch (Exception e) {
            System.out.println("Conneciton Error:\n"+e);
        }
        return null;
    }
}