package com.customexception;

public class InvalidName extends Exception {
	
	String message;
	
	InvalidName()
	{
		super();
	}
	
	InvalidName(String message)
	{
		super(message);
	}
	

}
