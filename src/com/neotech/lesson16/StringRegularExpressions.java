package com.neotech.lesson16;

public class StringRegularExpressions {

	public static void main(String[] args) {

		String greeting = "Good Evening!";

		// how to replace letters :

		// replace()
		String newGretting = greeting.replace('E', 'e');
		System.out.println(greeting);
		System.out.println(newGretting);
		System.out.println("----------------------------");

		String anotherGreeting = greeting.replace("Evening", "Afternoon");
		System.out.println(anotherGreeting);
		System.out.println("----------------------------");

		// what if I want to replace G -- > g, E -- e
		String replaceMultiple = greeting.replace('G', 'g').replace('E', 'e');
		System.out.println(replaceMultiple);
		System.out.println("----------------------------");

		// regular expression
		String combination = "My Phone number is # 321-654-987";
		System.out.println(combination);
		System.out.println("----------------------------");

		String combination2 = combination.replaceAll("[0-9]", "*");
		System.out.println(combination2);
		System.out.println("----------------------------");

		String combination3 = combination.replaceAll("[A-Z]", "+");
		System.out.println(combination3);
		System.out.println("----------------------------");

		String combination4 = combination.replaceAll("a-z", "+");
		System.out.println(combination4);
		System.out.println("----------------------------");

		String combination5 = combination.replaceAll("[a-zA-Z]", "+");
		System.out.println(combination5);
		System.out.println("----------------------------");

		// I will convert to the opposite of the expresison:
		// [0-9 ] --> replace all numbers 0-9
		// [^0-9] --> replace everything else but the number 0-9
		String combination6 = combination.replaceAll("[^0-9]", "");
		System.out.println(combination6);
		System.out.println("----------------------------");

		String combination7 = combination.replaceAll("[^0-9]", "=");
		System.out.println(combination7);
		System.out.println("----------------------------");

		String combination8 = combination.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(combination8);

	}

}
