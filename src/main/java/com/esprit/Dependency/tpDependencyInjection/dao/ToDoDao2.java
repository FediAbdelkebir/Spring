package com.esprit.Dependency.tpDependencyInjection.dao;

import java.util.ArrayList;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ToDoDao2 implements IToDoDao {

	public List<String> getCoursesList() {

		List<String> courses = new ArrayList<String>();
		courses.add("diagramme de cas utilisation");
		courses.add("diagramme de classes");
		courses.add("diagramme de séquences");
		courses.add("diagramme état transition");
		return courses;
	}
}
