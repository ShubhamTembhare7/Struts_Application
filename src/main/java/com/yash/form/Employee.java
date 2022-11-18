package com.yash.form;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;

import com.yash.dao.EmployeeDaoImpl;

public class Employee extends ActionForm {
private int eid;
private String ename;
private int deptid;
private int salary;
private String designation;
private int mgrid;
private String password;


public Employee(int eid, String ename, int deptid, int salary, String designation, int mgrid, String password) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.deptid = deptid;
	this.salary = salary;
	this.designation = designation;
	this.mgrid = mgrid;
	this.password = password;
}


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public int getEid() {
	return eid;
}


public void setEid(int eid) {
	this.eid = eid;
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public int getDeptid() {
	return deptid;
}


public void setDeptid(int deptid) {
	this.deptid = deptid;
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}


public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}


public int getMgrid() {
	return mgrid;
}


public void setMgrid(int mgrid) {
	this.mgrid = mgrid;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", deptid=" + deptid + ", salary=" + salary + ", designation="
			+ designation + ", mgrid=" + mgrid + ", password=" + password + "]";
}


/*Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
  ActionErrors errors=new ActionErrors();
  if(this.ename==null || this.ename.trim().length()==0)
	  errors.add("ename",new ActionMessage("error.form.null","ename"));
  
  if(this.designation==null || this.designation.trim().length()==0)
	  errors.add("designation",new ActionMessage("error.form.null","designation"));
  
  if(this.salary<10000 || this.salary>50000)
	  errors.add("salary",new ActionMessage("error.range",new Object[] {"salary","10000","50000"}));
  
	
	 * if(!errors.isEmpty()) request.setAttribute("hasError", "true"); return
	 * errors;
	 
  try {
	if(new EmployeeDaoImpl().doesEmployeeNameExits(this.ename));
	errors.add("ename",new ActionMessage("error.exits","ename"));
} catch (SQLException e) {}
	if(!errors.isEmpty()) 
		request.setAttribute("hasError", "true");
		
	 Pattern p = Pattern.compile("^[A-Za-z]+$", Pattern.CASE_INSENSITIVE);
     Matcher m = p.matcher(this.ename);
     
     if(!m.find())
    	 errors.add("ename",new ActionMessage("error.invalid.regex"));
     
    
    	 
return errors;

  */
}
