package com.example.demo.dto;

import com.example.demo.entity.Note;
import lombok.Data;

import java.util.List;

@Data
public class OperationDTO {
    private Long id;
    private String title;
    private List<Note> notes;
}
