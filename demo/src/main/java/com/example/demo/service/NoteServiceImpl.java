package com.example.demo.service;

import com.example.demo.entity.Note;
import com.example.demo.entity.Operation;
import com.example.demo.repository.NoteRepository;
import com.example.demo.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private OperationRepository operationRepository;

    @Override
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Operation saveNote(Note note) {
        Operation operation = operationRepository.findById(note.getFkOperationId()).get();
        operation.addNote(note);
        noteRepository.save(note);
        return operationRepository.save(operation);
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public Operation saveOperation(Operation operation) {
        return operationRepository.save(operation);
    }

    @Override
    public Operation updateOperation(Operation operation) {
        return operationRepository.save(operation);
    }

    @Override
    public void deleteOperation(Long id) {
        Operation operationToBeDeleted = operationRepository.findById(id).get();
        if(operationToBeDeleted.getNotes().size() >= 0){
            operationToBeDeleted.getNotes().forEach(note -> noteRepository.deleteById(note.getId()));
        }
        operationRepository.deleteById(id);
    }

    @Override
    public List<Operation> getOperations() {
        return operationRepository.findAll();
    }
}
