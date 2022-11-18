package com.yash.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.LookupDispatchAction;

public class LookUpDispatchAct extends LookupDispatchAction {

	
	public ActionForward insert(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Insert Button Click");
		return mapping.findForward("success");
	}
	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Update Button Click");
		return mapping.findForward("success");
	}
	@Override
	protected Map getKeyMethodMap() {
	Map m1=new HashMap<String, String>();
	m1.put("dispatch.form.insert", "insert");
	m1.put("dispatch.form.update", "update");
	
		return m1;
	}


}
