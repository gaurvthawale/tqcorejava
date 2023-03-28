package com.customexception;

public class InvalidMarks extends Exception {
	
	String message;
	
	InvalidMarks()
	{
		super();
	}
	
	InvalidMarks(String message)
	{
		super(message);
	}
	

}
