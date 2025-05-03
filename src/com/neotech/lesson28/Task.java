package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {

		// Create arrayList with 6 different words.
		// Remove every word that end with 'e'. Use iterator.

//		ArrayList<String> words = new ArrayList<>();
//
//		words.add("coffee");
//		words.add("lemon");
//		words.add("phone");
//		words.add("elefante");
//		words.add("television");
//		words.add("rocket");
//
//		Iterator<String> it = words.iterator();
//		while (it.hasNext()) {
//			String word = it.next();
//			if (word.endsWith("e")) {
//				it.remove();
//			}
//		}
//		System.out.println(words);

		// Create arrayList with 6 different words.
		// Remove every word that end with 'e'. Use iterator.

		ArrayList<String> words = new ArrayList<>();
		words.addLast("hotel");
		words.add("apple");
		words.add("sperance");
		words.add("mercedez");
		words.addFirst("zebra");
		words.add(5, "lake");

		Iterator<String> it = words.iterator();
		{

			String word = it.next();

			if (word.endsWith("a")) {
				it.remove();
			}

		}
		System.out.print(words + " ");
	}

}
