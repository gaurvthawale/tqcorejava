package com.numbers;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		class AgeIsNotNegativeException extends ArithmeticException
		{
			String errormsg;
			public AgeIsNotNegativeException(String errormsg)
			{
				this.errormsg = errormsg;
			}
			
			public String toString()
			{
				return errormsg;
				
			}
			
			
		}
		
		try
		{
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			if(age<0)
			{
				NumberFormatException ex = new NumberFormatException("Number is negative-1");
				throw ex;
			}
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
		}
	}

}
