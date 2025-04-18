package com.neotech.lesson24;

public class CarTest {

	public static void main(String[] args) {

//		Car car1 = new Car("VW", 2008);
//		car1.testDrive();
//		// car1.displayInfo();
//
//		Car car2 = new bmw("X5", 2025);
//		car2.displayInfo();
//		car2.testDrive();
//
//		tesla t1 = new tesla("CyberTruk", 2024);
//
//		t1.testDrive();
//		t1.electricCar();
//		t1.displayInfo();

		Car[] carArray = { new bmw("X6", 2025), new toyota("Supra", 2026), new tesla("Cybertruck", 2026),
				new chery("Mini 1 ", 2026) };
		for (Car car : carArray) {
			System.out.println("Brand " + car.brand + " model " + car.year);
			
			//car.testDrive(); // this will work because exist in Car class
			//System.out.println();
			// car.electricCar(); // this will not work because do not exist in Car class
			// car.speeds(); // this will not work because do not exist in Car class
			
			

		}

	}

}
