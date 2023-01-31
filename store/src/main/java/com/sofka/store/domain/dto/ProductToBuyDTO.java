package com.sofka.store.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductToBuyDTO {
    @NotBlank
    private String idProduct;
    @NotBlank
    private String quantity;
}