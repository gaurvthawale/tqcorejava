package com.enumdemo;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter type of ticket to book");
		System.out.println("1.STANDARD");
		System.out.println("2.PREMIUM");
		System.out.println("3.RECLINER");
		
		int choice = sc.nextInt();
		System.out.println("Enter number of seta to book");
		int seats= sc.nextInt();
		
		MovieSeats ms= null;
		
		switch(choice)
		{
		case 1: ms=MovieSeats.STANDARD;
				System.out.println("Total Price: "+(seats*ms.price));
				break;
				
		case 2: ms=MovieSeats.PREMIUM;
				System.out.println("Total Price: "+(seats*ms.price));
				break;
		
		case 3: ms=MovieSeats.RECLINER;
				System.out.println("Total Price: "+(seats*ms.price));
				break;
		}
		

	}

}
