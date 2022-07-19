package com.sofka.co.tour.route;

import com.sofka.co.tour.dto.TennisTeamDTO;
import com.sofka.co.tour.usecase.UpdateTennisTeamUseCase;
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
import org.springframework.context.annotation.Configuration;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class UpdateTennisTeamRoute {
    RouterFunction<ServerResponse> updateTennisTeam(UpdateTennisTeamUseCase updateTennisTeamUseCase){
        return route(PUT("/update/tennisTeam/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(TennisTeamDTO.class)
                        .flatMap(tennisTeamDTO -> updateTennisTeamUseCase.updateTennisTeam(request.pathVariable("id"),tennisTeamDTO))
                        .flatMap(result -> result.getId()!=null
                                ? ServerResponse.status(HttpStatus.CREATED)
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(result)
                                : ServerResponse.status(HttpStatus.NOT_FOUND)
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(result)));
    }
}
