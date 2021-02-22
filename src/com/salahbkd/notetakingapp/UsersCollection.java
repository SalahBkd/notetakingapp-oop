package com.salahbkd.notetakingapp;

import java.util.ArrayList;

public class UsersCollection implements Crudable {
	private ArrayList<User> users = new ArrayList<>();
	
	public UsersCollection() {}
	
	public User getUser(int userId) {
		StandardUser tempUser = (StandardUser) StandardUser.getUserFromUsers(users, userId);
		return tempUser;
	}

	@Override
	public void addElement(Object element) {
		User user = (User) element;
		users.add(user);
	}

	@Override
	public void updateElement(int userId) {
		StandardUser tempUser = (StandardUser) getUser(userId);
		System.out.println("old email: " + tempUser.login);
		tempUser.changeEmail("youssefboukadi@gmail.com");
		System.out.println("new email: " + tempUser.login);
	}

	@Override
	public void deleteElement(int userId) {
		StandardUser tempUser = (StandardUser) getUser(userId);
		System.out.println("User deleted succufully... " + this.users.remove(tempUser));
	}

	public ArrayList<User> getElements() {
		return this.users;
	}

}
