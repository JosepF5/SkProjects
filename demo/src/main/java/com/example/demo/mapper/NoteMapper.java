package com.example.demo.mapper;

import com.example.demo.dto.NoteDTO;
import com.example.demo.entity.Note;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface NoteMapper {
    NoteDTO noteToNoteDTO(Note note);
    Note noteDTOToNote(NoteDTO noteDTO);

    List<NoteDTO> noteListToNoteDTOList(List<Note> Note);

    List<Note> noteDTOListToNoteList(List<NoteDTO> NoteDTOs);
}
