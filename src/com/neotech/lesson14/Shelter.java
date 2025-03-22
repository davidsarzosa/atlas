package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.breed = "Golden Retriver";
		dog1.size = "Medium";
		dog1.color = "Brown";
		dog1.age = 10;

		Dog dog2 = new Dog();
		dog2.breed = "German Shepard";
		dog2.size = "Medium Big";
		dog2.color = "Black";
		dog2.age = 3;

		Dog dog3 = new Dog();
		dog3.breed = "Chiguagua";
		dog3.size = "Small";
		dog3.color = "White";
		dog3.age = 2;

		dog1.eat();
		dog1.run();
		dog1.bread();
		System.out.println();
		dog2.eat();
		dog2.run();
		dog2.bread();
		System.out.println();
		dog3.eat();
		dog3.run();
		dog3.bread();

	}

}
