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
import reactor.core.publisher.Mono;

import java.util.function.Function;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateBikerRoute {
    @Bean
    public RouterFunction<ServerResponse> createBiker(CreateBikerUseCase createBikerUseCase) {
        Function<BikerDTO, Mono<ServerResponse>> executor = bikerDTO -> createBikerUseCase.createBiker(bikerDTO)
                .flatMap(result -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result))
                .onErrorResume(e -> ServerResponse.badRequest()
                        .contentType(MediaType.TEXT_PLAIN)
                        .bodyValue(String.format(
                                "Biker %s already exists.", bikerDTO.getCode()
                        )));
        System.out.println("executor"+executor);
        return route(POST("/create/biker").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(BikerDTO.class).flatMap(executor)
                        .onErrorResume(throwable -> ServerResponse.badRequest()
                                .contentType(MediaType.TEXT_PLAIN)
                                .bodyValue("Error: " + throwable.getMessage()))
        );
    }
}
