package com.neotech.lesson05;

import java.util.Scanner;

public class BMICheck {

	public static void main(String[] args) {

		// Scenario:
		// A program calculates the Body Mass Index (BMI)
		// and determines if a person is underweight, normal,
		// overweight, or obese. Using double allows for
		// precise BMI calculations.

		Scanner scanner = new Scanner(System.in);

		// Get user weight and height
		System.out.println("Enter weigth in kg: ");
		double weight = scanner.nextDouble();

		System.out.println("Enter height in meters:");
		double height = scanner.nextDouble();

		// Calculate BMI
		double bmi = weight / (height * height);

		// Determine BMI category?

		if (bmi < 18.5) {
			System.out.println("Your BMI is " + bmi + " - You are underweight.");

		} else if (bmi >= 18.8 && bmi < 24.9) {
			System.out.println("Your BMI is " + bmi + "You are normal weight.");

		} else if (bmi >= 25 && bmi < 29.9) {
			System.out.println("Your BMI is " + bmi + "You are overweight.");

		} else {
			System.out.println("Your BMI is " + bmi + "You are obese ");
		}

		scanner.close();

		System.out.println("Code finished lets try it to run the code" + "and check if there is any error");

	}

}
