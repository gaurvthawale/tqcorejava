package com.arrays;

import java.util.Arrays;

public class MergingArrays {
	
	private static void mergeArray(int[] arr1,int[] arr2) {
	
		int size1 = arr1.length;
		int size2 = arr2.length;
		int[] marr = new int[size1+size2];
		int size=0;
		
		int i,j,k=0;
		
		for(i=0,j=0;i<size1&&j<size2;i++,j++)
		{
			marr[k++]=arr1[i];
			marr[k++]=arr2[j];
		}
		while(i<size1)
		{
			marr[k++]=arr1[i++];
		}
		while(j<size2)
		{
			marr[k++]=arr2[j++];
		}
		
		System.out.println(Arrays.toString(marr));
		
		
	}


	public static void main(String[] args) {
		
		int arr1[] = {4,5,6,7,8};
		int arr2[] = {11,22,3,355,66,77,88};

		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		mergeArray(arr1,arr2);

	}

	
}
