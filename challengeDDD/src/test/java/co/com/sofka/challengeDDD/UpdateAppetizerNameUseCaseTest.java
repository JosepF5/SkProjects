package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.food.commands.UpdateAppetizerName;
import co.com.sofka.challengeDDD.domain.food.events.AppetizerNameUpdated;
import co.com.sofka.challengeDDD.domain.food.events.FoodCreated;
import co.com.sofka.challengeDDD.domain.food.values.AppetizerID;
import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.challengeDDD.domain.food.values.Name;
import co.com.sofka.challengeDDD.domain.food.values.Payment;
import co.com.sofka.challengeDDD.usecase.ChangeMovieClassificationUseCase;
import co.com.sofka.challengeDDD.usecase.UpdateAppetizerNameUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UpdateAppetizerNameUseCaseTest {
    private final String ROOTID="food001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void updateAppetizerName(){
        var command=new UpdateAppetizerName(FoodID.of(ROOTID),
                AppetizerID.of("appetizer001"),
                new Name("Napoleon"));

        var useCase=new UpdateAppetizerNameUseCase();

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
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while updating the name's appetizer"))
                .getDomainEvents();

        var event=(AppetizerNameUpdated)events.get(0);
        Assertions.assertEquals(command.getName().value(),event.getName().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
