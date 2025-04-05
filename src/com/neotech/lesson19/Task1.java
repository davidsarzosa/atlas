package com.neotech.lesson19;

public class Task1 {

	/*
	 * Create a method that will accept an array as parameter and will return the
	 * sum of all elements from that array. Method should be visible only within the
	 * same package and accessible by creating an instance of the class. Call this
	 * method from inside the class and another class in the same package.
	 * 
	 */

	// Method details
	// input array as a parameter
	// output sum of the array
	// can be visible only within the same package // DEFAULT method

	int sum(int myArray[]) {

		int sum = 0;
		for (int el : myArray) {
			sum += el;

		}
		return sum;

	}

	public static void main(String[] args) {

		Task1 obj = new Task1();
		int array[] = { 23, 34, 45, 67, };

		int sum = obj.sum(array);
		System.out.println("the total sum of the array is " + sum);

	}

}
