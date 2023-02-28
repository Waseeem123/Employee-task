package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.dto.Employee;

@Repository
public class EmployeeDao
{

	@Autowired
    EntityManager manager;
	@Autowired
	EntityTransaction transaction;
	public void insertValues(Employee employee)
	{
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
	
	public Employee getEmployeeById(int id)
	{
		Employee e= manager.find(Employee.class, id);
		return e;
	}
	public void deleteEmployee(int id)
	{
		Employee employee=manager.find(Employee.class,id);
		transaction.begin();
		manager.remove(employee);
		transaction.commit();
	}
}
