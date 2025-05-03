package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class DrinksDemo {

	public static void main(String[] args) {

		ArrayList<Drinks> drinksList = new ArrayList<>();
		// drinksList.add("Coca-Cola"); we need to create an object

		Drinks d1 = new Drinks("Pepsi");
		drinksList.add(d1);
		drinksList.add(new Drinks("Coca Cola"));
		drinksList.add(new Drinks("Seven Up"));
		drinksList.add(new Drinks("Origin"));
		drinksList.add(new Drinks("Doctor Pepper"));
		drinksList.add(new Drinks("Spirit"));

	

		for (Drinks drink : drinksList) {
			if (drink.drinks.contains("e") || (drink.drinks.contains("a"))) {
				System.out.println("Water");

			} else {
				System.out.println("This drink has not e or a " + drink.drinks);
			}

		}
	}

}
