package com.arrays;

import java.util.Arrays;

public class AlternateElements {
	
	private static void alternateELements(int[] arr1, int[] arr2) {
	int[] marr = new int[arr1.length];
	int k=0;
		
		for(int i=0,j=0;i<arr1.length&&j<arr2.length;i++,j++)
		{
			if(i%2==0)
			{
				//System.out.print(arr1[i]+" ");
				marr[k++]=arr1[i];
			}
			if(j%2!=0) 
			{
				//System.out.print(arr2[j]+" ");
				marr[k++]=arr2[j];
			}
		}
		System.out.println(Arrays.toString(marr));
		
	}


	public static void main(String[] args) {
		
		int arr1[] = {2,0,0,4,5,6};
		int arr2[] = {11,2,23,45,7,8};
		
		
		//System.out.println(Arrays.toString(arr1));
		alternateELements(arr1,arr2);

	}

	
}
