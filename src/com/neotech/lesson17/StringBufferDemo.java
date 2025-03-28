package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {

		// How did we create a String
		String a = "Hola";// String literal
		String b = new String("Hello");// using a new keyword

		// mutable string class:
		// StringBuffer
		// StringBuilder
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println("------------------------");

		// I cannot change a string object once its created

		a.concat(" All!"); // this is not changing a.
		System.out.println(a);
		System.out.println("------------------------");

		// I can change a StringBuffer object without creating a new one
		sb.append(" All!"); // this means adding without changing, next to the original String

		System.out.println(sb);
		System.out.println("------------------------");

		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println("------------------------");

		String subStr = sb.substring(2, 7);
		System.out.println(subStr);
		System.out.println("------------------------");

		// String example
		StringBuffer strBuff = new StringBuffer("some string here");
		StringBuilder strBuild = new StringBuilder("Some string here");

		strBuild.append(" some more text here ");
		System.out.println(strBuild);
		System.out.println("------------------------");

		strBuff.append(" but also more! ");
		System.out.println(strBuff);
		System.out.println("------------------------");

	}

}
