package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {

		// concatenate --> join together using +

		String language = "Java";

		System.out.println("I know and love " + language + " programing!!!");
		System.out.println("I love and know and master " + language + "!!!!! ");

		String s1 = "I drive";
		String s2 = "Toyota Supra";
		String s3 = "In Austin Texas";

		System.out.println("This will be soon, what me how " + s1 + " " + s2 + " " + s3);

		// String + number

		String s4 = "Iam " + 3 + " times taller than my teacher";
		String s5 = "but my teacher knows Java so he has money and he has " + 4 + " toyota Supra";

		System.out.println(s4 + " " + s5);

		String two = "2";
		String four = "4";

		int a = 2;
		int b = 4;

		System.out.println(two + four);
		System.out.println((a + b));

		System.out.println("two " + b);

	}

}
