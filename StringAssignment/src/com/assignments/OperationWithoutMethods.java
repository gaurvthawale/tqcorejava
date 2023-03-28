package com.assignments;


import java.util.Scanner;

public class OperationWithoutMethods {
	
	
	
	public static void reverseString(String str)
	{
		char[] arr = str.toCharArray();
		String ptr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			ptr=ptr+str.charAt(i) ;
		}
		System.out.println();
		System.out.println("Reversed string is:"+ptr);
		
		
	}

	public static void lengthOfString(String str)
	{
		char[] arr = str.toCharArray();
		int i=0;
		for(char ch : arr)
		{
			
			i++;
			System.out.print(ch);
		}
		System.out.println();
		System.out.println("Length of string is:"+i);
		
		
	}
	
	public static void concatString(String str,String concet)
	{
		str= str+concet;
		System.out.println("New String is:"+str);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("enter string to concat");
		String ptr = sc.next();
		
		System.out.println(str);
		lengthOfString(str);
		concatString(str, ptr);
		reverseString(str);
		
		

	}

}
