package com.neotech.lesson21;

public class USA {

	// instance variables
	String state, stateCapital;

	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}

	public USA() {

	}

	// lets create some methods!

	public void displaState() {
		System.out.println("State from instance variables " + state);

	}

	public void displayStateCapital() {
		System.out.println("Capital State from instance variables " + stateCapital);
	}

	public void displayinfo() {
		this.displaState(); // Calling the method inside the method
		displayStateCapital(); // this. is nor required, Java knows already

	}

	public static void main(String[] args) {

		// creating the object just to do one strength shot!

		USA us = new USA("NYC", "Puembo");

		us.displayinfo(); // calling 2 object in one shot! because they are together 
	}
}
