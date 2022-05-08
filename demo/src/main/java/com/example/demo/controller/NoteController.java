package com.example.demo.controller;

import com.example.demo.entity.Note;
import com.example.demo.entity.Operation;
import com.example.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins="http://localhost:3000/")
public class NoteController {

    @Autowired
    private NoteService service;

    @GetMapping("get/notes")
    public List<Note> getAllNotes(){
        return service.getNotes();
    }

    @GetMapping("get/operations")
    public List<Operation> getAllOperations(){
        return service.getOperations();
    }

    @PostMapping("save/note")
    public Operation saveNote(@RequestBody Note note){
        return service.saveNote(note);
    }

    @PostMapping("save/operation")
    public Operation saveOperation(@RequestBody Operation operation){
        return service.saveOperation(operation);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note){
        return service.updateNote(note);
    }

    @PutMapping("update/operation")
    public Operation updateOperation(@RequestBody Operation operation){
        return service.updateOperation(operation);
    }

    @DeleteMapping("delete/note/{id}")
    public void deleteNote(@PathVariable Long id){
        service.deleteNote(id);
    }

    @DeleteMapping("delete/operation/{id}")
    public void deleteOperation(@PathVariable Long id) {
        service.deleteOperation(id);
    }
}
