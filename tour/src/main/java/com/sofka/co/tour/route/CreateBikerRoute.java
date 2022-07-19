package com.sofka.co.tour.route;

import com.sofka.co.tour.dto.BikerDTO;
import com.sofka.co.tour.usecase.CreateBikerUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateBikerRoute {
    public RouterFunction<ServerResponse> createBiker(CreateBikerUseCase createBikerUseCase){
        return route(POST("/create/biker").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(BikerDTO.class)
                        .flatMap(createBikerUseCase::createBiker)
                        .flatMap(bikerDTO -> ServerResponse.status(HttpStatus.CREATED)
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(bikerDTO))
                        .onErrorResume(e -> ServerResponse.status(HttpStatus.BAD_REQUEST).build()));
    }
}
