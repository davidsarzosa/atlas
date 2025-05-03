package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Sofia");
		list1.add("Scarlin");
		list1.add("Emilia");
		list1.addFirst("Polet");
		list1.addLast("Adriana");

		System.out.println("The size of list1 is " + list1.size());
		System.out.println(list1);

		// lets Iterate with a enhanced for loop
		for (String list : list1) {
			System.out.print(list + " - ");
		}

		System.out.println();
		LinkedList<String> list2 = new LinkedList<>();
		list2.addAll(list1);
		list2.addFirst("Dennis");
		list2.add(0, "Mateo");
		list2.add(1, "Adrian");
		System.out.println("The size of list2 is " + list2.size());
		System.out.print(list2);

		// We can use the Iterator were as well
		// Iterator list2 = new Iterator();

		// we can also go over this information with a enhance for loop
		System.out.println();
		for (String element : list2) {
			System.out.print(element + " ");

		}
		System.out.println();

		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		System.out.println();
		System.out.println("This is using a Iterator ");

		Iterator<String> list2Iterator = list2.iterator();
		while (list2Iterator.hasNext()) {
			System.out.print(list2Iterator.next() + " ");
		}

	}

}
