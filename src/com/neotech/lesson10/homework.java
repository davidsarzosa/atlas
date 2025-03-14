package com.neotech.lesson10;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {

		// Write a program that asks user to enter his/her username and password
		// until user enters them correctly.

		String userId = "paolasarzosa";
		String password = "tonybolita";

		Scanner scan = new Scanner(System.in);
		String userGuess;
		String passwordGuess;

		do {
			System.out.println("Enter the user ID and password");
			userGuess = scan.next();
			passwordGuess = scan.next();
			if (userGuess.equals(userId) && passwordGuess.equals(password)) {
				System.out.println("You got access you are logged in!");
				break;
			}

		} while (true);

		System.out.println("==============PRACTICE=========================");

		String dbuser = "daalejandrosm";
		String dbpasswrod = "odessa.2015";
		String user;
		String password1;

		do {
			System.out.println("Ingresa usuario y contrasena ");
			user = scan.next();
			password1 = scan.next();
			if (user.equals(dbuser) && password1.equals(dbpasswrod)) {
				System.out.println("You got it! You are logged in");
			}
			break;

		} while (true);
		
		
		System.out.println("==============PRACTICE=========================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
