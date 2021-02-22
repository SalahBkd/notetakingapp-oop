package com.salahbkd.notetakingapp;

public class Security {

	public static boolean identifyUser(User user, UsersCollection users) {
		return User.checkCredentials(user, users);
	}
	
	
 }
