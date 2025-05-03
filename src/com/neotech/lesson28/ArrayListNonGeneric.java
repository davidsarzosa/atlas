package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {

		ArrayList<Double> numbers = new ArrayList<>();

		numbers.add(4.3);
		numbers.add(5.4);
		numbers.add(3.1);
		numbers.add(6.1);
		numbers.add(7.3);

		// numbers.add("Sofia"); // Compiler error: You may only store Double in your
		// list
		// numbers.add(4); // Compiler error: You may only store Double in your list

		System.out.println(numbers);
		// lets replace the items
		// numbers.set(1, 4.3); Compile - ERROR
		// numbers.set(6, 1.1); Run-Time - ERROR

		// Lets remove an item from the list using INDEX
		numbers.remove(0);
		System.out.println(numbers);

		// lets remove an item from the list using the object
		numbers.remove(7.3);
		System.out.println(numbers);

		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(1);
		intArray.add(1);
		intArray.add(1);
		intArray.add(2);
		intArray.add(2);

		intArray.remove(1);
		intArray.remove(Integer.valueOf(1));
		System.out.println(intArray);

		// lest get the element on the list as well
		System.out.println("Finding the element by index -> " + intArray.get(1));

		// for loop
		for (int i = 0; i < intArray.size(); i++) {
			System.out.print(intArray.get(i) + " - ");
		}

		System.out.println();
		// enhanced for loop
		for (Integer element : intArray) {
			System.out.print(element + " ");
		}
		// enhanced for loop for double
		for (Double element : numbers) {
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println("------------------------");

		// non-generic ArrayList (The type is not specified)
		ArrayList al2 = new ArrayList<>();

		// generic ArrayList
		ArrayList<String> al3 = new ArrayList<>();
		al2.add(3); // int
		al2.add("Sofia"); // String
		al2.add(3.4); // double
		al2.add('$'); // char

		for (Object item : al2) {
			System.out.print(item + " ");
		}

	}

}
