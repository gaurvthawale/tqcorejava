package com.operators;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the month number: ");
		
		int month = sc.nextInt();
		
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days");
		case 2:
			System.out.println("Enter the year : ");
			int year = sc.nextInt();
			
			if((year%400==0)||((year%4==0)&&(year%100!=0)))
			{
				System.out.println("29 Days");	
			}
			else
			{
				System.out.println("28 Days");
			}
			
		
		}
		sc.close();
	}

}
