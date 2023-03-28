package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SplitString {

	public static void splitString(String str)
	{
		int index=0;
	
		int k=0;
		for(int i=0;i<str.length();i++)
		{
			if(i==str.length()-1)
			{
				System.out.println(str.substring(index,i+1));
			}
			
			if(str.charAt(i)==' ')
			{
				System.out.println( str.substring(index,i));
				index=i+1;
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		System.out.println(str);
		splitString(str);
		
		

	}

}
