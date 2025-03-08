package com.neotech.lesson9;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {

		// ask the user to guess the number
		// lucky number is 15

		// As long as the entered number is not 5, we keep trying
		// Once the number is correct, we print ("You are the winner!!!");

		int luckyNumber = 15;
		int guessNumber;
		Scanner myScanner = new Scanner(System.in);

//		// Using a while loop 
//		System.out.println("What is your lucky number today ? ");
//
//		guessNumber = myScanner.nextInt();
//
//		while (guessNumber != luckyNumber) {
//			System.out.println("Nope! let's try it one more time! ");
//			guessNumber = myScanner.nextInt();
//
//		}
//
//		System.out.println("This is your Lucky number! you are the best! ");

		// here is another way to do this!
		// Using do-while seems to be a beyyer fit here

		do {
			System.out.println("Try it your lucky number this time harder ? ");
			guessNumber = myScanner.nextInt();
		} while (guessNumber != luckyNumber);

		System.out.println("Today is your lucky day! you got the lucky number!  ");

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
