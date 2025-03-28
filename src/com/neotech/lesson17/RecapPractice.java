package com.neotech.lesson17;

public class RecapPractice {

	// Some recap/practice about the code we review

	public static void main(String[] args) {

		// Class StringBufferDemo
		String a = "Hello";
		String b = new String("Hola");

		// Mutable String class are : String Buffer, Builder

		StringBuffer sb = new StringBuffer("Hello"); // here you are creating a class
		System.out.println(sb);
		System.out.println("------------------------");

		a.concat(" All! ");
		System.out.println(a);
		System.out.println("------------------------");

		// we can change the StringBuffer("Hello") --> without creating a new one
		System.out.println(sb);
		sb.append(" All!"); // we can change the object(add info with ---> .append)
		System.out.println(sb);
		System.out.println("------------------------");

		// also we can reverse the string, and print the length, and get the substring
		// as well
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.substring(5, 10)); // one line process
		System.out.println("------------------------");
		

	}

}
