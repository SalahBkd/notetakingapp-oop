package com.salahbkd.notetakingapp;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Note {
	private static int totalNotes;
	
	private int noteId;
	protected String title;
	private String body;
	
	public Note(String title, String body) {
		totalNotes++;
		this.noteId = totalNotes;
		this.title = title;
		this.body = body;
	}
	
	@Override
	public String toString() {
		return this.noteId + " " + this.title + " " + this.body;
	}
	
	public static Note getNoteFromNotes(ArrayList<Note> notes, int noteId) {
		for(Note note : notes) {
			if(note.noteId == noteId) {
				return note;
			}
		}
		System.out.println("note not found !");
		throw new NoSuchElementException();
	}

	public void changeTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public int getId() {
		return this.noteId;
	}
}
