package com.neotech.lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {

		/*
		 * HashSet -- > No duplicates, No insertion order, Accepts null elements
		 * 
		 */

		Set<String> veggies = new HashSet<>();

		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potatoe");
		veggies.add("onion");
		veggies.add("tomato");
		// veggies.add(null); not accepted by TreeSet

		System.out.println(veggies);

		Set<String> v1 = new HashSet<>();
		/*
		 * Set is an interface --> has no implementation -- whatever action is
		 * performed, it is defined by the type of object casted /
		 * 
		 * TRANSLATION: The behavior depends on whether you use HashSet, TreeSet, etc.
		 * 👉 Because now, your code only depends on the interface (Set). This gives you
		 * flexibility later!
		 * 
		 * For example, you can easily switch to a TreeSet or LinkedHashSet without
		 * changing the rest of your code: Set<String> veggies = new TreeSet<>(); //
		 * Sorted Set<String> veggies = new LinkedHashSet<>(); // Keeps insertion order
		 */

		// LinkedHashSet --> no duplicates, maintains insertion, order, accepts null
		// elements
		System.out.println("This is LinkedHashSet example");
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("Coconut");
		fruits.add("Watermellon");
		fruits.add("Coconut");
		fruits.add("Bananas");
		fruits.add("Peach");
		fruits.add("Apple");
		// fruits.add(null); not accepted by TreeSet
		fruits.add("Peach");
		fruits.add("Watermellon");
		fruits.add("Bananas");
		System.out.println("The size of fruits is " + fruits.size());
		System.out.println(fruits);

		// TreeSet --> no duplicates, ascending order, null not accepted
		System.out.println("This is TreeSet example");
		Set<String> food = new TreeSet<>();
		// food.add(null);
		food.add("borsh");
		food.add("chaulafan");
		food.add("enceboolado");
		food.add("ceviche");
		food.add("burger");
		food.add("chaulafan");
		food.add("empanadas");
		food.addAll(veggies);
		food.addAll(fruits);
		System.out.println("The size of fruits is " + food.size());
		System.out.println(food);

	}

}
