package com.bank;

class Demo
{
	private int a;
	private int b;
	private int c;
	
	Demo()
	{
	System.out.println("Default");
      a=90;
      b=80;
      c=700;
      System.out.println(a+" "+b+" "+c);
    }
	
	Demo(int a)
	{
		
		this();
		System.out.println("Const 1");
		this.a=a;
	}	
	
	Demo(int a, int b)
	{
		this();
		System.out.println("Const 2");
		this.a=a;
		this.b=b;

	}

	Demo(int a, int b, int c)
	{
		System.out.println("Main");
		//this();
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public String toString()
	{
		return a+ "  "+b +"  "+c;
	}

}


public class ConstructorChainingDemo {
	
	public static void main(String[] args) {

     Demo d1= new Demo(10,10,10);
     System.out.println(d1);

	}

}
