package com.neotech.lesson19;

public class Task2 {

	/*
	 * Create a method that will take a String as a parameter and returns reversed
	 * String. Method should be available to all classes within your project and
	 * accessible by class name. Call this method from inside the same class and
	 * from a class in another package.
	 * 
	 */

	public static String reverse(String str) {

		str = "Alejandro";

		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);

		}
		return reversed;

	}

	// Logic2

	public static String reversed2(String str) {
		StringBuffer sb = new StringBuffer(str);
		String reversedStr = sb.reverse().toString();

		return reversedStr;

	}

	public static void main(String[] args) {

		String day = "Jueves no te ahueves";

		System.out.println(reverse(day));
		System.out.println(reversed2(day));

	}

}