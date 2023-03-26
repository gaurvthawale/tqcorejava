package com.logical;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		boolean flag;
		
		int num1= sc.nextInt();
		int num2= sc.nextInt();
	
		for(int i= num1;i<=num2;i++)
		{
			flag = true;
			for(int j=2;j<=i/2;j++)
			{
				if(i==0||i==1)
					break;
				if(i%j==0)
				{
					flag = false;
					break;
				}
				
			}
			if(flag ==true)
				System.out.println(i);
			
		}
	}

}
