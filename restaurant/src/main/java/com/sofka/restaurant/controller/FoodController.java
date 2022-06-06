package com.sofka.restaurant.controller;

import com.mongodb.internal.connection.Server;
import com.sofka.restaurant.dto.FoodDTO;
import com.sofka.restaurant.usecases.CreateFoodUseCase;
import com.sofka.restaurant.usecases.GetFoodsUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import javax.print.attribute.standard.Media;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FoodController {
    @Bean
    public RouterFunction<ServerResponse> getAllFoods(GetFoodsUseCase foodsUseCase) {
        return route(GET("/foods"),
                request -> ServerResponse.status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromProducer(foodsUseCase.getAllFoods(), FoodDTO.class))
        );
    }

    @Bean
    public RouterFunction<ServerResponse> createFood(CreateFoodUseCase createFoodUseCase) {
        return route(GET("/create").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(FoodDTO.class)
                        .flatMap(createFoodUseCase::createFood)
                        .flatMap(foodDTO -> ServerResponse.status(HttpStatus.CREATED)
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(foodDTO))
                        .onErrorResume(e-> ServerResponse.status(HttpStatus.BAD_REQUEST).build()));

    }
}
