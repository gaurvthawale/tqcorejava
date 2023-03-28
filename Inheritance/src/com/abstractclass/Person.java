package com.demo;

abstract public class Person {
	
	private String name;
	private int age;
	static int pcount=0;
	
	{
		pcount++;
	}
	
	Person()
	{
		
	}
	
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	abstract void checkStatus();
	
	abstract void moneyStatus(float amount);
	
	static void displayPerssonCount()
	{
		System.out.println("Number of person:"+pcount);
	}
	
	 void checkVote()
	{
		if(age>=18)
			System.out.println("You can vote");
		else
			System.out.println("You cannot vote");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age ;
	}

	 
	 
	 
}
