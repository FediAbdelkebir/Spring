package com.esprit.Dependency.tpDependencyInjection;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.esprit.Dependency.tpDependencyInjection.controller.ToDoController;



@Configuration
@ComponentScan
public class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Main.class)) {

			ToDoController toDoController = applicationContext.getBean(ToDoController.class);
			System.out.println("Les Cours De La Matiere XML : ");
			System.out.println(toDoController.GetXML());
			System.out.println("Les Cours De La Matiere Spring : ");
			System.out.println(toDoController.Spring());
			
		}
		
		
	
	
		}
}
