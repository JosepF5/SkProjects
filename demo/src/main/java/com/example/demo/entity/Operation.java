package com.example.demo.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Operation")
@Table(name="operation")
@Data
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(
            cascade=CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Note> notes=new ArrayList<>();

    public Operation addNote(Note note){
        this.notes.add(note);
        return this;
    }
}
