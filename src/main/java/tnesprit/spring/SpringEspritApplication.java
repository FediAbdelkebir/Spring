package tnesprit.spring;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import tn.esprit.Repository.FournisseurRepository;
import tn.esprit.Repository.RayonRepository;
import tnesprit.Model.Fournisseur;
import tnesprit.Model.Rayon;

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

	/*Initialisation Fournisseur When Appliaction Starts Disable if application is set to Update*/
	@Bean
    public CommandLineRunner InsertFourinsseur(FournisseurRepository repo){
		Fournisseur F1=new Fournisseur("CodeF1","Fournisseur1");
		Fournisseur F2=new Fournisseur("CodeF2","Fournisseur2");
		Fournisseur F3=new Fournisseur("CodeF3","Fournisseur3");
        return args -> { 
            repo.save(F1);
            repo.save(F2);
            repo.save(F3);
        };
    }
	/*Initialisation Rayon When Appliaction Starts Disable if application is set to Update*/
	@Bean
    public CommandLineRunner InsertRayon(RayonRepository repo){
		Rayon R1=new Rayon("CodeR1","Rayon1");
		Rayon R2=new Rayon("CodeR2","Rayon2");
		Rayon R3=new Rayon("CodeR3","Rayon3");
        return args -> { 
            repo.save(R1);
            repo.save(R2);
            repo.save(R3);
        };
    }
}
