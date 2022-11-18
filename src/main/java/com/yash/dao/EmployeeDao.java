package com.yash.dao;

import java.sql.SQLException;
import java.util.List;

import com.yash.*;
import com.yash.form.Employee;


public interface EmployeeDao {
	
	 public List<Employee> getAllEmployee() throws SQLException;
	  
	  public Employee getEmployeeById(int id) throws SQLException;
	  
	  public void addEmployee(Employee employee) throws SQLException;
	  
	  public void deleteEmployeeById(int id) throws SQLException;
	  
	  public void updateEmployee(Employee employee) throws SQLException;
	  
	 public boolean doesEmployeeExits(int id) throws SQLException;
	 
	 public boolean doesEmployeeNameExits(String name) throws SQLException;
	
	 public boolean isEmployeeLoginValid(String username,String password) throws SQLException;
	
}
