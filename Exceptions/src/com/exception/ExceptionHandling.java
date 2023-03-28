package com.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =10;
		int y = 10;
		
		try
		{
			int sum= x/y;
			System.out.println(sum);
			System.out.println("Within the try catch block");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception handling practice ");

	}

}
