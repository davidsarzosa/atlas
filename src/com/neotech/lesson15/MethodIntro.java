package com.neotech.lesson15;

public class MethodIntro {

	// this method does not return anything
	// it only prints on the screen
	// and it does not receive any parameters

	void greet() { // method header
		System.out.println("hello");
		System.out.println("how are you today ? ");
		System.out.println("bye! ");

	}

	void greet2(String name) {
		System.out.println("hello " + name);
		System.out.println("How are you today ? " + name);
		System.out.println("bye! " + name);

	}

	void saludar() { // method header
		System.out.println("hola! ");
		System.out.println("Todo bien el dia de hoy ? ");
		System.out.println("Espero que pases muy bien Adios! ");

	}

	void saludar1(String name1) { // method header
		System.out.println("hola! " + name1);
		System.out.println("Todo bien el dia de hoy ? " + name1);
		System.out.println("Espero que pases muy bien Adios! " + name1);

	}

	void priviet() { // method header
		System.out.println("Priviet kak dela ? ");
		System.out.println("U tibia bce xorosho ? ");
		System.out.println("Jarasho Tagda! Poka! ");

	}

	void priviet1(String imea) {
		System.out.println("Priviet kak dela ? " + imea);
		System.out.println("U tibia bce xorosho ? " + imea);
		System.out.println("Xorosho Tagda! Poka! " + imea);

	}

	public static void main(String[] args) {

		// if you call the method directly without an object will not work
		// you need, I need to call a method
		// how to all a method ?
		// using logic!
		// the method is coming from a class!
		// remember you are using the method from the class
		// so we need to call a class first

		MethodIntro saludar = new MethodIntro();
		System.out.println("ENGLISH");
		saludar.greet();
		saludar.greet2("Kaylee");
		saludar.greet2("Donal Turmp");

		System.out.println("SPANISH");
		System.out.println();
		saludar.saludar();
		saludar.saludar1("Consuelo");
		saludar.saludar1("Daniel Noboa");
		System.out.println("RUSSIAN");
		System.out.println();
		saludar.priviet();
		saludar.priviet1("Aleksei");
		saludar.priviet1("Vladimir Putin");

	}

}
