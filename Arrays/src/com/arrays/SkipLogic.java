package com.arrays;

import java.util.Scanner;

public class SkipLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int num = sc.nextInt();
		int digits=0;
		
		int sum=0;
		while(num!=0)
		{
			digits++;
			int rem = num%10;
			
			if((digits%2)==0)
				continue;
			
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
