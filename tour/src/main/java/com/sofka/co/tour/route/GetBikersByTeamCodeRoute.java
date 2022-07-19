package com.sofka.co.tour.route;

import com.sofka.co.tour.dto.BikerDTO;
import com.sofka.co.tour.usecase.GetBikersByTeamCodeUseCase;
import com.sofka.co.tour.usecase.GetBikersUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class GetBikersByTeamCodeRoute {
    @Bean
    public RouterFunction<ServerResponse> getBikersByTeamCode(GetBikersByTeamCodeUseCase getBikersByTeamCodeUseCase) {
        return route(GET("/get/bikers/team/{teamCode}"), request -> ServerResponse.status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(getBikersByTeamCodeUseCase.getBikersByTeamCode(request.pathVariable("teamCode")), BikerDTO.class))
        );
    }
}
