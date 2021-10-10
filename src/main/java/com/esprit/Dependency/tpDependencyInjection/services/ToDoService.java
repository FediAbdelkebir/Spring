package com.esprit.Dependency.tpDependencyInjection.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esprit.Dependency.tpDependencyInjection.dao.ToDoDao;
import com.esprit.Dependency.tpDependencyInjection.dao.ToDoDao2;


@Service
public class ToDoService {
	@Autowired
	private ToDoDao2 XML;
	@Autowired
	private ToDoDao Spring;

	public List<String> getCoursesList() {
		return XML.getCoursesList();
	}
	public List<String> Spring() {
		return Spring.getCoursesList();
	}
}
