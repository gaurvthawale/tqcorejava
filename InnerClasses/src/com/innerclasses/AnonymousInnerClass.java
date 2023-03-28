package com.innerclasses;




interface Doable
{
	void doit();
}

class Car 
{
	void drive()
	{
		System.out.println("I am driving");
	}
}

abstract class Cake
{
	abstract void doBaking();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doable d = new Doable() {
			
			public void doit()
			{
				System.out.println("I am doing now");
			}
			
		};
		
		d.doit();
		
		Cake c = new Cake() {
			
			public void doBaking()
			{
				System.out.println("I am bakinh it now/.");
			}
		};
				c.doBaking();
		

	}

}
