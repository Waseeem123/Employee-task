package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

@RestController
public class EmployeeController 
{
@Autowired
EmployeeDao dao;
@RequestMapping("/emp")
public ModelAndView insertEmployee()
{
	ModelAndView view =new ModelAndView();
	view.addObject("employee",new Employee());
	view.setViewName("create.jsp");
	return view;
}
@RequestMapping("/save")
public String saveEmployee(@ModelAttribute Employee employee)
{
dao.insertValues(employee);	
return "employee details inserted...";
}


@RequestMapping("/search")
public ModelAndView searchEmployee()
{
	ModelAndView view = new ModelAndView();
	view.addObject("employee",new Employee());
	view.setViewName("get.jsp");
	return view;
}

@RequestMapping("/view")
public ModelAndView findEmp(@ModelAttribute Employee employee)
{
	ModelAndView view =new ModelAndView();
	Employee emp =dao.getEmployeeById(employee.getId());
	view.addObject("employee",emp);
	view.setViewName("display.jsp");
	return view;
}


@RequestMapping("/delete")
public ModelAndView deleteEmployee()
{
	ModelAndView view =new ModelAndView();
	view.addObject("employee",new Employee());
	view.setViewName("Delete.jsp");
	return view;
}

@RequestMapping("/del")
public String delEmp(@ModelAttribute Employee employee)
{
	dao.deleteEmployee(employee.getId());
	return "Employee details deleted";
}
}
