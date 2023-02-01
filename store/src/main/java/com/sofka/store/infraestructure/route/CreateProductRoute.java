package com.sofka.store.infraestructure.route;

import com.sofka.store.application.usecase.CreateProductUseCase;
import com.sofka.store.domain.dto.ProductDTO;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.function.Function;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateProductRoute {
    public RouterFunction<ServerResponse> createProduct(CreateProductUseCase createProductUseCase){
        Function<ProductDTO, Mono<ServerResponse>> executor = productDTO -> createProductUseCase.createProduct(productDTO)
                .flatMap(result-> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result))
                .onErrorResume(e -> ServerResponse.badRequest()
                        .contentType(MediaType.TEXT_PLAIN)
                        .bodyValue(String.format(
                                "Product %s already exists.", productDTO.getId()
                        )));
        return route(POST("/create/product").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(ProductDTO.class).flatMap(executor)
                        .onErrorResume(throwable -> ServerResponse.badRequest()
                                .contentType(MediaType.TEXT_PLAIN)
                                .bodyValue("Error: " + throwable.getMessage()))
        );
    }
}
