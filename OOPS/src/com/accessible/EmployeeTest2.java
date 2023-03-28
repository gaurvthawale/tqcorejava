package com.accessible;

import java.util.Scanner;

public class EmployeeTest2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp id: ");
		int id = sc.nextInt();
		System.out.println("Enter emp name: ");
		String name = sc.next();
		System.out.println("Enter emp experience: ");
		float exp = sc.nextFloat();
		System.out.println("Enter emp salary: ");
		float sal  = sc.nextFloat();
		
		Employee emp = new Employee();
		emp.enterDetails(id, name, exp, sal);
		emp.displayDetails();
		emp.salaryIncrement();
		emp.displayDetails();
	}

}
