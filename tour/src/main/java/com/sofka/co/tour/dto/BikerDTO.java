package com.sofka.co.tour.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BikerDTO {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String id;

    @NotBlank
    @Length(max = 50, message = "Full name must be less than 50 words")
    @Schema(maxLength = 50)
    private String fullName;

    @NotNull
    @Digits(integer = 3, fraction = 0, message = "Biker code must be less than 4 digits")
    @Schema(format = "int" , maximum = "999", defaultValue = "0")
    private Integer code;
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String idTeam;

    @NotBlank
    @Length(max = 25, message = "Country name must be less than 25 words")
    @Schema(maxLength = 25)
    private String country;

}
