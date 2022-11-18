package com.yash.exception;

public class SalaryInvalidException extends Exception {
	  String message;
	    public SalaryInvalidException(String message)
	    {
	        this.message=message;
	    }
	    
	    public void setMessage(String message)
	    {
	        this.message=message;
	    }
}
