package tn.esprit.esponline;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import tn.esprit.esponline.config.BeansConfiguration;

@Configuration
@ComponentScan("tn.esprit.esponline")
public class Demo {
	private ApplicationContext context;
	public void verifyBeans () {
		

		// Chargement du Conteneur Spring IoC : 
		//context = new ClassPathXmlApplicationContext("tp1-beans.xml");
		context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		 
		System.out.println("Contains userControlImpl " + context.containsBeanDefinition("userControl"));
		System.out.println("Contains userServiceImpl " + context.containsBeanDefinition("userService"));
		System.out.println("Contains userDAOImpl " + context.containsBeanDefinition("userDAO"));

		System.out.println("Out of verifyBeans() : ");
	}
	
	public static void main(String[] args)
	{
		Demo demo = new Demo(); 
		demo.verifyBeans();
	} 
}