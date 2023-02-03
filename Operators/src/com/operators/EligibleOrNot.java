package com.operators;

import java.util.Scanner;

public class EligibleOrNot {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total marks: ");
		int marks = sc.nextInt();
		
		System.out.println("Enter marks of best threee : ");
		int bestThree = sc.nextInt();
		
		System.out.println((marks>90)&&(bestThree>85)?"Eligible":"Not Eligible");
		sc.close();
	}
	

}
