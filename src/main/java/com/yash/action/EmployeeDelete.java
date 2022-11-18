package com.yash.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yash.dao.EmployeeDaoImpl;
import com.yash.form.DeleteAndUpdateForm;

public class EmployeeDelete extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
//		DeleteAndUpdateForm du=(DeleteAndUpdateForm) form;
		int eid=Integer.parseInt(request.getParameter("eid"));
		System.out.println("empDelete eid="+eid);
		new EmployeeDaoImpl().deleteEmployeeById(eid);
        request.setAttribute("employees", new EmployeeDaoImpl().getAllEmployee());
        return mapping.findForward("success");
	

}}
