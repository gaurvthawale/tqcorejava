package com.cardriver;

import java.util.Scanner;

public class CarTest {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void enterDriverDetails(Driver d)
	{
		System.out.println("enter driver id");
	}
	
	public static void enterDetails(Car c)
	{
		System.out.println("enter car id;");
		c.setCid(sc.nextInt());
		System.out.println("enter car model");
		c.setModel(sc.next());
		
		System.out.println("enter number of drivers to appoint");
		int n= sc.nextInt();
		
		c.setDrivers(new Driver[n]);
		
		for(int i=0;i<n;i++)
		{
			c.getDrivers()[i] = new Driver();
			enterDriverDetails(c.getDrivers()[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] car = new Car[3];
		
		for(int i=0;i<car.length;i++)
		{
			car[i]= new Car();
			enterDetails(car[i]);
		}
		
	}

}
