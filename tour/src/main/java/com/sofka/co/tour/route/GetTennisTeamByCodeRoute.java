package com.sofka.co.tour.route;

import com.sofka.co.tour.dto.TennisTeamDTO;
import com.sofka.co.tour.usecase.GetTennisTeamByCodeUseCase;
import com.sofka.co.tour.usecase.GetTennisTeamsUseCase;
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
public class GetTennisTeamByCodeRoute {
    @Bean
    public RouterFunction<ServerResponse> getCyclingTeamByTeamCode(GetTennisTeamByCodeUseCase getTennisTeamByCodeUseCase) {
        return route(GET("/get/tennisTeam/{teamCode}"), request -> ServerResponse.status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(getTennisTeamByCodeUseCase.getTennisTeamByCode(request.pathVariable("teamCode")), TennisTeamDTO.class))
        );
    }
}
