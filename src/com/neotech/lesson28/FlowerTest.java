package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {
	public static void main(String[] args) {

		Flower[] flowerArray = { new Rose("Rose", "pink"), new Tulip("Tulip"), new SunFlower("SunFlower") };

		// flowerArray[3] = Rose("Rose2", "pink");
		// Arrays are fixed sized objects

		ArrayList<Flower> flowerList = new ArrayList<>();

		flowerList.add(new Rose("Fredom", "red"));
		flowerList.add(new Rose("Spirit", "yellow"));
		flowerList.add(new Tulip("Tulip"));
		flowerList.add(new SunFlower("Sun Flower"));

		// can I do this ?
		flowerList.add(flowerArray[0]); // Un-Boxing

		// Iteration over the flower list

		for (Flower flower : flowerList) {
			flower.bloom();
		}

		System.out.println("--------------------");
		// Using indexed ForLopp
		for (int i = 0; i < flowerList.size(); i++) {
			flowerList.get(i).bloom();
		}

		System.out.println("--------------------");
		// Using the iterator object

		Iterator<Flower> fi = flowerList.iterator();

		while (fi.hasNext()) {
//			Flower flower = fi.next();
//			flower.bloom();

			fi.next().bloom();

		}

	}

}
