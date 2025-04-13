package com.neotech.lesson22;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car();

		Car c2 = new Car("Toyota", "Supra", 2025);
		SportsCar c3 = new SportsCar();
		SportsCar c4 = new SportsCar("Lamborginni", "Huracan", 2025, "Automatic", 300);

		FamilyCar c5 = new FamilyCar();
		FamilyCar c6 = new FamilyCar("Lexus", "L450", 2025, true, 8);

		LuxurySportsCar l1 = new LuxurySportsCar();

	}

}
