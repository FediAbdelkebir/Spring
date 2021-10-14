package tnesprit.spring;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("tnesprit.Model")
@SpringBootApplication
public class SpringEspritApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8085");
		String url = "jdbc:mysql://localhost:3306/springbootesprit?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "";

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
		SpringApplication.run(SpringEspritApplication.class, args);
	}

}
