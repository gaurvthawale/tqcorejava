package com.containment;

import java.util.Scanner;

import com.employee.Department;
import com.employee.Employee;

public class Library {

	static Scanner sc= new Scanner(System.in);
	
	public static void sortBooksByPrice(Book[] lib)
	{
		Book b = new Book();
		
		for(int i=0;i<lib.length;i++)
		{
			for(int j=i+1;j<lib.length;j++)
			{
				if(lib[i].getPrice()>lib[j].getPrice())
				{
					b= lib[i];
					lib[i]=lib[j];
					lib[j]=b;
				}
			}
		}
	}
	
	public static void displayAuthorBooks(Book[] lib,Author[] auth)
	{
		for(Author a: auth)
		{
			System.out.println(a.getName());
			for(Book b:lib)
			{
				if(b.getAuthor().equals(a))
					System.out.println(b);
			}
			
			System.out.println();
			System.out.println();
		}
	}
	
	
	public static void printDetails(Book[] lib)
	{
		for(int i=0;i<lib.length;i++)
		{
			System.out.println(lib[i]);
		}
	}
	
	public static void highestPriceBook(Book[] lib)
	{
		float hPrice = Float.MIN_VALUE;
		
		
		for(Book b : lib)
		{
			if(b.getPrice()>hPrice)
			{
				hPrice=b.getPrice();
			}
		}
		
		System.out.print(hPrice+" :");
		for(Book b : lib)
		{
			if(b.getPrice()==hPrice)
			{
				System.out.println(b);
			}
		}
	}
	
	public static void displayAuthorAndBookCount(Book[] b,Author[] a)
	{
		int cnt;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i].getName()+" : ");
			cnt=0;
			for(int j=0;j<b.length;j++)
			{
				if(b[j].getAuthor().equals(a[i]))
				{
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author[]  a = new Author[3];
		
		a[0]= new Author(1,"sadhguru");
		a[1]= new Author(2,"prashant");
		a[2]= new Author(3,"rancho");
		
		Book[] lib = new Book[5];
		
		lib[0] = new Book(1,"carlos",400f,a[0]);
		lib[1] = new Book(2,"zoo",300f,a[1]);
		lib[2] = new Book(3,"sinchen",600f,a[2]);
		lib[3] = new Book(4,"doremon",200f,a[1]);
		lib[4] = new Book(5,"cyndrela",1500f,a[0]);
		
		printDetails(lib);
		
		sortBooksByPrice(lib);
		System.out.println();
		System.out.println("------------- After sorting -----------------");
		printDetails(lib);
		
		System.out.println();
		System.out.println("----------- Books By Author Name ------------");
		displayAuthorBooks(lib, a);
		System.out.println();
		
		System.out.println("-------------- Book With Highest Price ----------");
		highestPriceBook(lib);
		System.out.println();
		
		System.out.println("------------- Author and Book Count --------------");
		displayAuthorAndBookCount(lib, a);
		
		
	}

}
