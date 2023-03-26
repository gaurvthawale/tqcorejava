package com.arrayofobjects;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void enterDetails(Student s)
	{
		System.out.println("enter id:");
		s.setId(sc.nextInt());
		System.out.println("enter name:");
		s.setName(sc.next());
		System.out.println("enter marks");
		s.setMarks(sc.nextFloat());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] st = new Student[2];
		
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();
			enterDetails(st[i]);
		}
		
		System.out.println(Arrays.toString(st));
		
	}

}
