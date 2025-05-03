package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class insuranceTest {

	/*
	 * Create 3 objects of the sub classes and store them in ArrayList. Using for
	 * loop/advanced for loop/iterator access all methods of the class.
	 */
	public static void main(String[] args) {

		ArrayList<Insurance> ial = new ArrayList<>();
		ial.add(new Car("Geico", "Toyota Supra"));
		ial.add(new Pet("Pet Austin Care", "Dog"));
		ial.add(new Health("Humana", "Vanguardia"));

		for (Insurance is : ial) {
			is.getQuote();

		}
		System.out.println("---------------------------------------------");
		System.out.println("Some people's reason to cancel insurance: ");
		// I want to print cancel insurance with Iterator
		Iterator<Insurance> it = ial.iterator();
		while (it.hasNext()) {
			Insurance insurance = it.next();
			insurance.cancelInsurance();
		}

	}

}
