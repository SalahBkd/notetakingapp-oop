package com.salahbkd.notetakingapp;

import java.util.ArrayList;

// TODO: finish the COLLECTION classes Users and Notes
public class TestMain {

	public static void main(String[] args) {
		UsersCollection users = new UsersCollection();
		StandardUser user = null;
		
		Admin admin = new Admin("Salah", "boukadi", "salahboukadi@gmail.com", "salah1", true);
		users.addElement(admin);
		System.out.println("admin added succefully !!");
		
		System.out.println("Login as Admin...");
		if(Security.identifyUser(admin, users)) {
			System.out.println("logged succefully as admin...");
			user = new StandardUser("yusuf", "boukadi", "yusufboukadi@gmail.com", "yusuf1", false);
			users.addElement(user);
			System.out.println("user added succefully by admin!!");
			users.updateElement(user.getId());
		}
		
		System.out.println("Login as User...");
		User tempUser =  users.getUser(user.getId());
		System.out.println(tempUser.toString());
		
		if(Security.identifyUser(tempUser, users)) {
			System.out.println("logged succefully as standar user...");
			System.out.println("adding notes...");
			NotesCollection notes = new NotesCollection();
			Note note = new Note("note1", "this is note 1 body");
			Note note2 = new Note("note2", "this is note 2 body");
			notes.addElement(note2);
			notes.addElement(note);
			System.out.println("notes added succefully...");
			System.out.println("before sorting...");
			for(Note tmpNote : notes.getElements())
				System.out.println(tmpNote.title);
//			notes.updateElement(note.getId());
//			notes.deleteElement(note.getId());
//			Note foundedNote = notes.search(note.getId());
//			System.out.println("note found with id: " + foundedNote.title + foundedNote.getId());
			ArrayList<Note> sortedNotes = notes.sort(notes.getElements());
			System.out.println("after sorting...");
			for(Note tmpNote : sortedNotes)
				System.out.println(tmpNote.title);
			users.deleteElement(user.getId());
		};
	}
}
