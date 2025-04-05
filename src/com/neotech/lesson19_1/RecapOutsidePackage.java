package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;
import com.neotech.lesson19.Recap;

public class RecapOutsidePackage {

	public static void main(String[] args) {

		System.out.println(Employee.company = "La voz del silencio");

		Employee Consue = new Employee();
		System.out.println(Consue.name = "Consuelo Moya"); // We only have access to name because is public
		// the same with the other class

		System.out.println(Recap.Company = "Juan Pio Montufar");

		Recap Mario = new Recap();
		System.out.println(Mario.name = "Mario Sarzosa"); // We only have access to name because is public as well
		
		
	}

}
