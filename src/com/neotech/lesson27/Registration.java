package com.neotech.lesson27;

public class Registration {

	/*
	 * Homework 1: Create Registration Class in which you would have variables as
	 * email, userName and password that have an access scope only within its own
	 * class. After creating an object of the class user should be able to call
	 * methods and in each method separately pass values to set users email,
	 * username and password.
	 * 
	 * Requirements: Valid email consider to be only yahoo! Valid userName and
	 * password cannot be empty and should be of length larger than 6 characters.
	 * Also valid password cannot contain userName.
	 * 
	 * Homework 2: Slide number 14 in the pdf presentation. Implement the Code for
	 * the Diagram.
	 */

	private String email;
	private String userName;
	private String password;

	// getters first

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	// now setters

	public void setEmail(String email) {
		if (email.contains("@yahoo.com")) {

			this.email = email;
		} else if (!email.equals("@yahoo.com")) {
			System.out.println("Sorry only @yahoo.com allowed! ");
		}

	}

	public void setUserName(String userName) {
		if (!userName.isEmpty() && userName.length() >= 6) {
			this.userName = userName;
		} else {
			System.out.println("User name must contain more than 6 characters!  ");

		}

	}

	public void setPassword(String password) {
		if (!password.isEmpty() && password.length() >= 6 && !password.contains(userName)) {
			this.password = password;
		} else {
			System.out.println(
					"No access allowed , valir password must have 6 or more characters and not include user name ");
		}

	}

}
