package com.enumdemo;

public class EnumDemo {

	
	public enum WeekDays 
	{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,FRIDAY,SATURDAY
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeekDays w1 = WeekDays.SUNDAY;
		//System.out.println(w1);
		for(WeekDays w : WeekDays.values())
		{
			System.out.println(w);
		}
		
		System.out.println();
	}

}
