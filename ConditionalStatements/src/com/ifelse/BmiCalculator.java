package com.ifelse;

import java.util.Scanner;

public class BmiCalculator {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter subject1 marks: ");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter subject2 marks: ");
		int sub2 = sc.nextInt();
		
		System.out.println("Enter subject3 marks: ");
		int sub3 = sc.nextInt();
		
		System.out.println("Enter subject4 marks: ");
		int sub4 = sc.nextInt();
		
		System.out.println("Enter subject5 marks: ");
		int sub5 = sc.nextInt();
		
		float per = (sub1+sub2+sub3+sub4+sub5)/5;
		
		System.out.println("Percentage is : ");
		if(per>18)
		{
			if(per<=25)
			{
				System.out.println("You are healthy..");
			}
			
			else
			{
				System.out.println("You are obese..");
			}
		}
		else
		{
			System.out.println("You are underweight..");
		}
		sc.close();
	}
	
	

}
