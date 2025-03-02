package com.neotech.lesson7;

import java.util.Scanner;

public class homeworkclass {

	public static void main(String[] args) {

		System.out.println("Enter the day of the week ? ");
		Scanner myScanner = new Scanner(System.in);
		int day = myScanner.nextInt();

		if (day <= 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It is the weekend");
		} else {
			System.out.println("Invalid Day");
		}

		System.out.println(
				"-------------------------------------------------------------------------------- SECOND TASK ");

		System.out.println("How much is the loan you are looking for ? ");
		double loan = myScanner.nextDouble();

		if (loan <= 200000) {
			System.out.println(
					"Contratulations your loan application it's approvoed! now your life is mine until you pay ");

		} else {
			System.out.println("Sorry your application got decline, how ever you can go the mob ");

		}

		System.out.println(
				"-------------------------------------------------------------------------------- THIRTH TASK ");

		System.out.println("Goog Morning! Please tell me your age ");
		int age = myScanner.nextInt();
		if (age >= 18) {
			System.out.println("Congrats here is your Texas Driver License, now you need to buy a car ! ");
		} else {
			System.out
					.println("Sorry you dont have the age to get a TDL please, try this learner permit for now! BYE! ");
		}

		System.out
				.println("-------------------------------------------------------------------------------- FORTH TASK");

		System.out.println("Please enter your city and temperture");
		String city = myScanner.next();
		double Fahrenheit = myScanner.nextDouble();

		double celcius = (Fahrenheit - 32) * 5 / 9;

		System.out.println(
				" The temperature in the city " + city + " is /" + Fahrenheit + " F /" + celcius + " C /");

	}

}
