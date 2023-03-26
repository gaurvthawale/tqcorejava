package com.logical;

import java.util.Scanner;

public class ArmstrongNumber {
		
	public static void checkArmstrong(int num)
	{
		int digits=0;
		int original=num;
		while(num!=0)
		{
			int r= num%10;
			digits++;			
			num= num/10;
		
			
		}
		
		System.out.println("Number of digits are:"+digits);
		
		num=original;
		int armNumber=0;
		
		while(num!=0)
		{
			int r= num%10;
            // logic to calculate power 
			int result=1;
			for(int i=1; i<=digits;i++)
			{
				result=result*r;
				System.out.println("power"+result);
			}
			armNumber= armNumber+result;
			System.out.println(armNumber);
			num= num/10;
					
		}
		
		if(original==armNumber)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
		
		
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		checkArmstrong(n);

	}

}
