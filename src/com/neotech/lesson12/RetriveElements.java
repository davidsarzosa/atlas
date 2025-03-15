package com.neotech.lesson12;

import java.util.Arrays;

public class RetriveElements {
	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };
		System.out.println(grades.length);
		System.out.println(grades.clone());
		System.out.println("-----------------");
		System.out.println(Arrays.toString(grades));
		System.out.println("-----------------");

		// how do I get the values of the array ?

		// 1st Way
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.println();
		System.out.println("-----------------");
		// 2nd way // enhanced for loop

		for (char grade : grades) {
			System.out.print(grade + ", ");
		}

		System.out.println();
		System.out.println("-----------------");
		String[] fruits = { "Apple", "Orange", "Mango", "Cherry", "Banana", };
		// I want to write the names of the fruits, but if the fruit is Orange
		// I want to tell that its my fav fruit

		// 1st Way
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("Orange")) {
				System.out.println(fruits[i] + " [BTW Orange is my FAV Fruit]");
			} else {
				System.out.println(fruits[i]);
			}
		}
		System.out.println();
		System.out.println("-----------------");

		// There is a 2nd way using enhanced for loop

		for (String fruit : fruits) {
			if (fruit.equals("Orange")) {
				System.out.println(fruit + " [BTW Orange is my FAV Fruit]");
			} else {
				System.out.println(fruit);
			}
		}

		System.out.println();
		// how do I print my array ?

		System.out.println(Arrays.toString(fruits));

	}

}
