package com.neotech.lesson03;

public class Task2 {

	public static void main(String[] args) {

		// Create a new class named Task2
//
//	a) Write a program to print the area and perimeter of a rectangle with 
//	width = 5 and height = 8. Your program should say. “
//	”
//
//	Area = width * height
//	Perimeter = 

		int width = 5;
		int height = 8;

		int area = (width * height);
		int perimeter = 2 * (width + height);

		System.out.println();
		System.out.println();
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to"
				+ perimeter + "   and the area is " + area);

		System.out.println("-------------------------------------------------------------------");

//		
//		// Create a rectangle object with width 5 and height 8
//        Rectangle rectangle = new Rectangle(5, 8);
//        
//        // Print the formatted results using the object's methods
//        System.out.println(rectangle);
//    }
//}
//
//class Rectangle {
//    private int width;
//    private int height;
//    
//    public Rectangle(int width, int height) {
//        this.width = width;
//        this.height = height;
//    }
//    
//    // Calculate the area of the rectangle
//    public int getArea() {
//        return width * height;
//    }
//    
//    // Calculate the perimeter of the rectangle
//    public int getPerimeter() {
//        return 2 * (width + height);
//    }
//    
//    // Override toString() to provide a meaningful description
//    @Override
//    public String toString() {
//        return String.format(
//            "The rectangle with width %d and height %d has an area of %d and a perimeter of %d.",
//            width, height, getArea(), getPerimeter()
//        );	

	}

}
