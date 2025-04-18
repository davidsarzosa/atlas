package com.neotech.lesson24;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer1 = new Apple();
		computer1.displayInfo(1200, "MacBookPro 16");

		Computer computer2 = new Lenovo();
		computer2.starts();
		computer2.displayInfo(1300, "ThinkPad");

		Computer computer3 = new HP();
		computer3.starts();
		computer3.displayInfo(900, "");

		Computer computer4 = new Dell();
		computer4.starts();
		computer4.displayInfo(900, "Dell Pavillion 3400");

		// Create array of computer FIRST WAY

		Computer[] computers = { computer1, computer2, computer3, computer4 };

		for (Computer comp : computers) {
			comp.starts(); // A method from the parent or overridden 
			comp.displayInfo(0, null); // Placeholder for now 
			
	
		}

	}

}
