package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		// animal.run(); this method is only on the child class(Tiger)

		Tiger tiger = new Tiger();
		tiger.eat();// which method runs ?
		tiger.sleep();
		tiger.run();
		System.out.println();
		// Casting

		// primitive casting
		int i = 3;
		double d = i;

		// casting with objects

		// what does this line ?
		// new Tiger(); --> creates a new Tiger object
		// Tiger tiger; --> tiger object

		// create a Tiger object, assing it to an Animal object
		// Up casting
		Animal a = new Tiger();
		// a is of Animal type, but has a Tiger object assigned to it
		a.eat();
		a.sleep();
		System.out.println();
		// a.run(); // Compile error - object a is of Animal type, it can
		// only see what is delared in the Animal class

		// When casting Tiger as an Animal object we are able
		// to access all methods of the Animal class
		// But if we have an overriding method in the Tiger class,
		// that takes priority on runtime.

		// Can we downcast ?
		// Yes Obama we can!!
		// but we have to be careful
		// Tiger t = new Annimal();
		// this is not SAFE

		// It is safe to downcast upcasted objects
		// for example

		// a is of Animal type, but i can downcast it to a Tiger

		Tiger t = (Tiger) a;

		t.eat();
		t.sleep();
		t.run();

	}
}
