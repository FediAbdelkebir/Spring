package tn.esprit.esponline.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.esponline.service.IUserService;
	
@Controller
public class UserControlImpl { 
@Autowired
	IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	} 

}
