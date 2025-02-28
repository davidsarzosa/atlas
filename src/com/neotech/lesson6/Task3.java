package com.neotech.lesson6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		// Write a program that asks user to enter two numbers
		// and prints which one is larger.

		System.out.println("Enter the first number to get started please : ");
		Scanner number = new Scanner(System.in);
		int number1 = number.nextInt();

		System.out.println("Enter the second number to complete task : ");
		int number2 = number.nextInt();

		if (number1 > number2) {
			System.out.println("Bigger number is " + number1);
		} else {
			System.out.println(" Bigger number is " + number2);
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
