package com.neotech.lesson26;

public class DoctorTest {

	public static void main(String[] args) {

		Doctor dr1 = new Doctor();
		// dr1.licenseID = 345345; you will never be able to do this
		// because this is a private so, only access within the same class

		dr1.setLicenseID(44884488);
		dr1.setPhoneNumber(99843873);
		dr1.setEmail("daalejandrosm@gmail.com");

		System.out.println(dr1.getLicenseID());
		System.out.println(dr1.getPhoneNumber());
		System.out.println(dr1.getEmail());
		
		

	}

}
