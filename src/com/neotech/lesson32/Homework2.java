package com.neotech.lesson32;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Homework2 {

//	Homework 2:
//	    Create the collection that will store single unique objects of a String type in which order is preserved.
//	    Write a logic to concatenate all string from the collection.

	public static void main(String[] args) {

//		// ---> TO USE A COLLECTION WE NEED A SET
//
//		Set<String> shoes = new LinkedHashSet<>();
//		shoes.add("Reebok");
//		shoes.add("New Balance");
//		shoes.add("Nike");
//		shoes.add("Adidas");
//		shoes.add("Keen");
//		shoes.add("Timberland");
//		System.out.println("The size of shoes is --> " + shoes.size());
//		System.out.println(shoes);
//
//		// String types = Collections.sort(shoes);//
//
//		List<String> shoesList = new ArrayList<>(shoes);
//		System.out.println(shoesList);
//		// String types = Collections.sort(shoesList);

		List<String> shoes = new LinkedList<>();
		shoes.add("Reebok");
		shoes.add("New Balance");
		shoes.add("Nike");
		shoes.add("Adidas");
		shoes.add("Keen");
		shoes.add("Timberland");
		System.out.println(shoes);

		String first = Collections.max(shoes);
		System.out.println("first -- > " + first);
		System.out.println("last -- > " + Collections.min(shoes));
		Collections.sort(shoes);
		System.out.println(shoes);

	}

}
