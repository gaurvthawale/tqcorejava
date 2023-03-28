package com.hirarchical;




class Demo 
{
	int i;
	
	void display()
	{
		System.out.println("Super class");
	}
}

class Child extends Demo
{
	int i = 10;
	
	void display()
	{
		super.display();
		System.out.println("child class");
		System.out.println(super.i);
	}
}

public class Test {

	public static void main(String[] args) {

		
		SchoolStudent s1 = new SchoolStudent(1,"gaurav",34,4000f,"jagrut",4);
		
		Child c1 = new Child();
		c1.display();
		System.out.println(c1.i);
		
		
		
	}

}
