package com.sofka.co.tour.route;

import com.sofka.co.tour.dto.BikerDTO;
import com.sofka.co.tour.usecase.GetBikersByCountryUseCase;
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
public class GetBikersByCountryRoute {
    @Bean
    public RouterFunction<ServerResponse> getBikersByCountry(GetBikersByCountryUseCase getBikersByCountryUseCase) {
        return route(GET("/get/bikers/country/{country}"), request -> ServerResponse.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(getBikersByCountryUseCase.getBikersByCountry(request.pathVariable("country")), BikerDTO.class))
        );
    }
}
