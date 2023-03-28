package com.newprac;

import java.util.Arrays;

public class PrimeNumberArray {
	
	public static boolean checkPrime(int num)
	{
		if(num==0 || num==1)
			return false;
		
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%2==0)
				{
					return false;
				}
			}
			
			return true;
		}
			
	}

	public static void primeNumbers(int[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(checkPrime(arr[i]))
				System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,4,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		primeNumbers(arr);

	}

}
