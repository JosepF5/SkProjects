package com.sofka.store.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductDTO {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String id;
    @NotBlank
    private String name;
    @NotBlank
    private int inInventory;
    @NotBlank
    private boolean enabled;
    @NotBlank
    private int min;
    @NotBlank
    private int max;
}
