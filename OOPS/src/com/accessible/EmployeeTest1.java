package com.accessible;

public class EmployeeTest1 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.enterDetails(1, "Gaurav", 3.5f, 15000f);
		
		emp1.displayDetails();
		
		emp1.salaryIncrement();
		emp1.displayDetails();

	}

}
