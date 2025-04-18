package com.neotech.lesson25;

public abstract class Phone {

	// first normal methods

	public void call() {
		System.out.println("Phones can make calls! ");
	}

	public void text() {
		System.out.println("Phones can text messages! ");
	}

	// unimplemented method: abstract method
	// If the class is not ABSTRACT then the method CANNOT be abstract

	public abstract void takePicture();

	public abstract void playMusic();

}

class Iphone extends Phone {

	@Override
	public void call() {
		System.out.println("Iphone can make 5G calls! ");
	}

	public void airDrop() { // You CANNOT access this class from PhoneTest if you are using Phone type
		System.out.println("Iphones can share with Ihones via Airdrop! ");
	}

	@Override
	public void takePicture() {
		System.out.println("Iphone can take picitures with 3 cameras! ");
	}

	@Override
	public void playMusic() {
		System.out.println("Iphone can play music with apple car play");
	}

}

class Samsung extends Phone {

	@Override
	public void playMusic() {
		System.out.println("Samsung can play music with android play! ");
	}

	@Override
	public void takePicture() {
		System.out.println("Samsung can take picitures with 4 cameras! ");
	}
	
	

	public void AI() { // you cannot access this from testPhone if you are using Phone abstract class
						// type
		System.out.println("Samsung can use AI since model S23 ultra");
	}

}
