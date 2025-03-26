package com.neotech.lesson16;

public class Task1 {

	// Create a String and print it in reverse order (Sunday → yadnuS)
	public static void main(String[] args) {

		String reverse = "Sunday";

		for (int i = reverse.length() - 1; i >= 0; i--) {
			System.out.print(reverse.charAt(i));
		}
		
	}
}
