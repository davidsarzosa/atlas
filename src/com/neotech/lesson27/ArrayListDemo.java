package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10); // auto boxing
		numbers.add(50);
		numbers.add(56);
		numbers.add(23);
		numbers.add(13);
		numbers.add(30);

		// Integer num = 4; // auto- Boxing

		System.out.println("Element at index 2 is " + numbers.get(2));
		System.out.println("Does numbers contain 30 ? " + numbers.contains(numbers.contains(30)));
		System.out.println("Does numbers contain 50 ? " + numbers.contains(50));
		System.out.println(numbers);

		numbers.remove(0); // remove element at index 0;
		System.out.println(numbers);

		numbers.remove(new Integer(56)); // remove the element 56
		System.out.println(numbers);

		// If we have the object we can remove it directly
		numbers.add(100);
		System.out.println(numbers);
		
		Integer el = 100; 
		
		numbers.remove(el);
		System.out.println(numbers);
		
		numbers.clear();
		System.out.println(numbers);

		
		

		
		
		

	}

}
