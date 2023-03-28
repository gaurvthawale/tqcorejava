package com.encapsulation;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.println("Enter id:");
		stu.setId(sc.nextInt());
		System.out.println("Enter name:");
		stu.setName(sc.next());
		System.out.println("Enter age:");
		stu.setAge(sc.nextInt());
		System.out.println("Enter marks:");
		stu.setMarks(sc.nextFloat());
		
		System.out.println(stu.getAge()+" "+stu.getId()+" "+stu.getName()+" "+stu.getMarks());
		
	}

}
