package com.yash.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yash.dao.EmployeeDaoImpl;
import com.yash.form.Employee;

public class EmployeeUpdateorInsert extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			Employee employee=new EmployeeDaoImpl().getEmployeeById(Integer.parseInt(request.getParameter("eid")));
			System.out.println("Inside updateorinsert");
			int eid=Integer.parseInt(request.getParameter("eid"));
			System.out.println("In id run");
			String ename=request.getParameter("ename");
			int deptid=Integer.parseInt(request.getParameter("deptid"));
			int salary=Integer.parseInt(request.getParameter("salary"));
			String designation=request.getParameter("designation");
			int mgrid=Integer.parseInt(request.getParameter("mgrid"));
			String password=request.getParameter("password");
			
			
			if(employee!=null){
				
				
				Employee emp=new Employee(eid,ename,deptid,salary,designation,mgrid,password);
				new EmployeeDaoImpl().updateEmployee(emp);
			}
			
			else{
				Employee emp=new Employee(eid,ename,deptid,salary,designation,mgrid,password);
				new EmployeeDaoImpl().addEmployee(emp);
				
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All done");
		request.setAttribute("employees", new EmployeeDaoImpl().getAllEmployee());
		return mapping.findForward("success");
	}
	
	}


