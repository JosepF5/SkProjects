package com.sofka.restaurant.mapper;

import com.sofka.restaurant.collection.Food;
import com.sofka.restaurant.dto.FoodDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.config.EnableWebFlux;

@Component
@EnableWebFlux
public class FoodMapper {
    private final ModelMapper mapper;

    public FoodMapper(ModelMapper mapper){
        this.mapper=mapper;
    }

    public FoodDTO toFoodDTO(Food food){
        return mapper.map(food,FoodDTO.class);
    }

    public Food toFoodEntity(FoodDTO foodDTO){
        return mapper.map(foodDTO,Food.class);
    }
}
