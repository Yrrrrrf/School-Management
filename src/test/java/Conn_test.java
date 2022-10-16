
import java.sql.Connection;
import java.sql.ResultSet;

import database.entity.User;

public class Conn_test {
    

    public static User getUser(Connection connection, int id) {
        try {
            ResultSet resultSet = connection.prepareStatement("SELECT * FROM Persona WHERE Id = 10099").executeQuery(); // excecute query
            System.out.println(resultSet.getFetchSize());
            while (resultSet.next()) { // Read the data from the resultSet using resultSet.next()
                // Implement some logic using resultSet.getString(param)
                System.out.printf("ID: %-10sName: %s %s\n", resultSet.getString("Id"), resultSet.getString("Nombre"), resultSet.getString("Apellido_Paterno"));
            }
            System.out.println("Read query executed properly!");
            return new User(Integer.valueOf(resultSet.getString("Id")), resultSet.getString("Nombre"), resultSet.getString("Apellido_Paterno"));
        } catch (Exception e) {}
        return null;
    }


    public static void main(String[] args) {
        // getUser(connection, id)
    }
}
