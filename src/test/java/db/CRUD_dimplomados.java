package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// import org.springframework.boot.context.properties.ConfigurationProperties;

// @ConfigurationProperties(prefix = "mysql-db-connection")
public class CRUD_dimplomados {
    // Also import the corresponding driver to tge packages to the project
    static String URL = "jdbc:oracle:thin:@//187.188.66.253:1521/orcl";  //* Coonection to "diplomados" db
    static String USER = "ruic";
    static String PASSWORD = "oracle1";


    /**
     * Send data to the database.
     * @param param
     */
    public void create(String query, String param) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
//            String query = "INSERT INTO table_name (colummn_name) VALUES (?)"; // query
            PreparedStatement pStatement = connection.prepareStatement(query);
            pStatement.setString(1, param); // replace param into the ? in the pos(int)
            pStatement.executeUpdate(); // excecute the query in the database
            System.out.println("Create query executed properly!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    /**
     * Asks for data from the database.
     * @param param
     */
    public static void readUser(String query) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
//            String query = "SELECT * FROM table_name WHERE constraint = ?"; // query
            ResultSet resultSet = connection.prepareStatement(query).executeQuery(); // excecute query
            System.out.println(resultSet.getFetchSize());
            while (resultSet.next()) { // Read the data from the resultSet using resultSet.next()
                // Implement some logic using resultSet.getString(param)
                System.out.printf("ID: %-10sName: %s %s\n", resultSet.getString("Id"), resultSet.getString("Nombre"), resultSet.getString("Apellido_Paterno"));
            }
            System.out.println("Read query executed properly!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    /**
     * Updates the data in the database within the gived param.
     * @param param
     */
    public static void update(String query, String param) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
//            String query = "UPDATE table_name SET column_name = ? WHERE constraint = ?"; // query
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, param); // replace param into the ? in the pos(int)
            statement.executeUpdate(); // excetute query
            System.out.println("Update query executed properly!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    /**
     * Deletes the data from the database.
     * @param param
     */
    public static void deleteUser(String query, String param) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
//            String query = "DELETE FROM table_name WHERE column = ?"; // where ? would be param
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, param); // replace param into the ? in the pos(int)
            int countRowsUpdated = statement.executeUpdate(); // return the number of rows affected in the query
            if (countRowsUpdated != 0)
                System.out.println("Delete query executed properly!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }


    /**
     * Verifies if there's a connection with the database. <p>
     * @return Connection
     */
    public static Connection checkConnection() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println((connection != null ? "Connection complete\n" + connection.toString() : null));
            return connection;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }


    public static void main(String[] args) {
//        Test_JDBC.checkConnection();
        readUser("SELECT * FROM Persona");
    }
 
}