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

//		for (int age = 0; age <= 20; age++) {
//			System.out.println("Age " + age + ":");
//
//			if (age < 2) {
//				System.out.println("ineligible children");
//			} else if (age == 2) {
//				System.out.println("toddler");
//			} else if (age >= 3 && age <= 5) {
//				System.out.println("early childhood");
//			} else if (age >= 6 && age <= 7) {
//				System.out.println("young reader");
//			} else if (age >= 8 && age <= 10) {
//				System.out.println("elementary");
//			} else if (age == 11 || age == 12) {
//				System.out.println("middle");
//			} else if (age == 13) {
//				System.out.println("impossible");
//			} else if (age >= 14 && age <= 16) {
//				System.out.println("high school");
//			} else if (age >= 17 && age <= 18) {
//				System.out.println("scholar");
//			} else {
//				System.out.println("we call them gay");
//			}
//		}

		/*
		 * You have an Integer number already declared and assigned value. Using
		 * conditional statements, check if number is odd or even. Please follow the
		 * below examples and print message accordingly:
		 * 
		 * Enter a number: Sample input: 10 Sample output: 10 is even
		 * 
		 * 
		 * Enter a number: Sample input: 33 Sample output: 33 is odd
		 */

//		int num = 0;
//		Scanner number = new Scanner(System.in);
//		System.out.println("Enter a number please: ");
//		num = number.nextInt();
//
//		if (num % 2 == 0) {
//			System.out.println(num + " is a even number ");
//		} else {
//			System.out.println(num + " is odd number ");
//		}

		/*
		 * a fast food company has two main order types, burger meal and chicken meal.
		 * both have the same prices. so if a cashier enters "burger" or "chicken" he
		 * will get the same price a float: 10.0 this test can be done with one if.
		 * check if in (string variable) equals "burger" or "chicken" and output the
		 * price 10.0 also if input is "soda" output 2.0 (do this with another if)
		 * 
		 * for example: input = burger output: 10.0
		 * 
		 * input = chicken output: 10.0
		 * 
		 */

//		float price = 10.0f;
//		float soda = 2.0f;
//		String meal;
//		Scanner cashier = new Scanner(System.in);
//		System.out.println("Please select your meal: burger or chicken ");
//		meal = cashier.next();
//		if (meal.equals("chicken") || meal.equals("burger")) {
//			System.out.println("total for your " + meal + "will be " + price);
//		}else {
//			System.out.println("We do not have that option for meal today! ");
//		}
//		if(meal.equals("soda")) {
//			System.out.println("For your soda will be " + soda);
//		}
//		
		/*
		 * Write a program that will print out month name by receiving a number. Use
		 * switch statement for conditions.
		 * 
		 * January February March April May June July August September October November
		 * December
		 * 
		 * Example: Display message: Enter month number: input: 5 Display message: May
		 */

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter number of month you want to display ");
//		int mes = input.nextInt();
//
//		switch (mes) {
//		case 1:
//			System.out.println("January");
//			break;
//		case 2:
//			System.out.println("February");
//			break;
//
//		case 3:
//			System.out.println("March");
//			break;
//		case 4:
//			System.out.println("April");
//			break;
//		case 5:
//			System.out.println("May");
//			break;
//		case 6:
//			System.out.println("June");
//			break;
//		case 7:
//			System.out.println("July");
//			break;
//		case 8:
//			System.out.println("August");
//			break;
//		case 9:
//			System.out.println("September");
//			break;
//		case 10:
//			System.out.println("October");
//			break;
//		case 11:
//			System.out.println("November");
//			break;
//		case 12:
//			System.out.println("December");
//			break;
//
//		}

		// CONDITIONS_2

		/*
		 * 
		 * Let's say I've got a 100$ gift card and you want to buy something in your
		 * online store. Write a program that will help me to buy something and display
		 * leftover balance after purchase. If item is not in the list, display message:
		 * "Invalid item!". If price is more than100$, display message:
		 * "Sorry, not enough funds on your gift card!".
		 * 
		 * 
		 */
		System.out.println("NEED PRACTICE TO MANAGE THE EXERCISE AND THE LOGIC");
//		Scanner scan = new Scanner(System.in);
//		String[] items = { "Smartphone", "Laptop", "Charger", "USB cable", "Headphones", "Pants", "Hat", "Socks",
//				"Blanket", "Pillow" };
//		int[] prices = { 300, 400, 15, 10, 30, 50, 25, 5, 60, 40 };
//
//		int giftCardBalance = 100;
//		System.out
//				.println("Welcome to the store, what would you like to buy today? your balance is: " + giftCardBalance);
//		String selectedItem = scan.nextLine();
//
//		boolean itemFound = false;
//
//		for (int i = 0; i < items.length; i++) {
//			if (selectedItem.equalsIgnoreCase(items[i])) {
//				itemFound = true;
//				if (prices[i] > giftCardBalance) {
//					System.out.println("Sorry not enough funds on your gift card ");
//				} else {
//					giftCardBalance -= prices[i];
//					System.out.println("You bought " + items[i] + " Your remaining balance is $" + giftCardBalance);
//				}
//
//				break;
//
//			}
//
//		}
//
//		if (!itemFound) {
//			System.out.println("Invalid item! ");
//		}
//
//		scan.close();

		// HERE IS A SECOND WAY TO DO IT SIMPLER WAY TO DO IT

//		Scanner scan = new Scanner(System.in);
//		int giftCardBalance = 100;
//
//		System.out.println("Pleas select what item do you want to buy ");
//		String selectedItem = scan.nextLine();
//
//		int itemPrice = 0;
//
//		switch (selectedItem.toLowerCase()) {
//		case "Smartphone":
//			itemPrice = 400;
//			break;
//		case "Laptop":
//			itemPrice = 500;
//			break;
//		case "Charger":
//			itemPrice = 15;
//			break;
//		case "USB cable":
//			itemPrice = 10;
//			break;
//		case "Headphones":
//			itemPrice = 30;
//			break;
//		case "Pants":
//			itemPrice = 20;
//			break;
//		case "Hat":
//			itemPrice = 25;
//			break;
//		case "Socks":
//			itemPrice = 5;
//		default:
//			System.out.println("Invalid Item");
//			scan.close();
//			return;
//
//		}
//		if (itemPrice > giftCardBalance) {
//			System.out.println("Sorry not enough funds on your your giftcard");
//		} else {
//			System.out.println("You bought" + selectedItem + " your balance is " + giftCardBalance);
//		}
//
//		scan.close();

		/*
		 * In this problem you need to write a program that checks for the bigger of 3
		 * numbers. you get 3 int variables: n1, n2 and n3 if n1 is biggest output:
		 * "n1 is bigger" if n2 is biggest output: "n2 is bigger" if n4 is biggest
		 * output: "n3 is bigger"
		 * 
		 * 
		 * for example: n1 = 1 n2 = 2 n3 = 1 output: "n2 is bigger"
		 * 
		 * 
		 * n1 = 3 n2 = 2 n3 = 1 output: "n1 is bigger"
		 * 
		 * 
		 * n1 = 3 n2 = 2 n3 = 30 output: "n3 is bigger"
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first number ");
//		int n1 = scan.nextInt();
//		System.out.println("Enter second number ");
//		int n2 = scan.nextInt();
//		System.out.println("Enter thirth number ");
//		int n3 = scan.nextInt();
//
//		if (n1 > n2 && n1 > n3) {
//			System.out.println("n1 is the biggest " + n1);
//		} else if (n2 > n1 && n2 > n3) {
//			System.out.println("n2 is the biggest " + n2);
//
//		} else if (n3 > n1 && n3 > n2) {
//			System.out.println("n3 is the biggest " + n3);
//		} else {
//			System.out.println("numbers are the same ");
//		}

		/*
		 * In this assignment you will get a grade int and using ifs output if it's a
		 * passing grade or failure. if grade is bigger then 90 output excellent if the
		 * grade is bigger then 70 and smaller then 90 output good if grade is bigger
		 * then 60 and smaller then 70 output pass if grade is smaller then 60 output
		 * fail
		 * 
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("What is the grade for this student ? ");
//		int grade = scan.nextInt();
//
//		if (grade >= 90) {
//			System.out.println("Your grade is " + grade + " excellent ");
//		} else if (grade >= 70 ) {
//			System.out.println("Your grade is " + grade + " good ");
//		} else if (grade >= 60 ) {
//			System.out.println("Your grade is " + grade + " passed ");
//		} else if (grade < 60) {
//			System.out.println("Your grade is " + grade + " fail, you are comming in summer");
//		}

		/*
		 * In this assignment, you will write program for Leasing office.
		 * numberOfBedrooms variable already declared and assigned value using Scanner:
		 * starting Price is set to 0. Using Multi Way If statement create this program
		 * logic:
		 * 
		 * Print Welcome to Neotech Apartments! Print Number of bedrooms you are
		 * interested:
		 * 
		 * numberOfBedrooms is 1 print One Bedroom Selected set startingPrice as 1100
		 * 
		 * numberOfBedrooms is 2 print Two Bedroom Selected set startingPrice as 1850
		 * 
		 * numberOfBedrooms is 3 print Three Bedroom Selected set startingPrice as 2550
		 * 
		 * All other inputs: print No such Bedrooms available
		 * 
		 * Print Starting Price: startingPrice
		 */

//		Scanner scan = new Scanner(System.in);
//
//		int startingPrice = 0;
//
//		System.out.println("Welcome to NeoTech apartments How many rooms are you interested for ? ");
//		int numberOfBedrooms = scan.nextInt();
//
//		if (numberOfBedrooms == 1) {
//			startingPrice = 1100;
//			System.out.println("Sure for One Bedroom is " + startingPrice);
//		} else if (numberOfBedrooms == 2) {
//			startingPrice = 1850;
//			System.out.println("Sure for Two Bedrooms are " + startingPrice);
//		} else if (numberOfBedrooms == 3) {
//			startingPrice = 2550;
//			System.out.println("Sure for Thre Bedrooms are " + startingPrice);
//		} else {
//			startingPrice = 1100;
//			System.out.println("No Such Bedroms available, the starting price is " + startingPrice);
//
//		}

		/*
		 * In this assignment you are given an int num. you need to check if num is
		 * positive negative or equals to zero. use 3 if statements to do this. output
		 * if num is positive negative or zero
		 * 
		 * For Example num = 1 print: positive
		 * 
		 * num = -8 print: negative
		 * 
		 * num = 0 print: zero
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Write a positive, negative or neutral number");
//		int num = scan.nextInt();
//
//		if (num == 0) {
//			System.out.println(num + " is zero or a neutral number ");
//		} else if (num >= 0) {
//			System.out.println(num + " positive number ");
//		} else if (num < 0) {
//			System.out.println(num + " is a negative number ");
//		}
//
//		scan.close();
		System.out.println("NEED PRACTICE TO MANAGE THE EXERCISE AND THE LOGIC");
		/*
		 * The video game machines at your local arcade output coupons according to how
		 * well you play the game. You can redeem 10 coupons for a candy bar or 3
		 * coupons for a gumball. You prefer candy bars to gumballs. Write a program
		 * that defines a variable initially assigned to the number of coupons you win.
		 * Next, the program should output how many candy bars and gumballs you can get
		 * if you spend all of your coupons on candy bars first, and any remaining
		 * coupons on gumballs. if you the coupons are not enough for any redeem,
		 * display message: "Not enough coupons"
		 * 
		 * Example1: Display prompt: "Enter number of coupons:" 13 Display prompt:
		 * "Number of Candies: 1" Display prompt: "Number of Gumballs: 1"
		 * 
		 * Example2: Display prompt: "Enter number of coupons:" 23 Display prompt:
		 * "Number of Candies: 2" Display prompt: "Number of Gumballs: 1"
		 */

//		int remainder;
//		int candyBar = 10;
//		int gumBall = 3;
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("How many times did you win ? ");
//		int won = scan.nextInt();
//
//		if (won < 3) {
//			System.out.println("You are a loser");
//
//		} else if (won >= candyBar || won >= 100) {
//			System.out.println("You won " + won + " here is your CANDY BAR and you have " + won % candyBar + " left ");
//			System.out.println("Press continue or finish to get your " + won % candyBar + " left");
//			String keep = scan.next();
//			if (keep.contains("continue")) {
//				System.out.println("Let's do this! ");
//			} else {
//				System.out.println("Here is your " + won % candyBar + " never come back here loser");
//			}
//
//		} else if (won <= 9) {
//			System.out.println("You can have " + won / gumBall + " CANDY BALL ");
//		} else {
//			System.out.println("Thank you for playing with us");
//		}
		
		
		
		

	}
}
