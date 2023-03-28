package com.customexception;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1 = new Account();
		a1.withdraw(2345f);

		System.out.println("Account is in processing...");
		a1.withdraw(3000);

	}

}
