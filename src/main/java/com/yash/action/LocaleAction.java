package com.yash.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LocaleAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println(request.getParameter("langauge"));
		Locale locale=new Locale(request.getParameter("langauge"));
		HttpSession session=request.getSession();
		session.setAttribute("org.apache.struts.action.LOCALE",locale);
		return mapping.findForward("success");
	}

}
