package com.neotech.lesson27;

public class RegistrationTest {

	public static void main(String[] args) {

		Registration r1 = new Registration();

		r1.setEmail("daalejandrosm@yahoo.com");
		r1.setUserName("7avidS");
		r1.setPassword("Odessa.2015");

		System.out.println(r1.getEmail());
		System.out.println(r1.getUserName());
		System.out.println(r1.getPassword());
		
		

	}
}
