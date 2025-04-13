package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {

		// Extending all the attributes and behaviors from Animal Class

		Animal a = new Animal();

		a.age = 4;
		a.color = "Black";
		a.name = "Sam";
		a.weight = 45;
		// a.breed = golden; Animal has not have this feature

		a.eat();
		a.sleep();
		a.displayInfo();
		// a.barks();Animal class has not have access to Dogs behaviors
		// a.meow(); Animal class has not have access to Cats behaviors

		System.out.println("--------------------------------");

		Dogs d = new Dogs();
		d.age = 3;
		d.color = "White";
		d.name = "Moss";
		d.weight = 3;

		d.breed = " Boxer - Akita "; // this is unique from gods class
		// we have all the behaviors

		d.barks(); // this is a unique behavior comes from Dogs class (child)
		d.eat();
		d.sleep();
		d.displayInfo();
		System.out.println("--------------------------------");

		Cats c = new Cats();

		c.age = 8;
		c.color = "Yellow";
		c.name = "Wynny";
		c.weight = 2;
		// c.breed = "Angora"; you CANOT use anything from Dogs class
		// c.barks(); // unique behavior comes from Dogs class
		// YOU CANNOT USE IT
		c.eat();
		c.sleep();
		c.displayInfo();
		c.meow();

		System.out.println("--------------------------------");

		Puppy p = new Puppy();

		p.age = 1;
		p.breed = "Castellan"; // Inheritance from DOGS class
		p.color = "White Cream";
		p.name = "Tonny";
		p.weight = 6;
		p.hasTrainer = false;

		// now we can do the behaviors

		p.barks(); // coming from child class Dogs
		p.eat();
		p.sleep();
		p.displayInfo();
		// p.meow(); Cats behavior can not be reach from here

	}

}
