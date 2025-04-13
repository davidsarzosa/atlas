package com.neotech.lesson23;

public class ParentTest {

	public static void main(String[] args) {

		Parent p = new Parent();

		// p.hello // Can NOT access because is a private method from parent class
		p.bye(); // only can access bye because is not a private class

		System.out.println("----------------");

		Child c = new Child();
		// c.hello(); is calling the hello() from the child class, but it is also
		// private, so cannot access

		Child.bye(); // this is another way to call the method.
		
		

	}
}
