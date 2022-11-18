package com.yash.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yash.dao.EmployeeDaoImpl;



public class PagerAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//return super.execute(mapping, form, request, response);
		//request.setAttribute("name", "Shubham");
		
		request.setAttribute("employees", new EmployeeDaoImpl().getAllEmployee());
		
		System.out.println(new EmployeeDaoImpl().getAllEmployee());
		
		return mapping.findForward("success");
	}

}
