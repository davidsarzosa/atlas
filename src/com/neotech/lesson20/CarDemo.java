package com.neotech.lesson20;

public class CarDemo {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.make = "Toyota";
		car1.model = "Supra";
		car1.year = 2025;
		car1.printDetails();

		// create a new car object using the constructor method with parameters

		Car car2 = new Car("Lexus", "R350", 2025);
//		car2.make = "Lexus"; -- >IF YOU DONT RE DECLARE THIS VALUES
//		car2.model = "R350"; -- > THEN YOU WILL HAVE WHAT IS DECLARED  
//		car2.year = 2025; 	 -- >  IN AS A DEFAULT
		car2.printDetails();

	}

}
