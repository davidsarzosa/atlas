package com.neotech.lesson23;

public class UserClassTest {

	public static void main(String[] args) {

		UserClass uc = new UserClass();
		System.out.println(uc.name + " " + uc.mobileNumber);

		UserInfo ui = new UserInfo("Paul", 34523412354645L, "435 Florencio Espinosa ");
		ui.userDetails();

	}

}
