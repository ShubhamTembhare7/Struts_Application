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

public class EmployeeUpdate extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
           int eid=Integer.parseInt(request.getParameter("eid"));
           System.out.println("hello"+eid);
		
		Employee employee=null;
		try {
			employee=new EmployeeDaoImpl().getEmployeeById(eid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("employees", employee);
		
		
			
		//request.setAttribute("emp", new EmployeedaoImpl().getall());
		//new EmployeedaoImpl().updateemployee(e)(Integer.parseInt(request.getParameter("id")));
		return mapping.findForward("update");
	}

	
}
