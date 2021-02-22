package com.salahbkd.notetakingapp;

public abstract class User {
	private static int totalUsers;
	
	protected int userId;
	private String firstName;
	private String lastName;
	protected String login;
	protected String password;
	protected boolean isAdmin;
	
	protected User(String firstName, String lastName, String login, String password, boolean isAdmin) {
		totalUsers++;
		this.userId = totalUsers;
		this.firstName = firstName;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
	@Override
	public String toString() {
		return this.userId + " " + this.firstName + " " + this.lastName + " " + this.isAdmin + " " + this.login + " " + this.password; 
	}
	
	public static boolean checkCredentials(User user, UsersCollection users) {
		boolean isAuthentified = false;
		for(User tempUser : users.getElements()) {
			if(tempUser.login.equals(user.login) && tempUser.password.equals(user.password)) {
				isAuthentified = true;
			}
		}
		return isAuthentified;
	}

}
