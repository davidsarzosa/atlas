package com.neotech.lesson26;

public interface ShapeTest {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.calculateArea(10);
		c.calculatePerimeter(10);

		Square s = new Square();
		s.calculateArea(20);
		s.calculatePerimeter(20);

		System.out.println("-------------------");
		Shape[] shapes = { new Square(), new Circle(), new Circle(), new Square() };

		for (Shape shape : shapes) {

			shape.calculateArea(40);
			shape.calculatePerimeter(40);

		}

	}

}
