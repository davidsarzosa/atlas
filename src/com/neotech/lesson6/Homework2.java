package com.neotech.lesson6;

public class Homework2 {
	public static void main(String[] args) {

		/*
		 * Write a program to implement following logic using if - else if - else
		 * statement: if hour is less than 12 noon, greet with Good Morning if hour is
		 * greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
		 * if hour is greater than or equal to 3 pm, greet with Good Evening
		 */

		int time = 1;

		if (time < 12) {
			System.out.println("Good morning the time is " + time);
		} else if (time < 16) {
			System.out.println("Good Afternoon the time is " + time);
		} else if (time <= 24) {
			System.out.println("Good Evening the time is " + time);
		} else if (time > 24) {
			System.out.println("Invalid time you are probably smoked pot");

		}

		int lunch = 9;

		if (lunch <= 9) {
			System.out.println("You canNOT affort luch, have a coffee and study JAVA");
		} else if (lunch <= 10) {
			System.out.println("You can have a taco or burrito");
		} else if (lunch <= 20) {
			System.out.println("You can have sushi or chicken");
		} else if (lunch >= 21) {
			System.out.println("You can have a stake");

		} else {
			System.out.println("Sorry we dont have that");
		}

	}

}
