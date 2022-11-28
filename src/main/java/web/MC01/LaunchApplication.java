/**
 * Project MC01
 * @author Reza Campos Fernando Bryan (Yrrrrrf)
 * @since v0.0.1
 */


package web.MC01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * <h3>MC01</h3>
 * Web  School Management Application.
 * <p>
 * Allows users to search for data from a database of a school using a web interface.
 */

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication()
// @SpringBootApplication(scanBasePackages = {"web.MC01", "database.crud", "database.entity", "service"})
public class LaunchApplication {


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(LaunchApplication.class, args);
	}


}
