package com.neotech.lesson26;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee em1 = new Employee();

		// lets try it to access the variables directly

//		em1.age = 20;
//		em1.salary = 500;
//		em1.name = "Maksim";

		em1.setAge(20);
		em1.setName("Maelito");
		em1.SetSalary(3000);

		System.out.println(em1.getName());
		System.out.println(em1.getAge());
		System.out.println(em1.getSalary());

	}
}
