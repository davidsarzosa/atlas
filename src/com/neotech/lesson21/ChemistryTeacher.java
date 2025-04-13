package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher {

	boolean cookMeth;

	public void teachChemistry() {
		if (cookMeth) {
			System.out.println(name + " " + lastName + " is cooking! ");
		} else {
			System.out.println("is Pinkman, still good quality Bitch! ");
		}

	}

	public static void main(String[] args) {

		ChemistryTeacher ct = new ChemistryTeacher();
		ct.age = 56;
		ct.name = "Walter";
		ct.lastName = "White";
		ct.cookMeth = true;

		ct.teaches();
		ct.teachChemistry();

	}

}
