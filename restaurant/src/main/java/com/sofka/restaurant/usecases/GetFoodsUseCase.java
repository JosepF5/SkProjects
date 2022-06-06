package com.sofka.restaurant.usecases;

import com.sofka.restaurant.dto.FoodDTO;
import com.sofka.restaurant.mapper.FoodMapper;
import com.sofka.restaurant.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class GetFoodsUseCase {
    private final FoodRepository foodRepository;
    private final FoodMapper foodMapper;

    public Flux<FoodDTO> getAllFoods(){
        return foodRepository.findAll().map(foodMapper::toFoodDTO);
    }
}
