package com.basics;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {


		Bank b2 = new Bank();
		
		b2.enterDetails(12, "mohit", 98765,456f,"current");
		b2.displayDetails();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter peron name:");
		String name = sc.next();
		System.out.println("Enter account no:");
		int accno = sc.nextInt();
		System.out.println("Enter peron :");
		String acounttype = sc.next();
		System.out.println("Enter account no:");
		
		
		

	}

}
