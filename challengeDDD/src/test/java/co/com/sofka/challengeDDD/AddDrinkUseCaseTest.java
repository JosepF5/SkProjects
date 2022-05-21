package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.food.commands.AddDrink;
import co.com.sofka.challengeDDD.domain.food.events.DrinkAdded;
import co.com.sofka.challengeDDD.domain.food.events.FoodCreated;
import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.challengeDDD.usecase.AddDrinkUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AddDrinkUseCaseTest {
    private final String ROOTID="food001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void addDrink(){
        var command=new AddDrink(FoodID.of(ROOTID),
                DrinkID.of("appetizer001"),
                new Name("Coca Cola"),
                new Price(123),
                new Size("Small"));

        var useCase=new AddDrinkUseCase();

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
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while creating a drink"))
                .getDomainEvents();

        var event=(DrinkAdded)events.get(0);
        Assertions.assertEquals(command.getName().value(),event.getName().value());
        Assertions.assertEquals(command.getPrice().value(),event.getPrice().value());
        Assertions.assertEquals(command.getSize().value(),event.getSize().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
