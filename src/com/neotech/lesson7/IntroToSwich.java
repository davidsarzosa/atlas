package com.neotech.lesson7;

public class IntroToSwich {

	public static void main(String[] args) {

		// Given a number 1 to 7, print the name of the day

		int day = 4;
		String nameDay;

		if (day == 1) {
			System.out.println("Monday");
			nameDay = "nameDay";

		} else if (day == 2) {
			System.out.println("Tuesday");
			nameDay = "Tuesday";
		} else if (day == 3) {
			System.out.println("Wednsday");
			nameDay = "Wednsday";
		} else if (day == 4) {
			System.out.println("Thursday");
			nameDay = "Thursday";
		} else if (day == 5) {
			System.out.println("Friday");
			nameDay = "Friday";
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
			nameDay = "Sunday";
		} else {
			System.out.println("Invalid Output");
			nameDay = "Invalid Output";
		}

		int apple = 1;
		String Phone;

		if (apple == 5) {
			System.out.println("Iphone 1");
			Phone = "Iphone 1";
		} else if (apple == 2) {
			System.out.println("Iphone 2");
			Phone = "Iphone 2";
		} else if (apple == 3) {
			System.out.println("Iphone 3");
			Phone = "Iphone 3";
		} else if (apple == 4) {

			System.out.println("Iphone 4");
			Phone = "Iphone 4";
		} else {
			System.out.println("ONE PLUS 13");
			Phone = "ONE PLUS 13 ";
		}

		System.out.println("================================================");

	}

}
