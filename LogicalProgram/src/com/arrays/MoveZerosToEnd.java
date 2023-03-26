package com.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
	
	private static void moveZerosToEnd(int[] arr) {
	
		int left =0;
		int right = arr.length-1;
		
		while(left<right)
		{
			while(arr[left]!=0 && left<right)
				left++;
			
			while(arr[right]==0 && left<right)
				right--;
			
			if(left<right)
			{
				int temp = arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}


	public static void main(String[] args) {
		
		int arr[] = {2,0,0,4,5,0,1,2,0,0};
		
		System.out.println(Arrays.toString(arr));
		moveZerosToEnd(arr);

	}

	
}
