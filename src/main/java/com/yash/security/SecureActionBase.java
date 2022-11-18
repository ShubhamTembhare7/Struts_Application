package com.yash.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public abstract class SecureActionBase extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession();
		
		String user=(String) session.getAttribute("username");
		if(user==null)
		return mapping.findForward("logon");
		return doexecute(mapping, form, request, response);
	}

	
	public abstract ActionForward doexecute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response);

}
