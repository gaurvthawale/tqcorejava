package com.override;
class Player
{
	String name;
	
	void display()
	{
		System.out.println("Common player");
	}
}

class HockeyPlayer extends Player
{
	void display()
	{
		System.out.println("Hockey Player");
	}
}

class BasketBallPlayer extends Player
{
	void display()
	{
		System.out.println("Basket ball player");
	}
}

public class DynamicMethod {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1;
		p1 = new HockeyPlayer();
		p1.display();
		p1 = new BasketBallPlayer();
		
		p1.display();
		
		
	}

}
