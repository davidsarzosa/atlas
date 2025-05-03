package com.neotech.lesson26;

public class Doctor {

	// a class always have just some attributes

	private long licenseID;
	private long phoneNumber;
	private String email;

	// getter for licenseID;
	// getter:
	// - will have return type same as the type of the variable we are returning
	// - no parameter needed

	// getter for licenseID
	public long getLicenseID() {
		return licenseID;
	}

	// getter for phoneNumber
	public long getPhoneNumber() {
		return phoneNumber;
	}

	// getter for String
	public String getEmail() {
		return email;
	}

	// typical setter:
	// void return type;
	// input parameter;
	// perform assignment;

	// Setter for licenseID
	public void setLicenseID(long licenseID) {
		this.licenseID = licenseID;
	}

	// Setter for phoneNumber()
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Setter for email
	// I will have to assume these two requirements:
	// 1. email cannot be empty
	// 2. email must contain @gmail.com

	public void setEmail(String email) {
		if (!email.isEmpty()) {
			if (email.contains("@gmail")) {
				this.email = email;

			} else // the email does not have email on it
			{
				System.out.println("you have to use gmail account ");

			}
		}

		// we could do this

//			if (!email.isEmpty() && email.contains("@gmail.com")) {
//				this.email = email;
//			}
//
//		}

	}
}
