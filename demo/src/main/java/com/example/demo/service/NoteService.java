package com.example.demo.service;

import com.example.demo.entity.Note;
import com.example.demo.entity.Operation;

import java.util.List;

public interface NoteService {
    List<Note> getNotes();
    Operation saveNote(Note note);
    Note updateNote(Note note);
    void deleteNote(Long id);
    Operation saveOperation(Operation operation);
    Operation updateOperation(Operation operation);
    void deleteOperation(Long id);
    List<Operation> getOperations();
}
