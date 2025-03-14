package com.neotech.lesson11;

public class IntroToArrays {

	public static void main(String[] args) {

		// Declare and assing an int

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		// what if I have a way to group all of these same-type varuables togueter

		// First way
		int[] array1 = new int[5]; // we declare an array and we gave it a length of 5
		// this is the current state of array1 = [0][0][0][0][0]
		// the size is fixed, once I said in line 17 that the size is 5, it will not
		// change

		// the number we use to access elements in an array is called an index
		// System.out.println(array1[1]); // 0 by defaul

		// how do we assing values ?
		// if i were to reassing a value to num3
		num3 = 5;
		// I have to assing the value on the specific index
		// index 0 1 2 3 4

		array1[0] = 5; // [5][0][0][0][0]
		array1[1] = 10;// [5][10][0][0][0]
		array1[2] = 15; // [5][10][15][0][0]
		array1[3] = 20; // [5][10][15][20][0]
		array1[4] = 25; // [5][10][15][20][25]

		// 2nd way
		int[] array2;

		array2 = new int[3]; // this meaning 3 elements with index 0, 1, 2

		array2[2] = 10; // assigning a value to index 2(third element)
		// array2[3] = 15; // Exception: ArrayIndexOutOfBounds;

		// int[] array1 = new int[5]; // --> this is the same way but the type changes

		// Declaring the array with a STRING
		String[] strArray = new String[3];
		// assigning a value to the array

		strArray[2] = "New York";
		strArray[0] = "Indianapolis";
		strArray[1] = "Quito";
		// strArray[3] = "Ambato"; here you are trying yo assing a value to a locationg
		// that does not exsit.

		System.out.println(strArray[0]);

		// System.out.println("///////////////////////////");

		char[] letters = new char[6];

		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';
		letters[4] = 'E';
		letters[5] = 'F';

		System.out.println("the letter with the index 5 is " + letters[5]);

	}

}
