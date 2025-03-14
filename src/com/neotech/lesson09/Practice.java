package com.neotech.lesson09;

import java.util.Scanner;

public class Practice {

	// ask the user to guess the number
	// lucky number is 15

	// As long as the entered number is not 5, we keep trying
	// Once the number is correct, we print ("You are the winner!!!");

	public static void main(String[] args) {

		// What is the lucky number you are asking to the console ? (15 ok1 )
		int luckyNumber = 15;
		int guessNumber;
		System.out.println("Hello!, lets try it your lucky number today ? ");
		Scanner myScanner = new Scanner(System.in);
		guessNumber = myScanner.nextInt();
		while (luckyNumber != guessNumber) {
			System.out.println("Nope! this is not the number! try it again! ");
			guessNumber = myScanner.nextInt();
		}

		myScanner.close();
		System.out.println("Yes! congrats! you got the lucky number " + guessNumber);

		// now you will use the same but you will use it with a DoWhile

		int luckyNumber2 = 50;
		int guessNumber2;
		guessNumber2 = myScanner.nextInt();

		do {
			System.out.println("Enter a lucky number ? ");
			guessNumber2 = myScanner.nextInt();

		} while (luckyNumber2 != guessNumber2);

		System.out.println("nope! try it again! ");

		System.out.println("This is the lucky number you got it! ");

	}

}
