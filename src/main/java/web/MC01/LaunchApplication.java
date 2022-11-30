/**
 * Project MC01
 * @author Reza Campos Fernando Bryan (Yrrrrrf)
 * @since v0.0.1
 */


package web.MC01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * <h3>MC01</h3>
 * Web  School Management Application.
 * <p>
 * Allows users to search for data from a database of a school using a web interface.
 */
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// @SpringBootApplication()
// @SpringBootApplication(scanBasePackages = {"MC01.*"})
// @SpringBootApplication(scanBasePackages = {"MC01.domain.service.*"})
@SpringBootApplication(scanBasePackages = {"MC01.db.crud.StudentCrudRepository",
											"MC01.*",
											"MC01.web.MC01.controller.*"})
@ComponentScan(basePackages = {"MC01.db.crud.*"})
public class LaunchApplication {


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(LaunchApplication.class, args);
	}


}
