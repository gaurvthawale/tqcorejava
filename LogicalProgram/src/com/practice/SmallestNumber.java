package com.practice;
import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int num= (num1<num2)?num1:num2;
		
		int smallest = num<num3?num:num3;
		
		System.out.println("Smalest number is "+smallest);
		
	}

}
