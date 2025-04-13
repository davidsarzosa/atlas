package com.neotech.lesson23;

public class Shape {

	/*
	 * 
	 * Write program: Shape class has a constructor that takes the radius and has a
	 * subclass as Circle class. In Circle class create a method to calculate the
	 * area of circle. Test your code
	 * 
	 */

	int radius;

//	Shape() {
//	}

	Shape(int radius) {
		this.radius = radius;

	}

}

class Circle extends Shape {

	/*
	 * Circle() { // this constructor by default calls super() --> Shape(); but the
	 * super class is // not allowing this
	 * 
	 * // I can let the user create an object of this class whitout passing a
	 * radius. // But the superclass must get a radius, So I pass a default radius.
	 * super();
	 * 
	 * }
	 */

	Circle(int radius) {
		super(radius);
	}

	void calculateArea() {
		System.out.println("The area of the circle is " + Math.PI * radius * radius);
	}

}