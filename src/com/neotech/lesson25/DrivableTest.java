package com.neotech.lesson25;

public class DrivableTest {

	public static void main(String[] args) {

		// Drivable d1 = new Drivable();

		Drivable d1 = new Cars();
		d1.drive();
		// car1.start(); CANNOT access cause is not part of Drivable

		System.out.println(Drivable.DRIVE_FAST);
		// Drivable.DRIVE_FAST = false; // you cannot do this because is Final

		System.out.println("------");
		Vehicles v1 = new Cars();
		v1.stop();
		v1.start();
		// v1.drive(); has no access because is a Vehicles type

		System.out.println("------");
		Cars c1 = new Cars();

		c1.start();
		c1.drive();
		c1.stop();
		
		
		System.out.println(c1.DRIVE_FAST);
		System.out.println(Drivable.DRIVE_FAST);
		
		
		

	}

}
