package com.newprac;

import java.util.Arrays;

public class ContinousArraySum {

	public static void continousArraySum(int[] arr, int sum)
	{
		int arrsum =arr[0];
		int start=0;
		
		for(int i=1;i<arr.length;i++)
		{
			arrsum=arrsum+arr[i];
			
			//executed untill arrsum becomes less than oor equal to sum.
			while(arrsum>sum && start<=i-1)
			{
				arrsum=arrsum-arr[start];
				start++;
			}
			
			if(arrsum==sum)
			{
				for(int j=start;j<=i;j++)
				{
					System.out.print(arr[j]+" ");
				}
				System.out.println("Ndex from "+start+" to "+i);
				System.out.println();
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,10,5,5,10,8,9,16};
		System.out.println(Arrays.toString(arr));
		continousArraySum(arr, 20);
		
	}

}
