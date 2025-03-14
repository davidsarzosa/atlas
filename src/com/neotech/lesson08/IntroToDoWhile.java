package com.neotech.lesson08;

public class IntroToDoWhile {

	public static void main(String[] args) {

		// For while loop:
		// check the condition first
		// if the condition is false, do not execute the body, just move on
		// if the condition is true, keep executing the body, until the condition
		// becomes false

		int num = 1;

		while (num < 15) {
			System.out.println(num + " ");
			num++;

		}
		System.out.println();

		// DO WHILE LOOP:
		// first execute the body ONCE, then check the condition
		// if the condition is false, do not execute the body anymore, just move on
		// if the condition is true, go back to executing the body until it becomes
		// false

		 num = 1;

		System.out.println("================================================");

		do {
			System.out.println(num + "");
			num++;

		} while (num < 10);

	}

}
