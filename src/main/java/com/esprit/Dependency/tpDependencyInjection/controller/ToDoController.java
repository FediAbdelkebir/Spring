package com.esprit.Dependency.tpDependencyInjection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

import com.esprit.Dependency.tpDependencyInjection.services.ToDoService;

@Controller
public class ToDoController {
	@Autowired
	ToDoService toDoService;

	public List<String> GetXML() {
		return toDoService.getCoursesList();
	}
	@Primary
	public List<String> Spring() {
		return toDoService.Spring();
	}
}
