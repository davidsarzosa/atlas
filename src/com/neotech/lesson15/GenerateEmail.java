package com.neotech.lesson15;

import java.util.Scanner;

public class GenerateEmail {

	/*
	 * Create a method createEmail(). Based on provided users firstName, lastName
	 * and emailType, your method should return complete email address. Example:
	 * firstName -> john lastName -> snow emailType -> gmail return ->
	 * johnsnow@gmail.com
	 */

	String creatEmail(String firstName, String lastName, String emailType) {
		String email = firstName + lastName + " " + emailType;
		return email;

	}

	public static void main(String[] args) {

		GenerateEmail emailGenerator = new GenerateEmail();
		emailGenerator.creatEmail("Jhon", "Snow", "gmail");

	}

}
