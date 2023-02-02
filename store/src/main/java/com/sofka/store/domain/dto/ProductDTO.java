package com.sofka.store.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ProductDTO {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String id;
    @NotNull
    private String name;
    @NotNull
    private Long inInventory;
    @NotNull
    private Boolean                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              enabled;
    @NotNull
    private Long min;
    @NotNull
    private Long max;
}
