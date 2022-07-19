package com.sofka.co.tour.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class BikerDTO {
    private String id;
    private String fullName;
    private String code;
    private String idTeam;
    private String country;

}
