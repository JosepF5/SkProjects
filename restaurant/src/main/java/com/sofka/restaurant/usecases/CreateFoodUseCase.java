package com.sofka.restaurant.usecases;

import com.sofka.restaurant.dto.FoodDTO;
import com.sofka.restaurant.mapper.FoodMapper;
import com.sofka.restaurant.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreateFoodUseCase {
    private final FoodRepository foodRepository;
    private final FoodMapper foodMapper;

    public Mono<FoodDTO> createFood(FoodDTO foodDTO){
        return foodRepository.save(
                foodMapper.toFoodEntity(foodDTO))
                .map(foodMapper::toFoodDTO);
    }
}
