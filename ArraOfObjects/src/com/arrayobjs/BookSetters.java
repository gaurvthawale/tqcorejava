package com.arrayobjs;

import java.util.Scanner;

public class BookSetters {
	static Scanner sc = new Scanner(System.in);
	
	public static void enterdetails(Book b)
	{
		System.out.println("enter he book name");
		b.setBname(sc.next());
		System.out.println("enter book id");
		b.setBid(sc.nextInt());
		System.out.println("eneter the book price");
		b.setPrice(sc.nextFloat());
	}
	
	public static void sortbooks(Book[] books)
	{
		Book b = new Book();
		for(int i=0;i<books.length;i++)
		{
			for(int j=i+1;j<books.length;j++)
			{
				if(books[i].getPrice()>books[j].getPrice())
				{
					b = books[i];
					books[i]=books[j];
					books[j] =b;
				}
			}
		}
	}
	
	public static void printBooks(Book[] books)
	{
		for(Book b : books)
		{
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] books= new Book[3];
		
		for(int i=0;i<books.length;i++)
		{
			books[i] =new Book();
			enterdetails(books[i]);
		}
		
		printBooks(books);
		sortbooks(books);
		System.out.println("------  After Sorting -----");
		printBooks(books);
		

	}

}
