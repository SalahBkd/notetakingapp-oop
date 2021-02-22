package com.salahbkd.notetakingapp;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StandardUser extends User {

	protected StandardUser(String firstName, String lastName, String login, String password, boolean isAdmin) {
		super(firstName, lastName, login, password, isAdmin);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public int getId() {
		return this.userId;
	}

	public static User getUserFromUsers(ArrayList<User> users, int userId) {
		for(User user : users) {
//			StandardUser stdUser = (StandardUser) user;
			if(user.userId == userId) {
				return user;
			}
		}
		System.out.println("user not found !");
		throw new NoSuchElementException();
	}

	public void changeEmail(String newLogin) {
		this.login = newLogin;
	}
}
