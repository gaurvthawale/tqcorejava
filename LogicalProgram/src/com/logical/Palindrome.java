package com.logical;

import java.util.Scanner;

public class Palindrome {

	public static void palindrome(int num)
	{
		int original = num;
		int reversenum = 0;
		
		while(num!=0)
		{
			int rem = num%10;
			reversenum= (reversenum*10)+rem;
			System.out.println(reversenum);
			num=num/10;
			
		}
		if(original==reversenum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		
		
		
	}

}
