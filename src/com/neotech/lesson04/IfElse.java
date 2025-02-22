package com.neotech.lesson04;

public class IfElse {

	public static void main(String[] args) {

		// If i have more than $5000 in my bank account
		// then I will buy a LV bag

		int account = 1535;

		if (account < 1535) {
			System.out.println("I will buy a LV bag");
			System.out.println("My wife will be happy");

		}

		System.out.println("I will leave the mall");

		System.out.println("--------------------------");

		// You shoud practive JAVA 15 hours per week
		// IF you are practicing 15 or more, you will love JAVA
		// otherwise you will NOT love JAVA

		int hours = 18;

		System.out.println("Practicing hours --> " + hours);

		if (hours >= 15) {
			System.out.println("you will love JAVA");

		} else {
			System.out.println("You will NOT love JAVA!!");

		}

		System.out.println("We are done for today");

	}

}
