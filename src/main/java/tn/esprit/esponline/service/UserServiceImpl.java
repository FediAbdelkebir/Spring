package tn.esprit.esponline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.dao.IUserDAO;

@Service ("UserServiceImpl")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserDAO userDAO;
	
	@Autowired
	public IUserDAO getUserDAO() {
		return userDAO;
	}
	@Autowired
	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

	
	
}
