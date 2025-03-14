package com.neotech.lesson07;

import java.util.*;

public class ScannerAndSwitchPractice {

	public static void main(String[] args) {

		// ask the Scanner what language you speak and print them

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Where are you from ? ");

		String country = myScanner.next();

		// Using Switch

		switch (country) {
		case "Turkie":
			System.out.println("You speak Turkish ");
		case "Ecuador":
		case "Spain":
		case "Colombia":
			System.out.println("You speak Spanish ");
			break;
		case "US":
		case "Australia":
		case "UK":
			System.out.println("You speak English");
			break;
		case "Kosova":
		case "Albania":
			System.out.println("You speak Albanian ");

			break;
		default:
			System.out.println("We do not have that language, we will add for you next time ");
			break;
		}

		if (country.equalsIgnoreCase("Ecuador") || country.equalsIgnoreCase("Spain")
				|| country.equalsIgnoreCase("Colombia")) {

			System.out.println("You speak Spanish ");
		} else if (country.equalsIgnoreCase("US") || country.equalsIgnoreCase("Australia")
				|| country.equalsIgnoreCase("UK")) {
			System.out.println("You speak English");
		} else if (country.equalsIgnoreCase("Kosova") || country.equalsIgnoreCase("Alabania")) {
			System.out.println("You speak Albanian ");
		} else if (country.equalsIgnoreCase("Turkie")) {
			System.out.println("you speak Turkish");

		}
		{
		}

		System.out.println("===================================================================");

		// Ask the scanner for what is your favorite music
		// then print a band that you suggest

		Scanner myBand = new Scanner(System.in);
		System.out.println("Hello, what is your favorite band ? ");
		String band = myBand.next();

		switch (band) {

		case "Qeen":
		case "Metallica":
		case "ACDC":
		case "Extremoduro":
			System.out.println("You like Rock! ");
			break;

		case "Panda":
		case "NTVG":
		case "Soda Stereo":
		case "Hombres G":
			System.out.println("You like Spanish Alternative Rock ");
			break;

		case "LeonardoFavio":
		case "JoseJose":
			System.out.println("You like Spanish Baladas");
			break;

		case "BinomiodeOro":
			System.out.println("You like Ballenatos ");
			break;

		default: {
			System.out.println("We dont have that today, no free stuff for you BYE! ");
		}
			break;
		}

		System.out.println("The music you like is " + band + "here are your free music subscription");

		
		
	/*	Use Scanner
		Use AND,OR Operator

		1. Ask the user to enter the height in inches. Person should be classified as one of the following:
			• short (under 60 inch)
			• medium (between 60 -72 inch)
			• tall (over 72 inch)

		2. Write a program that will ask for the day (a number from 1-7). Print whether it is a weekend or weekday.
			If any day from 1-5 → output "It is a weekday"
			Any day from 6-7 → output "It is a weekend",
			Any other day → output "Invalid day"

		----------------------------------------------------------------

		These are extra examples that you don't need to submit.

		Use Scanner

		1. You are a loan specialist and you need to ask the user what is the amount of loan that is needed.
		    If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.

		2. You are DMV representative and you need to ask customer their age.
		    If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.

		3. Create a Java program that will ask user to input city and temperature.
		    Your program should convert Fahrenheit into celsius and print "The temperature is the city __ is __"
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
