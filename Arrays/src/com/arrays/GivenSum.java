package com.arrays;

import java.util.Arrays;

public class GivenSum {

	public static void givenSum(int[] array, int inputnum)
	{
		
		Arrays.sort(array);
		int i = 0;
		int j = array.length-1;
		
		
		
		while(i<j)
		{
			if((array[i]+array[j])==inputnum)
			{
				System.out.println(array[i]+""+array[j]+" = "+inputnum);
				i++;
				j--;
			}
			else if((array[i]+array[j])>inputnum)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
	}
	
	public static void continousarray(int[] array,int inputsum)
	{
		int sum  = array[0];
		int start =0;
		
		for(int i=1;i<array.length;i++)
		{
			sum = sum+array[i];
			
			while((sum>inputsum) && start<=i-1 )
			{
				sum = sum - array[start];
				start++;
			}
			
			if(sum==inputsum)
			{
				for(int j = start;j<=i;j++)
				{
					System.out.print(array[j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {42, 15, 12, 8, 6, 32};
		
		continousarray(array,26);

	}

}
