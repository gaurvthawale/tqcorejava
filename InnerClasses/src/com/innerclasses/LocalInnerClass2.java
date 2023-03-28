package com.innerclasses;



class Mall
{
	private static String mallName= " Pacific";
	private String location = "pune";
	
	
	void doShopping()
	{
		class Cart
		{
			private int price;
			private String name;
			private float totalBill=0.0f;
			
			void addBill(String name, int price)
			{
				this.name=name;
				this.price=price;
				totalBill+=price;
			}
			
			void displayBill()
			{
				System.out.println("Thanks for shopping at"+mallName);
				System.out.println("Toatal billi s"+totalBill);
			}
		}
		
		Cart c = new Cart();
		c.addBill("pen",1000);
		c.addBill("pen",1000);
		c.addBill("pen",1000);
		
		c.displayBill();
		
	
	}
}

public class LocalInnerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		

	}

}
