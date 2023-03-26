package com.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentTest {
	
	public static void commonElements(ArrayList<Student> a1,ArrayList<Student> a2)
	{
		ArrayList<Student> a = new ArrayList<>();
		
		for(int i=0;i<a1.size();i++)
		{
			
			boolean status = a.contains(a1.get(i));
			System.out.println();
				
		}
		
		for(Student s : a)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
	
		ArrayList<Student> al1 = new ArrayList<>();
		
		al1.add(new Student(1,"gautrav"));
		al1.add(new Student(2,"mohit"));
		al1.add(new Student(3,"vaibhav"));
		al1.add(new Student(4,"dinesh"));
		al1.add(new Student(5,"savtya"));
		al1.add(new Student(6,"omkar"));
		al1.add(new Student(7,"indrayani"));
		
		
		ArrayList<Student> al2 = new ArrayList<>();
		
		al2.add(new Student(1,"gautrav"));
		al2.add(new Student(2,"mohit"));
		al2.add(new Student(3,"vaibhav"));
		al2.add(new Student(4,"dinesh"));
		al2.add(new Student(5,"savtya"));
		al2.add(new Student(6,"jadu"));
		al2.add(new Student(4,"sahili"));
		
		
		commonElements(al1, al2);

	}

}
