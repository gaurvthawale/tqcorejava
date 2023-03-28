package com.interfacedemo;



class Car implements Movable
{

	@Override
	public void move()
	{
		System.out.println("Car is moving at speed: "+speed);
		
	}
	
}

class Ball implements Movable
{
	
	
	
	@Override
	public void move()
	{
		System.out.println("Ball is moving at speed: "+speed);
		
	}
	
}

class Person implements Movable
{

	@Override
	public void move() 
	{
		System.out.println("Person is moving at speed: "+speed);
		
	}
	
	public void walk() 
	{
		System.out.println("Person is walking at speed: "+speed);
		
	}
}

public class MovableDemo {

	public static void main(String[] args) {
		
		
		Movable m;
		
		m= new Car();
		m.move();
	//	m.walk();
		
		m = new Ball();
		m.move();
		
		m = new Person();
		m.move();
		
		Person c = new Person();
		c.walk();
		
		
		
		
	}

}
