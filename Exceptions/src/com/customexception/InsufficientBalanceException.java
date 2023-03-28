package com.customexception;

public class InsufficientBalanceException extends Exception {

	String message;
	
	InsufficientBalanceException()
	{
		
	}
	
	InsufficientBalanceException(String message)
	{
		super(message);
	}
	
	
}
