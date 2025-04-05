package com.neotech.lesson19;

public class Task4 {

	/*
	 * Create a method that will take a String as a parameter and returns reversed
	 * String. Method should be available to all classes within your project and
	 * accessible by class name. Call this method from inside the same class and
	 * from a class in another package.
	 * 
	 */

	public static String reverse(String str) {

		// LOGIC 1
		str = "Maelito";
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);

		}
		return reversed;

	}

	// LOGIC 2

	public static String reversed2(String str) {
		StringBuffer sb = new StringBuffer(str);
		String reversedStr = sb.reverse().toString();

		return reversedStr;
	}

	public static void main(String[] args) {

		String day = "Maelito";
		String dia = "Hoy es dia Sabado";
		System.out.println(reverse(day));
		System.out.println(reversed2(dia));

	}

}
