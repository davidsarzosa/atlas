package com.neotech.lesson17;

import java.util.Arrays;

public class RecapPractice {

	// Some recap/practice about the code we review

	public static void main(String[] args) {

		// Class StringBufferDemo
		System.out.println("-------------- StringBufferDemo class  ---------------");

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

		// String example // String Buffer and String Builer

		StringBuffer strBuff = new StringBuffer("some string here"); // Buffer sensitive case when creating an object
		StringBuilder strBuild = new StringBuilder("Some string here "); // Builder sensitive case when creating an
																			// object

		System.out.println(strBuild);
		strBuild.append("some more text here ");
		System.out.println(strBuild);
		System.out.println("------------------------");

		System.out.println(strBuff);
		strBuff.append(" but also more!");
		System.out.println(strBuff);
		System.out.println("------------------------");

		// String Inmmutable class
		System.out.println("-------------- Inmmutable class  ---------------");

		// when you concat a String you are NOT adding all the value that inside of the
		// concat()
		String str1 = "Madre";
		str1.concat((" Mia! "));
		System.out.println(str1);
		System.out.println("------------------------");

		System.out.println(str1.toUpperCase());// this will not change the String this will only create a new String
		// str1 was pointing at this string "Madre" but its not making any change to the
		// string
		System.out.println("------------------------");

		// Now I am just saying that str1 points to a new str.concat(" ").
		str1 = str1.concat(" Mia!");
		System.out.println(str1);

		// when creating a new String we can create a new String str2 = "Madre"; but
		// this will point to the existing
		// "Madre" that I created above in str1
		String str2 = "Madre";

		System.out.println(str1 + " " + str2);

		System.out.println("-------------- String Split Class  ---------------");

		// split();
		String sentence = "Pidele el numero a la azafata, invitale un cafe";
		// to split the result with a || we do need an array
		String result[] = sentence.split(" ");

		// now I can for a enhance for loop and say(for each word let me print a "-" )
		for (String word : result) {
			System.out.print(word + "-");

		}
		System.out.println();
		System.out.println("------------------------");

		System.out.println("we also can pring the length " + result.length + " words");
		System.out.println("------------------------");

		// this is also works for a string that has numbers inside for example:
		String list = "Maelito3Paola3Aleksei4Consuelo5Mario6Julian";
		String[] names = list.split("[0-9]");

		for (String name : names) {
			System.out.print(name + " "); // a tab space
		}
		System.out.println();
		System.out.println("------------------------");

		// But also I can print Array directly
		// Array is a array utility class
		System.out.println(Arrays.toString(names));

		System.out.println("-------------- StringToCharArray Class  ---------------");
		// toCharArray

		String sentence2 = "Today is Saturday and we are learning Java";
		System.out.println(sentence2);
		char[] charArray = sentence2.toCharArray();
		System.out.println(charArray);
		System.out.println("------------------------");
		String sentence3 = "Today is Saturday and we will also go to the gym and run next to the lake!";
		char[] charArray3 = sentence3.toCharArray();
		System.out.println(charArray3);
		System.out.println("------------------------");

		// using enhance for loop

		for (char c : charArray) {
			System.out.print(c + "|");
		}
		System.out.println();
		for (char c3 : charArray3) {
			System.out.print(c3 + "|");
		}

		System.out.println();
		System.out.println("------------------------");
		System.out.println(Arrays.toString(charArray));
		System.out.println(Arrays.toString(charArray3));
		System.out.println("------------------------");

	}

}
