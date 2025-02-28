package com.neotech.lesson7;

import java.util.Scanner;

public class ScannerAndSwitch {

	private static final String String = null;

	public static void main(String[] args) {

		// Ask a user to enter their country
		// Then print the language they speak

		String Ecuador = "and you are bilingual";

		Scanner MyScanner = new Scanner(System.in);

		System.out.println("Where are you from ? ");
		String country = MyScanner.nextLine();

		// Using Switch
		switch (country) {
		case "Albania":
		case "Kosova":
			System.out.println("You speak Albanian");
			break;

		case "USA":
		case "UK":
		case "Australia":
		case "Ecuador":

			break;

		default:
			System.out.println("I will have to add that to the switch! ");
			break;
		}

		// Howto hanlde case differences. EX UK vs Uk vs uK

		// for the switch case :
		// before I use the variable in Switch() I could convert the input to lower case
		// and create the cases using only lowercase

		// for the else if :
		// we can use equalsIgnoreCase()

		// Using if - else if
		// .equals() is only for Strings and it compares the content of the String

		if (country.equals("Albania") || country.equals("Kosova")) {
			System.out.println("You Speak Albanian");

		} // equalsIgnoreCase() it is same as .equals() but it is case insensitive.
			// Uk == uk == Uk == Uk

		else if (country.equalsIgnoreCase("USA") || country.equalsIgnoreCase("UK")
				|| country.equalsIgnoreCase("Australia")) {
			System.out.println(" You Speak English! ");
		} else {
			System.out.println("I will have to add that to the else if conditions!! ");
		}

	}

}
