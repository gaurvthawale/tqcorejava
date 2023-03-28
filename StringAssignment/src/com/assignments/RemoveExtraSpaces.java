package com.assignments;

import java.util.Scanner;

public class RemoveExtraSpaces {

	public static void removeExtraSpaces(String str)
	{
		str = str.trim();
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.nextLine();
		removeExtraSpaces(str);

	}

}
