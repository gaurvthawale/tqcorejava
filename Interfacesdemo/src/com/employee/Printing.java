package com.employee;

import java.util.Arrays;
import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		String str = sc.nextLine();
		System.out.println("ENter elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str);
		}
		System.out.println(Arrays.toString(arr));

	}

}
