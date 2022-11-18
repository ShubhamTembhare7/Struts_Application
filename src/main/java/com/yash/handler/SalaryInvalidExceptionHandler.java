package com.yash.handler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;

public class SalaryInvalidExceptionHandler extends ExceptionHandler{

	@Override
	public ActionForward execute(Exception ex, ExceptionConfig ae, ActionMapping mapping, ActionForm formInstance,
			HttpServletRequest request, HttpServletResponse response) throws ServletException {
		 request.setAttribute("message", ex.getMessage());
	        request.setAttribute("url", request.getRequestURI()+"?"+request.getQueryString());
	        request.setAttribute("exception", ex);
		return super.execute(ex, ae, mapping, formInstance, request, response);
	}

}
