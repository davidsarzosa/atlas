package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedList;

public class FoodLinkedList {

	public static void main(String[] args) {
		LinkedList<Food> foodList = new LinkedList<>();

		foodList.add(new Food("Salad", "Tomatoes", 200));
		foodList.add(new MexicanFood("Tacos", "Guacamole", 700));
		foodList.add(new TurkishFood("Baklava", "Pistacho", 500));

		// Lest go over the items of the list using advanced for loop

		for (Food food : foodList) {
			System.out.println(food.foodType + " " + food.ingredients + " " + food.calories);
		}

		System.out.println("-----------------------");

		// Lets use Iterator

		Iterator<Food> fIterator = foodList.iterator();
		while (fIterator.hasNext()) {
			Food f = fIterator.next();
			System.out.println(f.foodType + " " + f.ingredients + " " + f.calories);
		}

	}

}
