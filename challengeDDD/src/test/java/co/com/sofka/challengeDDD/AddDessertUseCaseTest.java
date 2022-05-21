package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.food.commands.AddDessert;
import co.com.sofka.challengeDDD.domain.food.commands.AddDessert;
import co.com.sofka.challengeDDD.domain.food.events.DessertAdded;
import co.com.sofka.challengeDDD.domain.food.events.FoodCreated;
import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.challengeDDD.usecase.AddDessertUseCase;
import co.com.sofka.challengeDDD.usecase.AddDessertUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AddDessertUseCaseTest {
    private final String ROOTID="food001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void addDessert(){
        var command=new AddDessert(FoodID.of(ROOTID),
                DessertID.of("dessert001"),
                new Name("Tiramisu"),
                new Price(321),
                new Taste("Chocolate"));

        var useCase=new AddDessertUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new FoodCreated(
                        new Payment(654321)
                )
        ));

        useCase.addRepository(repository);
        var events= UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while creating a dessert"))
                .getDomainEvents();

        var event=(DessertAdded)events.get(0);
        Assertions.assertEquals(command.getName().value(),event.getName().value());
        Assertions.assertEquals(command.getPrice().value(),event.getPrice().value());
        Assertions.assertEquals(command.getTaste().value(),event.getTaste().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
