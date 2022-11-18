package com.yash.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yash.form.UserForm;

public class UserAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserForm user=(UserForm) form;
		if(user.getUsername().equals("admin") && user.getPassword().equals("123"))
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		//return super.execute(mapping, form, request, response);
	}
	
	

}
