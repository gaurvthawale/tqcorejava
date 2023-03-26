package com.arrays;

import java.util.Arrays;

public class Shiftingarray {
	
	private static void mergeArray(int[] arr) {
	
		
		int size = arr.length;
		int mid= size/2;
		int[] arrn = new int[arr.length];
		int k =0;
		if(size%2==0)
		{
			for(int i=mid;i<size;i++)
			{
				arrn[k++] =arr[i];
			}
			
			for(int j=0; j<mid;j++)
			{
				arrn[k++]=arr[j];
			}
		}
		
		else
		{
			for(int i=mid+1;i<size;i++)
			{
				arrn[k++]=arr[i];
			}
			
			arrn[mid]=arr[mid];
			k++;
			
			for(int j=0;j<mid;j++)
			{
				arrn[k++]=arr[j];
			}
		}
		
		System.out.println(Arrays.toString(arrn));
		
	}


	public static void main(String[] args) {
		
		int arr[] = {2,0,0,4,5,0,1,2,0,0,11};
		
		
		System.out.println(Arrays.toString(arr));
		mergeArray(arr);

	}

	
}
