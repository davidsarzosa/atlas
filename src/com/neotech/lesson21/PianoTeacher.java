package com.neotech.lesson21;

public class PianoTeacher extends Teacher {

	boolean ownsApiano;

	void teachssPiano() {
		if (ownsApiano) {
			System.out.println(name + " Teaches with his piano! ");
		} else {
			System.out.println(name + " has not have piano, he teach at the academy");
		}

	}

	public static void main(String[] args) {

		PianoTeacher pt = new PianoTeacher();

		pt.age = 50;
		pt.gender = 'M';
		pt.lastName = "Fetzel";
		pt.name = "Fransua";
		pt.ownsApiano = true;

		pt.teaches(); // this is coming from the parent class
		pt.teachssPiano(); // this is

	}

}
