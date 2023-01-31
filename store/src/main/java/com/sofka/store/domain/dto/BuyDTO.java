package com.sofka.store.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import com.sofka.store.domain.collections.ProductToBuy;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.List;

@Data
public class BuyDTO {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private String id;
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Date date;
    @NotBlank
    private String idType;
    @NotBlank
    @Length(max = 25, message = "Country name must be less than 25 words")
    @Schema(maxLength = 25)
    private String clientName;
    @NotBlank
    private List<ProductToBuy> products;
}
