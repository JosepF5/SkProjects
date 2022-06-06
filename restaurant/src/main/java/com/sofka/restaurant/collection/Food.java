package com.sofka.restaurant.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "food")
public class Food {
    @Id
    private String id;
    private String name;
    private Integer minPreparation;
}
