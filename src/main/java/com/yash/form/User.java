package com.yash.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class User extends ActionForm{

	private String username;
	private FormFile file;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public FormFile getFile() {
		return file;
	}
	public void setFile(FormFile file) {
		this.file = file;
	}
}
