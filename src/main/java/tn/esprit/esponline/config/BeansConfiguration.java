package tn.esprit.esponline.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tn.esprit.esponline.control.UserControlImpl;
import tn.esprit.esponline.dao.UserDAOImpl;
import tn.esprit.esponline.service.UserServiceImpl;

/* Use @Configuration annotation to tell spring AnnotationConfigApplicationContext that this class is bean configuration java class. */
@Configuration
public class BeansConfiguration {
	
	@Bean(name="userControl")
	public UserControlImpl getUserControl()
	{
		UserControlImpl uc = new UserControlImpl(); 
		uc.setUserService(getUserService());
		return uc;
	}

	@Bean(name="userService")
	public UserServiceImpl getUserService()
	{
		UserServiceImpl us = new UserServiceImpl(); 
		us.setUserDAO(getUserDAO());
		return us;
	} 
	
	@Bean(name="userDAO")
	public UserDAOImpl getUserDAO()
	{
		UserDAOImpl ud = new UserDAOImpl(); 
		return ud;
	}
	
}