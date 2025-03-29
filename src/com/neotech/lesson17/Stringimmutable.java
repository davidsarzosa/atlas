package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {

		String str1 = "Hello"; // create a string Hello
		str1.concat("World! "); // this is not adding
		System.out.println(str1);
		System.out.println("------------------------");

		System.out.println(str1.toUpperCase()); // did this change the str1 ? no! we created a new String "HELLO"
		// str1 was pointing at this string "Hello";
		System.out.println("------------------------");

		// now I am just saying that str1 points to a new str.concat("...").
		// str1 = str1.concat(" World");
		System.out.println(str1);

		int a = 10;
		a = 5;
		// here I am NOT changing 10, but only where a points to

		// Am I creating a new String ?
		String str2 = "Hello"; // I am creating a new string object str2, but I will point to the existing
		// "Hello" that I created above.

		System.out.println(str1 + " " + str2);

	}

}
