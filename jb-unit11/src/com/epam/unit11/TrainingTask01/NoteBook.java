package com.epam.unit11.main;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	private List<Note> notes = new ArrayList<Note>();
	public NoteBook() {
	}
	
	public List<Note> getNotes(){
	return notes;
	}
	
	public void add(Note note){
	notes.add(note);
	}
	
	public boolean delete(Note note){
	return notes.remove(note);
	}
	
	public Note findByContent(String content){
		for(Note note : notes){
			if (note.getNote().equals(content)){
				return note;
			}
		}
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoteBook other = (NoteBook) obj;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NoteBook [notes=" + notes + "]";
	}
	
	
}
