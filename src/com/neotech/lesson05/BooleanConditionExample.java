package com.neotech.lesson05;

public class BooleanConditionExample {

	public static void main(String[] args) {

		// switch cannot evaluate boolean expression, but else if can.

		boolean isWeekend = false;
		boolean isHoliday = false;

		if (isWeekend && isHoliday) {
			System.out.println("Stay home and relax");
		} else if (isWeekend) {
			System.out.println("Go to the park and play soccer");
		} else if (isHoliday) {
			System.out.println("Go to watch the fireworks DT");
		} else {
			System.out.println("Time to work");
		}

		System.out.println("Im trying to make it!");
		System.out.println("Switch cannot handle boolean expressions \nElseIf can ");
		

	}

}
