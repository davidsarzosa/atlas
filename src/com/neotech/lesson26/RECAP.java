package com.neotech.lesson26;

public class RECAP {

	// This RECAP is the methods and break down the code

	/*
	 * We have here the most important: The most important and how to use it is
	 * ENCAPSULATION Encapsulation can be also hiding code and can be achieve with
	 * setters and getters
	 * 
	 * Also we do have some information about interfaces so lets get started
	 * 
	 */

	// When making the the class private for example here

	private long bankAccount;
	private long userId;
	private String email;

	// we will get getter with public and we need a return value

	// Bank Account getter
	public long getBankAccount() {
		return bankAccount;

	}

	// Getter for userId;
	public long getUserId() {
		return userId;

	}

	// Getter for email;
	public String getEmail() {
		return email;

	}

	// we can do the same thing for the setter but we are not passing any value so
	// not return is required

	// setter for bankAccount
	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;

	}

	// Setter for userId

	public void setuserId(long userId) {
		this.userId = userId;

	}

	// Setter for email
	// Here I will like to put some special conditions

	// the conditions are 1. needs to be at least the size of the length 2
	// and also !notEmpty
	public void setEmail(String email) {

		if (!email.isEmpty()) {
			if (email.contains("@gmail.com"))
				this.email = email;
		} else {
			System.out.println("you must have a gmail account ");
		}

	}

	// there is so many conditions with a NON-PRIMITIVE DATA TYPE remember you need
	// to check the options
	
	
	
	
	
	
	
	
	
	
	
	

}
