package com.example.demo.service;

import com.example.demo.entity.Note;

import java.util.List;

public interface NoteService {
    List<Note> getNotes();
    Note saveNote(Note note);
    Note updateNote(Note note);
    void deleteNote(Long id);

}
