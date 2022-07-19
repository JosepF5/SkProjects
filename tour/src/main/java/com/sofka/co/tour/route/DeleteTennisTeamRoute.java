package com.sofka.co.tour.route;

import com.sofka.co.tour.usecase.DeleteTennisTeamUseCase;
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
public class DeleteTennisTeamRoute {
    @Bean
    public RouterFunction<ServerResponse> deleteTennisTeam(DeleteTennisTeamUseCase deleteTennisTeamUseCase){
        return route(DELETE("/delete/tennisTeam/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request -> deleteTennisTeamUseCase.deleteTennisTeam(request.pathVariable("id"))
                        .flatMap((p)-> ServerResponse.status(HttpStatus.ACCEPTED).build())
                        .onErrorResume(e -> ServerResponse.status(HttpStatus.NOT_FOUND).build()));
    }
}
