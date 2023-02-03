package com.ifelse;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number ");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" number is even");
		}
		else
		{
			System.out.println(num+" number is odd");
		}
		
	}

}
