package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> choco = new ArrayList<>();
		choco.add("Ferrero");
		choco.add("Noggi");
		choco.add("Manicho");
		choco.add("Vizio");

		ArrayList<String> sweet = new ArrayList<>();

		sweet.add("Arope");
		sweet.add("Nutella");
		sweet.add("Mermelada");
		sweet.add("Turron");

		// adding all choco items in sweet list
		sweet.addAll(choco);
		System.out.println("Sweets has " + sweet.size() + " items");

		// how to Iterate Collections:
		// 1. We can use loops (indexed or enhanced for loop) or any loop you like

		// 2. using an Iterator object
		Iterator<String> it = sweet.iterator();

		// it.hasNext() --> checks if there is a next element in the list

		while (it.hasNext()) {
			String element = it.next();

			System.out.print(element + "-");
			if (element.equals("Turron")) {
				it.remove();
			}

		}
		System.out.println();
		System.out.print(sweet);

		System.out.println();
		// enhanced for loop
		for (String caramelos : sweet) {
			System.out.print(caramelos + " ");
		}
		System.out.println();

		// using index for loop
		System.out.println();
		for (int i = 0; i < sweet.size(); i++) {
			System.out.print(sweet.get(i) + " ");
			
			
		}
	}

}
