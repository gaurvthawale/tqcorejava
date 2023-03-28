package com.newprac;

import java.util.Arrays;

public class SiftingNegativeAtEnd {
	
	public static void shiftOddAtEnd(int[] arr)
	{
		int left = 0;
		int right = arr.length-1;
		
		while(left<right)
		{
			while(arr[left]>0 && left<right)
				left++;
			
			while(arr[right]<0 && left<right)
				right--;
			
			if(left<right)
			{
				int temp = arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-3,4,-2,-6,7,-8,9,-16};
		System.out.println(Arrays.toString(arr));
		shiftOddAtEnd(arr);
		System.out.println(Arrays.toString(arr));

	}

}
