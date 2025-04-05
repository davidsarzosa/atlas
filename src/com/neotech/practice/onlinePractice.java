package com.neotech.practice;

import java.util.Scanner;

public class onlinePractice {

	public static void main(String[] args) {

		/*
		 * 
		 * In this assignment you will create a Scanner object and ask user to enter 3
		 * number inputs. -Declare integer variables `num1, num2, num3, sum.`
		 */

//		int num;
//		int num1;
//		int num2;
//		int sum;
//		Scanner numbers = new Scanner(System.in);
//		System.out.println("Enter 3 numbers ");
//		int input = numbers.nextInt();
//		int input2 = numbers.nextInt();
//		int imput3 = numbers.nextInt();
//
//		num = input + input2 + imput3;
//		sum = num;
//		System.out.println("the sum of the numbers is " + sum);
//
//		System.out.println("---------------------------------");

		/*
		 * Enter number of milligrams in drink: It would take about 20 drinks for a
		 * lethal overdose.
		 * 
		 * Formula to drink count to cause overdose is 10*1000 / numOfMilligrams
		 */

//		Scanner inputScan = new Scanner(System.in);
//		int lethalOverdose = 1000;
//
//		System.out.println("How many drinks of caffeine did you drink ? ");
//		int drinks = inputScan.nextInt();
//		if (drinks < lethalOverdose) {
//
//			int leftForOverdose = lethalOverdose - drinks;
//
//			System.out.println("It would take about " + leftForOverdose + " coups of coffe for a lethal overdose.");
//
//		} else {
//			System.out.println("Coffee overdose, your gone");
//
//		}
//
//		System.out.println("---------------------------------");

		/*
		 * 
		 * Write a program that asks user to input int values: areaCode and localNumber.
		 * - Using concatenation put together in this format and assign to String
		 * phoneNumber variable: - (222)-3334444 - Write a print statement that displays
		 * (use phoneNumber variable):
		 * 
		 * Output: Calling number (222)-3334444
		 * 
		 * 
		 * Example input1: 222 input2: 3334444 Output: Calling number (222)-3334444
		 * 
		 */
//		Scanner inputScan = new Scanner(System.in);
//		System.out.println("Insert your area code ");
//		int areaCode = inputScan.nextInt();
//
//		System.out.println("Insert your local phone number ");
//		int localNumber = inputScan.nextInt();
//
//		String PhoneNumber = "(" + areaCode + ")" + localNumber;
//
//		System.out.println("Calling" + PhoneNumber);
//
//		System.out.println("---------------------------------");

		/*
		 * Declare a byte variable named steps and assign 100 Declare a short variable
		 * named miles and assign 5000 Declare a int variable named count and assign
		 * 1000000 Declare a long variable named population and assign 3434455667
		 * 
		 */

//		byte steps = 100;
//		short miles = 5000;
//		int count = 1000000;
//		long population = 3434455667L;
//
//		System.out.println("Noramly every person do a " + steps + " a day," + " a truck normaly drives " + miles
//				+ " a month, " + "the love I have for my mother is more than  " + count
//				+ ", the polulation in the world in the year 3000 probaby will be " + population);

		/*
		 * In this assignment, you will write code to put together time of day. Like
		 * this: 12:24:33 PM 1. Declare variables: `hour, minute, second` that can hold
		 * int values. Declare `amOrPm` variable that can hold a String ("AM" or "PM")
		 * 2. Instructor will set different values to your variables 3. Using the
		 * variables and concatenation, print values in the format mentioned above.
		 * 
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Select your arrival time 0-12");
//		int hours = scan.nextInt();
//		if (hours > 12) {
//			System.out.println("We are using pm or am format, 0-12 only");
//			System.exit(0);
//		}
//		System.out.println("What about the minutes?");
//		int minutes = scan.nextInt();
//		if (minutes > 60) {
//			System.out.println("incorrect value, mitues can not be higher than 60");
//			System.exit(0);
//		}
//		System.out.println("seconds ?");
//		int seconds = scan.nextInt();
//		if (seconds > 60) {
//			System.out.println("incorrect value, seconds can not be higher than 60");
//			System.exit(0);
//		}
//		System.out.println("am or pm ? ");
//		String amorpm = scan.next();
//		String resultAmorPm = amorpm;
//		if (resultAmorPm.equals("am") || resultAmorPm.equals("pm"))
//
//			System.out.print("The time in your location is " + hours + ":" + minutes + ":" + seconds + "" + amorpm);

		System.out.println("NEED PRACTICE TO MANAGE THE EXERCISE AND THE LOGIC");
		/*
		 * Write a program that outputs the number of hours, minutes, and seconds that
		 * corresponds to input total seconds. -create a Scanner object -declare int
		 * variables inputSeconds, hours, minutes, seconds Ask user enter seconds by
		 * printing: Enter seconds: -Using % (remainder) and / operators, find out how
		 * many whole hours, minutes and seconds are in inputSeconds. -Assign values to
		 * the hours, minutes, seconds variables -Display the result.
		 * 
		 * Example run:
		 * 
		 * Enter seconds: 3695 1 hours, 1 minutes, and 35 seconds
		 * 
		 * 
		 * Enter seconds: 20394 5 hours, 39 minutes, and 54 seconds
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("How many seconds do we have this time ?");
//		int inputSeconds = scan.nextInt();
//
//		// calculation
//		int hour = inputSeconds / 3600; // get the whole numbers
//		int remaingSeconds = inputSeconds % 3600; // get remaining seconds after hours
//		int minutes = remaingSeconds / 60; // get the whole minutes
//		int seconds = remaingSeconds % 60; // get remaining seconds after minutes
//
//		System.out.println(
//				inputSeconds + " " + hour + " hours " + minutes + " minutes" + " and " + seconds + " seconds ");

// 		handle the remainders could be hard! keep practicing!

		/*
		 * In this assignment you will write a program to create a shopping list and
		 * prices.
		 * 
		 * You will use Scanner object and ask user to enter 3 items followed by its
		 * price and you will calculate totalprice and show as a report. -Declare 4
		 * String variables item1, item2, item3, report.
		 * 
		 * -Declare double variables price1, price2, price3, totalPrice
		 * 
		 * -Create a Scanner object named scan.Execution flow with example: -Display
		 * promp"Enter Item1 and its price:" Tomatoes 5.5 -Display prompt
		 * "Enter Item2 and its price:" Cheese 3.5 -Display prompt
		 * "Enter Item3 and its price:" Apples 6.3 -calculate totalPrice for all items
		 * -build the report variable by concatenating Strings and double values:
		 * "Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
		 * "Total price: 15.3" - Print the value of report variable
		 * 
		 * 
		 * 
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your first item and its price? ");
//		String item1 = scan.next();
//		double price1 = scan.nextDouble();
//		
//		System.out.println("Enter your sencond item and its price? ");
//		String item2 = scan.next();
//		double price2 = scan.nextDouble();
//		
//		System.out.println("Enter your thirth item and its price? ");
//		String item3 = scan.next();
//		double price3 = scan.nextDouble();
//
//		String itemSum = item1 + " " + price1 + "," + item2 + " " + price2 + "," + item3 + " " + price3;
//		double totalPrice = price1 + price2 + price3;
//
//		System.out.println("Item description  " + itemSum);
//		System.out.println("Your total is " + totalPrice + " Thank you for shoping with us! ");

		/*
		 * using an if statement check which int is larger a or b, and then output:
		 * "number is greater". for example: a=1 b=2 output: 2 is greater a=5 b=7
		 * output: 7 is greater
		 */

//		int a = 5;
//		int b = 5;
//
//		if (a > b) {
//			System.out.println("number " + a + "is bigger than " + b);
//		} else if (b > a) {
//			System.out.println("number " + b + " is greater than " + a);
//		} else {
//			System.out.println(" numbers are equal ");
//		}

		/*
		 * You have 2 numbers already declared and assigned values. Using Multi-Branch
		 * if statements, check if num1 and num2 are equal, or not. Please follow the
		 * below examples and print message accordingly:
		 * 
		 * Enter 2 numbers: 10 10 10 and 10 are equal
		 * 
		 * 
		 * 
		 * Enter 2 numbers: 100 55 100 is greater than 55
		 * 
		 * 
		 * 
		 * Enter 2 numbers: 33 333 333 is greater than 33
		 */

//		int a = 33;
//		int b = 33;
//		int c = 33;
//		int d = 33;
//
//		if (a == b && a == c && a == d) {
//			System.out.println("All numbers" + a + " " + b + " " + c + " " + d + " are equal");
//
//		}
//		System.out.println("--------------------------------");
//
//		int intCons = 100;
//		int intCons2 = 100;
//		int test = 50;
//
//		if (intCons > test || intCons2 > test) {
//			System.out.println(intCons + " and " + intCons2 + " are greater than " + test);
//
//		} else {
//			System.out.println("Numbers are equal");
//
//		}
//
//		System.out.println("--------------------------------");

		/*
		 * In the Happy Valley School System, children are classified by age as follows:
		 * • less than 2, ineligible • 2, toddler • 3-5, early childhood • 6-7, young
		 * reader • 8-10, elementary • 11 and 12, middle • 13, impossible • 14-16, high
		 * school • 17-18, scholar • greater than 18, ineligible
		 * 
		 * Given an int variable age, write an if statement that prints out, on a line
		 * by itself, the appropriate label from the above list based on age.
		 * 
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("How old is the child ? ");
		// int age = 20;

		for (int age = 0; age <= 20; age++) {
			System.out.println("Age " + age + ":");

			if (age < 2) {
				System.out.println("ineligible children");
			} else if (age == 2) {
				System.out.println("toddler");
			} else if (age >= 3 && age <= 5) {
				System.out.println("early childhood");
			} else if (age >= 6 && age <= 7) {
				System.out.println("young reader");
			} else if (age >= 8 && age <= 10) {
				System.out.println("elementary");
			} else if (age == 11 || age == 12) {
				System.out.println("middle");
			} else if (age == 13) {
				System.out.println("impossible");
			} else if (age >= 14 && age <= 16) {
				System.out.println("high school");
			} else if (age >= 17 && age <= 18) {
				System.out.println("scholar");
			} else {
				System.out.println("we call them gay");
			}
		}

	}

}
