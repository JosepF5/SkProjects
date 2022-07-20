package com.sofka.co.tour.route;

import com.sofka.co.tour.dto.TennisTeamDTO;
import com.sofka.co.tour.usecase.GetTennisTeamsByCountryUseCase;
import com.sofka.co.tour.usecase.GetTennisTeamsUseCase;
import io.swagger.v3.oas.annotations.Operation;
import org.springdoc.core.annotations.RouterOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class GetTennisTeamsByCountryRoute {
    @Bean
    @RouterOperation(path = "/get/tennisTeams/country/{country}", produces = {
            MediaType.APPLICATION_JSON_VALUE},
            beanClass = GetTennisTeamsByCountryUseCase.class, method = RequestMethod.GET, beanMethod = "getEmployee",
            operation = @Operation(operationId = "getEmployee", responses = {
                    @ApiResponse(responseCode = "200", description = "successful operation",
                            content = @Content(schema = @Schema(implementation = Employee.class))),
                    @ApiResponse(responseCode = "400", description = "Invalid Employee details supplied")},
                    parameters = {@Parameter(in = ParameterIn.PATH, name = "employeeId")}
            ))
    public RouterFunction<ServerResponse> getTennisTeamsByCountry(GetTennisTeamsByCountryUseCase getTennisTeamsByCountryUseCase) {
        return route(GET("/get/tennisTeams/country/{country}"), request -> ServerResponse.status(HttpStatus.OK)
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(getTennisTeamsByCountryUseCase.getTennisTeamByCountry(request.pathVariable("country")), TennisTeamDTO.class))
        );
    }
}
