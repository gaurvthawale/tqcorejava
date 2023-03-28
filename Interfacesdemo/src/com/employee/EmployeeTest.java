package com.employee;

import java.util.Scanner;
public class EmployeeTest {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void enterDetails(Employee e)
	{
		System.out.println("Enter emp name:");
		e.setName(sc.next());
		System.out.println("enter emp id:");
		e.setEid(sc.nextInt());
		System.out.println("enter salary:");
		e.setSalary(sc.nextFloat());
		
		Department d = new Department();
		System.out.println("Enter the dept id:");
		d.setId(sc.nextInt());
		System.out.println("enter the dept name");
		d.setDname(sc.next());
		System.out.println("Enter the location of dept:");
		d.setLocation(sc.next());
		e.setDept(d);
	}

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		enterDetails(e1);
		
		System.out.println(e1);

	}

}
