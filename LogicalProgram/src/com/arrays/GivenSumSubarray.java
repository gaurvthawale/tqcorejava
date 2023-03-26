package com.arrays;

import java.util.Arrays;

public class GivenSumSubarray {
	
	private static void givenSumSubarray(int[] arr,int sum) {
	
		int arrsum = arr[0];
		int start =0;
		
		for(int i=1;i<arr.length;i++)
		{
			arrsum =arrsum+arr[i];
			
			while(arrsum>sum && start<i)
			{
				arrsum = arrsum-arr[start];
				start++;
			}
			
			if(arrsum==sum)
			{
				for(int j=start;j<=i;j++)
				{
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
		
	}


	public static void main(String[] args) {
		
		int arr[] = {2,10,2,4,5,3};
		int sum = 12;

		
		
		//System.out.println(Arrays.toString(arr1));
		givenSumSubarray(arr,sum);

	}

	
}
