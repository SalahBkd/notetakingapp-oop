package com.salahbkd.notetakingapp;

public interface Crudable {
	public void addElement(Object element);
	public void updateElement(int elementId);
	public void deleteElement(int elementId);
}
