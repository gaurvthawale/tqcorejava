package com.practice;




class Fish
{
	String name;
	int gills;
	
	Fish()
	{
		
	}
	
	Fish(String name, int gills)
	{
		this.name = name;
		this.gills= gills;
	}
	
	void swim()
	{
		System.out.println("Parent swim class");
		
	}
}

class GoldFish extends Fish
{
	protected void swim()
	{
		System.out.println("Child class goldfish..");
	}
}

class Whale extends Fish
{
	protected void swim()
	{
		System.out.println("Child class whale..");
	
	}
}


public class FishDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fish fish = new GoldFish();
		fish.swim();
		
		
	}

}
