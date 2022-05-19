package com.example.demo.dto;

import lombok.Data;

@Data
public class NoteDTO {
    public Long id;
    private String title;
    private String message;
    private Boolean done;
    private Long fkOperationId;
}
