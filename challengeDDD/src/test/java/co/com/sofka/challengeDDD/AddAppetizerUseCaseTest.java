package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.food.commands.AddAppetizer;
import co.com.sofka.challengeDDD.domain.food.events.AppetizerAdded;
import co.com.sofka.challengeDDD.domain.food.events.FoodCreated;
import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.challengeDDD.usecase.AddAppetizerUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AddAppetizerUseCaseTest {

    private final String ROOTID="food001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void addAppetizer(){
        var command=new AddAppetizer(FoodID.of(ROOTID),
                AppetizerID.of("appetizer001"),
                new Name("Josep"),
                new Price(123),
                new Texture("Smooth"));

        var useCase=new AddAppetizerUseCase();

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
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while creating a appetizer"))
                .getDomainEvents();

        var event=(AppetizerAdded)events.get(0);
        Assertions.assertEquals(command.getName().value(),event.getName().value());
        Assertions.assertEquals(command.getPrice().value(),event.getPrice().value());
        Assertions.assertEquals(command.getTexture().value(),event.getTexture().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
