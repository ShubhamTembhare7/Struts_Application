package com.yash.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class DispatchActionForLangauge extends DispatchAction {

	
	public ActionForward English(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("In a English Langauge"+request.getParameter("langauge"));
		return mapping.findForward("success");
		//return super.execute(mapping, form, request, response);
	}
	
	public ActionForward Hindi(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("In a Hindi Langauge"+request.getParameter("langauge"));
		return mapping.findForward("success");
		//return super.execute(mapping, form, request, response);
	}

}
