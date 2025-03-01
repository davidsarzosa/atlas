package com.neotech.lesson7;

public class IntroToSwich {

	public static void main(String[] args) {

		int day = 9;
		String dayName;

		if (day == 1) {
			// System.out.println("Monday");
			dayName = "Monday";
		} else if (day == 2) {
			// System.out.println("Tuesday");
			dayName = "Tuesday";
		} else if (day == 3) {
			// System.out.println("Wednesday");
			dayName = "Wednesday";
		} else if (day == 4) {
			// System.out.println("Thursday");
			dayName = "Thursday";
		} else if (day == 5) {
			// System.out.println("Friday");
			dayName = "Friday";
		} else if (day == 6) {
			// System.out.println("Saturday");
			dayName = "Saturday";
		} else if (day == 7) {
			// System.out.println("Sunday");
			dayName = "Sunday";
		} else {
			// System.out.println("Invalid");
			dayName = "Invalid";
		}

		// ✅ Print the result so the output is visible
		System.out.println("The day is: " + dayName);

		System.out.println("============================================");

		// using switch structure

		switch (day) // can only use byte, shor, int, char, and String
		{
		case 1:
			System.out.println("Monday");
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednsday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default: // same as the else block
			dayName = "Invalid";
			break;

		}

		System.out.println("The name of the day with number " + day + " is " + dayName);

	}

}
