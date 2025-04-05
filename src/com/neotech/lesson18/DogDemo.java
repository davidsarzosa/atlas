package com.neotech.lesson18;

public class DogDemo {
	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.name = "Moss";
		dog1.age = 8;
		dog1.breed = "Boxer";
		dog1.displayDogInfo();

		// Static Variables will be by default displaying
		// for displayDogInfo
		// do not need to call them, will give an compile error

		Dog dog2 = new Dog();
		dog2.name = "Fawn";
		dog2.age = 5;
		dog2.breed = "Chihuahua";
		dog2.displayDogInfo();

		Dog dog3 = new Dog();
		dog3.name = "Tomas";
		dog3.age = 6;
		dog3.breed = "Husky";
		dog3.displayDogInfo();

		Dog.breed = "German Shepard"; // updating the static variable

		Dog dog4 = new Dog();
		dog3.name = "Sam";
		dog3.age = 8;
		dog3.displayDogInfo();

	}

}
