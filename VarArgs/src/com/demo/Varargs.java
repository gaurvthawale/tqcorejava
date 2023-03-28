package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Varargs {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
	
		System.out.println("ENter elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
