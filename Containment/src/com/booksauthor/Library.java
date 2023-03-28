package com.booksauthor;

import java.util.Scanner;

public class Library {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void enterBook(Book b)
	{
		System.out.println("enter book id:");
		b.setBid(sc.nextInt());
		System.out.println("enter book name:");
		b.setBname(sc.next());
		System.out.println("enter book price");
		b.setPrice(sc.nextFloat());
		//System.out.println("enter boo");
		Author a = new Author();
		System.out.println("enter author id");
		a.setId(sc.nextInt());
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
