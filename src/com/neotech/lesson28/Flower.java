package com.neotech.lesson28;

public abstract class Flower {

	String type;

	public Flower(String type) {
		this.type = type;

	}

	public abstract void bloom();

}

class Rose extends Flower {
	String color;

	public Rose(String type, String color) {
		super(type);
		this.color = color;
	}

	@Override
	public void bloom() {
		System.out.println(type + " Blooms in Ecuador and is a " + color + " color");
	}

}

class Tulip extends Flower {

	public Tulip(String type) {
		super(type);

	}

	@Override
	public void bloom() {
		System.out.println(type + " Blooms in Spring ");

	}

}

class SunFlower extends Flower {

	public SunFlower(String type) {
		super(type);

	}

	@Override
	public void bloom() {
		System.out.println(type + " Blooms in Fall! ");

	}

}
