package com.neotech.lesson25;

public class PhoneTest {

	public static void main(String[] args) {

		// We cannot instantiate the Phone class since it is abstract

		/*
		 * (not finished, not fully implemented,
		 * 
		 */

		// Phone phone1 = new Phone();

		Phone phone1 = new Iphone(); // up-casting
		phone1.call(); // Overriding child method will run
		phone1.text(); // Inherited method / parent method will run
		phone1.takePicture(); // Implemented method, child method will run
		// phone1.airDrop(); // no airDrop() method in Phone
		phone1.playMusic(); // Implemented method will run
		// if you remove the implemented method there will be a empty method waiting for
		// you to create

		Phone samsung1 = new Samsung();

		samsung1.call();
		samsung1.text();
		samsung1.takePicture();
		samsung1.playMusic();
		// samsung1.AI(); // NO AI Method in phone
		System.out.println();

	}

}
