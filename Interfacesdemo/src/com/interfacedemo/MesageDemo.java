package com.interfacedemo;


class Facebook implements MessageService
{
	String message = "Hello from facebook";
	@Override
	public void message(String message) {
		System.out.println(message);
		
	}
	
}

class Whatsapp implements MessageService
{
	String message= "Hello from whastapp";
	@Override
	public void message(String message) {
		System.out.println(message);
		
	}
	
}

public class MesageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
