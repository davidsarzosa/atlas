package com.neotech.lesson07;

import java.util.*;

public class RecapScanner {

	public static void main(String[] args) {

		// Formula to declare a variable (Primitive Data Types)
		// Data Type Name/Identifier Operator(=) Value;

		// this is the exact same pattern
		// Formula for non-primitive data types:

		// ClassName Name/Identifier Operator (=) NEW ClassNmae();

		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a sentence");

		/*
		 * String text1 = scanner.next(); System.out.println(text1);
		 * 
		 * String text2 = scanner.next(); System.out.println(text2);
		 * 
		 * 
		 * // why is this different ?
		 * 
		 * String text3 = scanner.nextLine(); // It reads the input until \n (new line)
		 * System.out.println(text3);
		 * 
		 * 
		 * Point we can have a number in a string but we cannot have a string as an int
		 * ype
		 * 
		 * 
		 *
		 * int x = 2; String a = "5";
		 * 
		 * System.out.println((x + 6)); System.out.println(a + 654321354);
		 *
		 * 
		 * System.out.println("Enter your age ? "); // String age = scanner.next(); int
		 * age = scanner.nextInt(); System.out.println(age);
		 * 
		 * System.out.println("Enter your current year ? "); int year =
		 * scanner.nextInt(); System.out.println(year);
		 * 
		 * System.out.println("Enter your salary: "); double salary =
		 * scanner.nextDouble(); System.out.println(salary);
		 * 
		 * System.out.println("It is snowing ? "); boolean isSnowing =
		 * scanner.nextBoolean(); System.out.println(isSnowing);
		 * 
		 * System.out.println("Enter your gender ? "); String gender = scanner.next();
		 * System.out.println(gender);
		 * 
		 * System.out.println("Enter yout gender ?"); char g = scanner.next().charAt(0);
		 * System.out.println(g);
		 * 
		 */

		System.out.println("Enter your name, age, salary, and, gender ");

		String name = scanner.next();
		int age = scanner.nextInt();
		double salary = scanner.nextDouble();
		char gender = scanner.next().charAt(0);

		System.out.println("Your info is " + name + " " + age + " " + salary + " " + gender + "!");

	}

}
