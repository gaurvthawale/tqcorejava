package com.innerclasses;



class Outer
{
	private static int data=30;
	
	
	void display()
	{
		class LocalInner
		{
			private int value=20;
			
			void show()
			{
				System.out.println(data);
				System.out.println(value);

			}
		}
		
		LocalInner li = new LocalInner();
		li.show();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		
		o.display();
		
		

	}

}
