package com.practice;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  numbers:");
		int num1 = sc.nextInt();
		int even=0;
		int odd =0;
		
		while(num1!=0)
		{
			int rem = num1%10;
			if(rem%2!=0)
				odd++;
			else 
				even++;
			num1=num1/10;
		}
		System.out.println("Number of odd digits are : "+odd);
		System.out.println("Number of even digits are : "+even);

	}

}
