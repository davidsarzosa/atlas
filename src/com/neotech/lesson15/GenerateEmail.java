package com.neotech.lesson15;

import java.util.Scanner;

public class GenerateEmail {

	/*
	 * Create a method createEmail(). Based on provided users firstName, lastName
	 * and emailType, your method should return complete email address. Example:
	 * firstName -> john lastName -> snow emailType -> gmail return ->
	 * johnsnow@gmail.com
	 */

	// This is the method with parameters and passing arguments
	String createEmail(String firstName, String lastName, String emailType) {
		String email = firstName + lastName + "@" + emailType + ".com";
		return email;
	}

	// This is the method with no parameters just returning a value
	void emailSetUp() {
		System.out.println("justsetupemail@gmail.com");
	}

	public static void main(String[] args) {
		GenerateEmail emailGenerator = new GenerateEmail();
		String email = emailGenerator.createEmail("jhon", "snow", "gameofthrones");
		System.out.println(email);

		emailGenerator.emailSetUp(); // Printing the method W/O parameters or arguments.

		// Asking the user to enter the gmail

		Scanner emailInput = new Scanner(System.in);
		System.out.println("Enter your first name ");
		String firstName = emailInput.next();
		System.out.println("Enter your last name");
		String lastName = emailInput.next();
		System.out.println("Enter your domain email");
		String emailType = emailInput.next();

		String myEmail = emailGenerator.createEmail(firstName, lastName, emailType);
		System.out.println("Your email informarmation is : " + myEmail);
	}

}
