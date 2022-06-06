package com.sofka.restaurant.repository;

import com.sofka.restaurant.collection.Food;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FoodRepository extends ReactiveMongoRepository<Food,String> {
}
