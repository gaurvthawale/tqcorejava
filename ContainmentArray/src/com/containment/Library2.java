package com.containment;

import java.util.Scanner;

public class Library2 {

	static Scanner sc= new Scanner(System.in);
	
	public static void enterdetails(Book b)
	{
		System.out.println("enter book name");
		b.setBname(sc.next());
		System.out.println("enter book id");
		b.setBid(sc.nextInt());
		System.out.println("eneter the book price");
		b.setPrice(sc.nextFloat());
		
		Author a = new Author();
		System.out.println("Enter author id");
		a.setId(sc.nextInt());
		System.out.println("enter author name:");
		a.setName(sc.next());
		
		b.setAuthor(a);
		
		
	}
	
	
	public static void printDetails(Book[] lib)
	{
		for(int i=0;i<lib.length;i++)
		{
			System.out.println(lib[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] lib = new Book[2];
		
		for(int i=0;i<lib.length;i++)
		{
			lib[i]=new Book();
			enterdetails(lib[i]);
		}
		
		printDetails(lib);
		
		
		
	}

}
