package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {

		int grades[] = new int[5];

		System.out.println("The size of the array is -- > " + grades.length);
		System.out.println("Grade with index 2 is --> " + grades[2]);
		System.out.println("Second grade in array is --> " + grades[1]);

		// 0 1 2 3 4
		// [0, 0, 0, 0]

		grades[3] = 90;

		// 0 1 2 3 4
		// [0, 0, 90, 0]

		// grades[5] = 100; // This will give me a run time error

		// grades[0] = Paul; // this will give me a compile time error because of the
		// string

		grades[2] = 100;
		grades[4] = 95;
		// 0 1 2 3 4
		// [0, 0, ,100,90,95,]

		grades[1] = 85;
		grades[0] = 80;
		// 0 1 2 3 4
		// [80,85,100,90,95,]

		// can I find the average for the grades ?

		// 1st way
		int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
		System.out.println("Sum of all grades is " + total);

		int avg = total / 5;
		System.out.println("Av of sum is : " + avg);

		System.out.println("============================");
		// 2nd way

		int sum = 0;

		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		System.out.println("Sum of all grades if " + sum);
		System.out.println("Avg of all grades is: " + sum / grades.length);
		System.out.println("-------------------------------------------");

		String[] cities = { "Chicago", "New York", "Miami", "Istanbul", "Madrid", "Paris" };

		System.out.println("The length of the array is + " + cities.length);

		// how Can I print the last city ?
		int lastIndex = cities.length - 1; // we can use were also all -2-3-4-5 numbers the array go brackwards
		System.out.println("the last city is " + cities[5]);
		System.out.println("the last city is " + cities[lastIndex]);

		// how do I print the city names on the screen ?

		for (int i = 0; i < cities.length; i++) {

			System.out.print(cities[i] + " ");
		}
		System.out.println();

		// how do I print the city names in reverse order

		for (int i = lastIndex; i >= 0; i--) {
			System.out.print(cities[i] + " ");
		}

	}

}
