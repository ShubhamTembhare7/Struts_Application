package com.yash.action;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.yash.form.User;

public class UploadAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//File Uploading
	User u1=(User)form;
		FormFile file=u1.getFile();
		
		ByteArrayInputStream bstream=(ByteArrayInputStream) file.getInputStream();
		
		String s1="";
		 
		int i;
		
		while((i=bstream.read())!=-1) {
			
			s1+=(char)i;
		}
		System.out.println(s1);
		
		request.setAttribute("filedata",s1);
		return mapping.findForward("success");
	
	}

		 
}