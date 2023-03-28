package com.supplier;

import java.util.Scanner;

public class SupplierGetterSetter{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void enterItem(Item i)
	{
		System.out.println("enter item id");
		i.setId(sc.nextInt());
		System.out.println("enter item name");
		i.setName(sc.next());
		System.out.println("enter item unit price");
		i.setUnitPrice(sc.nextFloat());
		
	}
	
	public static void enterSupplier(Supplier s)
	{
		System.out.println("enter the supplier id");
		s.setId(sc.nextInt());
		System.out.println("enter supplier name");
		s.setSname(sc.next());
		System.out.println("enter supplier phone no");
		s.setPhoneNo(sc.next());
		
		System.out.println("Enter number of items you supply:");
		int n = sc.nextInt();
		
		Item[] i1 = new Item[n];
		for(int i=0;i<i1.length;i++)
		{
			i1[i] =new Item();
			enterItem(i1[i]);
		}
		
		s.setItem(i1);
	}
	
	public static void enterSupplier2(Supplier s)
	{
		System.out.println("enter the supplier id");
		s.setId(sc.nextInt());
		System.out.println("enter supplier name");
		s.setSname(sc.next());
		System.out.println("enter supplier phone no");
		s.setPhoneNo(sc.next());
		
		System.out.println("enter number of items you supply");
		int n = sc.nextInt();
		s.setItem(new Item[n]);
		for(int i=0;i<n;i++)
		{
			s.getItem()[i]= new Item();
			
			enterItem(s.getItem()[i]);
		}
		
		
	}
	
	public static void printDetails(Supplier[] sup)
	{
		for(Supplier s : sup)
		{
			System.out.println(s.getId()+" "+s.getSname()+" "+s.getPhoneNo());
			for(Item i : s.getItem())
			{
				System.out.println(i);
			}
			System.out.println("=============================================");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier[] sup = new Supplier[3];
		
		for(int i=0;i<sup.length;i++)
		{
			sup[0] = new Supplier();
			enterSupplier(sup[0]);
		}
		
		
		
		
	}

}
