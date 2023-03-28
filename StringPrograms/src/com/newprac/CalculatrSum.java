package com.newprac;

import java.util.Arrays;

public class CalculatrSum {

	
	public static void calculateSum(int[] arr)
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
		int total=0;
		while(sum>9)
		{
			while(sum>0)
			{
				int rem = sum%10;
				total=total+rem;
				sum=sum/10;
			}
			sum=total;
			System.out.println(sum);
			total=0;
		}
		
		System.out.println("Sum of array numbers is"+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2222,3080,4999,6688,766,8,999,1090};
		System.out.println(Arrays.toString(arr));
		
		calculateSum(arr);
	}

}
