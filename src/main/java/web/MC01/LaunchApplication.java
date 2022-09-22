package web.MC01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class LaunchApplication {
	// Main application
	public static void main(String[] args) {
		SpringApplication.run(LaunchApplication.class, args);
	}

	// Yesnt










	
}