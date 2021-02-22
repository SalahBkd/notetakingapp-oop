package com.salahbkd.notetakingapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NotesCollection implements Crudable, Searchable {
	private ArrayList<Note> notes = new ArrayList<>();
	
	public NotesCollection() {}
	

	private Note getNote(int noteId) {
		return Note.getNoteFromNotes(notes, noteId);
	}
	
	public ArrayList<Note> getElements() {
		return this.notes;
	}


	@Override
	public void addElement(Object element) {
		Note note = (Note) element;
		notes.add(note);
	}

	@Override
	public void updateElement(int noteId) {
		Note tempNote = getNote(noteId);
		System.out.println("old title: " + tempNote.title);
		tempNote.changeTitle("updatedTitle");
		System.out.println("new title: " + tempNote.title);
	}

	@Override
	public void deleteElement(int noteId) {
		Note tempNote = getNote(noteId);
		System.out.println("Note deleted succufully... " + this.notes.remove(tempNote));
	}

	@Override
	public Note search(int noteId) {
		return getNote(noteId);
	}

	public ArrayList<Note> sort(ArrayList<Note> notes) {
		// descending sort.
		Collections.sort(notes, new Comparator<Note>() {
			public int compare(Note note1, Note note2) {
				return String.valueOf(note1.title).compareTo(note2.title);
			}
		});
		return notes;
	}
}
