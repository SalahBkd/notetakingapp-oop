package com.salahbkd.notetakingapp;

public class Admin extends User {

	public Admin(String firstName, String lastName, String login, String password, boolean isAdmin) {
		super(firstName, lastName, login, password, isAdmin);
	}

	public boolean isAdmin() {
		return this.isAdmin;
	}
	

}
