package com.innerclasses;


class Bank
{
	private static String bankName="SBI";
	private String location;
	private int regno;
	
	{
		location="Delhi";
		regno=23456;
	}
	
	void displayBank()
	{
		System.out.println(bankName+" "+regno+" "+location);
	}
	
	class Locker
	{
		private int lid;
		private String custName;
		private static int lockrent=2000;
		
		public void enterDetails(String custName,int lid)
		{
			this.custName=custName;
			this.lid=lid;
		}
		
		void displayLocker()
		{
			System.out.println(lid+" "+custName+" "+lockrent);
		}
	}
	
	
	
}


public class MemberInnerClass {
	
	public static void main(String[] args)
	{
		Bank b1 = new Bank();
		
		Bank.Locker lock1 = b1.new Locker();
		lock1.enterDetails("gaurav",234);
		lock1.displayLocker();
		
		Bank.Locker lock2 = new Bank().new Locker();
		lock2.enterDetails("vaibhav", 0);
		lock2.displayLocker();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
