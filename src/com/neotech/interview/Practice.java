package com.neotech.interview;

import java.util.Arrays;

import org.apache.commons.io.FileSystemUtils;

public class Practice {

	public static void main(String[] args) {

		System.out.println("-------------------IQ1----------------------------");

//		// Switching values with a temporary variable using numbers

//		int a = 100, b = 50;
//		System.out.println(a + " " + b);
//		a = a + b; // a= 150/ b=50
//		b = a - b; // a= 150/ b=100
//		a = a - b; // a= 50 / b=100
//		System.out.println(a + " " + b);
//
//		// now we can do it with a String as well and without a temporary variable
//
//		String str1 = "Java";
//		String str2 = "Selenium";
//
//		System.out.println(str1 + " " + str2);
//		str1 = str1 + str2;
//		str2 = str1.substring(0, str1.length() - str2.length());
//		str1 = str1.substring(str2.length());
//		System.out.println(str1 + " " + str2);

		// That will resolve switching position with variables without a temporary
		// variables

		System.out.println("-------------------IQ2----------------------------");

// Question number 2.

// Write a java program to check whether a given number is prime or not?
// number 1 is not prime, Prime number is a number that is greater than 1
// Prime number is divisible only by 1 and itself

//		int number = 23;
//		boolean prime = true;
//
//		if (number == 1) {
//			prime = false;
//		}
//		for (int i = 2; i < number; i++) {
//			if (number % i == 0) {
//				prime = false;
//				System.out.println(number + " is divisible by " + i);
//				break;
//			} else {
//				System.out.println(number + " is NOT divisible by " + i);
//			}
//
//		}
//		System.out.println(number + " Prime? " + prime);

//		int number = 6;
//		boolean prime = true;
//
//		if (number == 1) {
//			prime = false;
//		}
//
//		for (int i = 2; i < number; i++) {
//			if (number % i == 0) {
//				prime = false;
//				System.out.println(number + " is divisible by " + i);
//				break;
//			} else {
//				System.out.println(number + " is NOT divisible by " + i);
//			}
//
//		}
//		System.out.println("Is " + number + " Prime number ? " + prime);

		System.out.println("-------------------IQ3----------------");
// 3. Write a Java Program to print the first 10 numbers of Fibonacci series.
		// The ten first numbers of the Fibonacci serie

//		// There is many ways to print the 10 first numbers of the Fibonacci Series.
//
//		int num1 = 1, num2 = 1;
//		int next;
//
//		// I will print the result if I have it
//		// now I will loop into the solution
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(num1 + ",");
//
//			// finding the next number
//			next = num1 + num2;
//			num1 = num2;
//			num2 = next;
//
//		}
//
//		System.out.println();
//		// there is a second way using just a math trick, switching the numbers
//
//		int a = 1;
//		int b = 1;
//		// we can use the same concept for loop
//		
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(a + ",");
//
//			b = a - b;
//			a = a + b;
//
//		}

//		// Using a temporary variable 
//		
//		int num1 = 1, num2 = 1;
//		int next;
//		
//		for(int i =1; i <= 10; i ++) {
//			System.out.print(num1 + ",");
//			
//			// using the temporary variable 
//			next = num1 + num2; // this is making addition (sum)
//			num1 = num2;
//			num2 = next; 
//			
//		}
//		
//		// without using a temporary variable, using just math 
//		System.out.println();
//		int a = 1, b =1;
//		for(int i = 1; i <= 10; i ++) {
//			System.out.print(a + ",");
//		
//		// switching the variables 
//		
//			b = a-b;
//			a = a+b;
//			
//		}

//System.out.println("-------------------IQ4----------------------------");

		// Find out how many alpha characters are present in a String?
		// Find the number of words in a string?

		String str1 = "lksng@%#^#%@#$@%#%";
		str1 = str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1.length() + " " + str1); // ^ remove or add this and you will see the difference

		System.out.println("-------------------------");
		String str2 = "Hello my name is Sopita";
		System.out.println(" Total of:" + str2.length() + str2);

		String str3 = "Hello my name is Alaric and I'm a looser";
		String words[] = str3.split(" ");
		System.out.println("Number of words in the String --> " + str3.length());

		for (String el : words) {
			System.out.print(el + "");
		}
		System.out.println();
		System.out.println("Total of words ---> " + words.length);

//		String longString = "Hola mi nombre es Stacy y trabajo para un banco";
//		// First need to take care of the spaces using an array
//		String words[] = longString.split(" ");
//		// now we can take care of the size
//		System.out.println("Number of words in the String --> " + words.length);
//		// now we can find each word using a enhanced loop
//
//		for (String el : words) {
//			System.out.print(el + "-");
//		}

//		// Replacing all the AlphaCaracters from a String
//		String str1 = "dg@#$$#T4grdfbdger@$#%^@#%^#$%$^%&";
//		// Reassign the str1 into a str1.replaceAll
//		str1 = str1.replaceAll("[A-Za-z]", "");
//		// now we can print
//		System.out.println(str1 + " total of " + str1.length() + " AlphaChar");
//
//		// now we can do the same with the letter with the same general condition
//
//		String str2 = "dg@#$$#T4grdfbdger@$#%^@#%^#$%$^%&";
//		str2 = str2.replaceAll("[^A-Za-z]", ""); // -- > this will remove all the Alpha and leave the letters
//		System.out.println(str2 + " total of " + str2.length() + " Letters");
//
		////		System.out.println("-------------------IQ5----------------------------");
////
//		// Reverse the String
//		// this will be helping to reverse the String // so we can use word by word
//		String str = "ConsueloMoya";
//		System.out.println(str);

		// First Element will be with a method that needs to have a signature

//		// This will be helping to reverse the String // so we can use word by
//
//		String str = "ConsueloMoyaSilva";
//		System.out.println(str);
//
//		// first element will be with a method that needs to have a signature
//	}
//
//	public static String reverseOne(String str) { // now this is a level class so can be public static and we can call
//													// the method any time
//
//		String revesedStr = ""; // to do it one by one we need a index the loop will help us with that
//		// how I can from the string select a index ?
//		for (int i = str.length() - 1; i >= 0; i--) {
//			revesedStr += str.charAt(i); // get the char from str using index i
//
//		}
//
//		return revesedStr;
//
	}

//	public static String reverseOne(String str) {
//		// How I can From the string select a index ?
//		String revesedStr = ""; // to do it one by one we need a index the loop will help us with that
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			revesedStr += str.charAt(i); // get the char from str using index i
//		}
//
//		return revesedStr;
//	}

}
