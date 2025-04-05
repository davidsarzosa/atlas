package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.color = "Black";
		cat1.name = "Salem";
		cat1.weight = 3;

		cat1.sayMeow();
		cat1.displayCatInfo();
		System.out.println();
		cat1.sayMeow();

		System.out.println("--------------------------------");

		Cat cat2 = new Cat();
		cat2.color = "While";
		cat2.name = "Tais";
		cat2.weight = 5;

		cat2.sayMeow();
		cat2.displayCatInfo();
		System.out.println();
		cat2.sayMeow();

		System.out.println("--------------------------------");

		Cat cat3 = new Cat();
		cat3.color = "Grey";
		cat3.name = "Chipi Leo";
		cat3.weight = 4;

		cat3.sayMeow();
		cat3.displayCatInfo();
		System.out.println();
		cat3.sayMeow();

	}
}
