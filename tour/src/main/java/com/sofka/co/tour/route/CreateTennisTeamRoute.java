package com.sofka.co.tour.route;

import com.sofka.co.tour.collections.TennisTeam;
import com.sofka.co.tour.dto.TennisTeamDTO;
import com.sofka.co.tour.usecase.CreateTennisTeamUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateTennisTeamRoute {
    @Bean
    @RouterOperation(path = "/create/tennisTeam", produces = {
            MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST, beanClass = CreateTennisTeamUseCase.class, beanMethod = "createTennisTeam",
            operation = @Operation(operationId = "createTennisTeam", responses = {
                    @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = TennisTeam.class))),
                    @ApiResponse(responseCode = "400", description = "Invalid TennisTeam details supplied")}
                    , requestBody = @RequestBody(content = @Content(schema = @Schema(implementation = TennisTeam.class)))
            ))
    public RouterFunction<ServerResponse> createTennisTeam(CreateTennisTeamUseCase createTennisTeamUseCase){
        return route(POST("/create/tennisTeam").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(TennisTeamDTO.class)
                        .flatMap(createTennisTeamUseCase::createTennisTeam)
                        .flatMap(tennisTeamDTO -> ServerResponse.status(HttpStatus.CREATED)
                                .contentType(MediaType.APPLICATION_JSON)
                                .bodyValue(tennisTeamDTO))
                        .onErrorResume(e -> ServerResponse.status(HttpStatus.BAD_REQUEST).build()));
    }
}
