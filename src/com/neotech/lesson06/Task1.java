package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// Write a program that asks user to enter first name and
		// then last name. At the end system should display user's full name.

		System.out.println("Enter your first name : ");
		Scanner input = new Scanner(System.in);
		String name = input.next();

		System.out.println("Enter your last name :");
		String lastName = input.next();
		System.out.println("Your full name is :  " + name + " " + lastName);

		System.out.println("=================================================");

		System.out.println(
				"Hello thank you for your visit, How can I help you today? /n We have Flowers, Sun Flowers, Hot Chocolate ");
		Scanner input2 = new Scanner(System.in);
		String flowersOrder = input2.next();
		if (flowersOrder == "Flowers") {
			System.out.println(" Of course we can get you a nice bouquet for your wife! ");
		}
		if (flowersOrder == "Sun Flowers") {
			System.out.println(" Of course how many do you need ? ");
		}
		if (flowersOrder == "Hot Chocolate") {
			System.out.println(" Go to next door they can take care of you! ");
		}

		System.out.println("is there anything else I can do for you ? ");
		String thankClient = input2.next();
		if (thankClient == "No thanks that is all") {
			System.out.println("Thank, you have a good one");
		} else {
			System.out.println("Any way I need to study Java bye! ");

		}

		System.out.println("=================================================");

	}

}
