package com.arrays;



public class GivenSumTwoElements {
	
	private static void givenSumSubarray(int[] arr,int sum) {
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==sum)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}


	public static void main(String[] args) {
		
		int arr[] = {2,10,2,7,5,5};
		int sum = 12;

		
		
		//System.out.println(Arrays.toString(arr1));
		givenSumSubarray(arr,sum);

	}

	
}
