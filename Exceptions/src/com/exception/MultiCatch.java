package com.exception;

public class MultiCatch {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int i= 10;
			int j=0;
			
		}
		catch(NullPointerException | ArrayStoreException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Number format exception..");
		}

	}

}
