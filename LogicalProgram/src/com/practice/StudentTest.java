package com.practice;


import java.util.ArrayList;

public class StudentTest {
	
	public static void commonElements(ArrayList<Student> a1,ArrayList<Student> a2)
	{
		ArrayList<Student> a = new ArrayList<>();
		boolean status;
		
		a.addAll(a1);
		
		
		
		for(int i=0;i<a2.size();i++)
		{
			status=false;
			
			
			for(int j=0;j<a1.size();j++)
			{
				
				if(a2.get(i).getName().equals(a1.get(j).getName()))
				{
					//a.add(a1.get(i));
					status=true;
					
				}
			}
			if(status==false)
			{
				a.add(a2.get(i));
			}
			
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
