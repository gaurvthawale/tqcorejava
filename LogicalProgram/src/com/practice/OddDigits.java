package com.practice;

import java.util.Scanner;

public class OddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  numbers:");
		int num1 = sc.nextInt();
		
		while(num1!=0)
		{
			int rem = num1%10;
			if(rem%2!=0)
				System.out.println(rem);
			num1=num1/10;
		}
	}

}
