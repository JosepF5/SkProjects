package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.challengeDDD.domain.sale.commands.AddMovie;
import co.com.sofka.challengeDDD.domain.sale.commands.ChangeMovieClassification;
import co.com.sofka.challengeDDD.domain.sale.events.MovieAdded;
import co.com.sofka.challengeDDD.domain.sale.events.MovieClassificationChanged;
import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.challengeDDD.usecase.AddMovieUseCase;
import co.com.sofka.challengeDDD.usecase.ChangeMovieClassificationUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ChangeMovieClassificationUseCaseTest {
    private final String ROOTID="sale001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void changeMovieClassification(){
        var command=new ChangeMovieClassification(SaleID.of(ROOTID),
                MovieID.of("movie001"),
                new Classification("A"));

        var useCase=new ChangeMovieClassificationUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new SaleCreated(
                        new Payment(123456)
                )
        ));

        useCase.addRepository(repository);
        var events= UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while updating the classification's movie"))
                .getDomainEvents();

        var event=(MovieClassificationChanged)events.get(0);
        Assertions.assertEquals(command.getClassification().value(),event.getClassification().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}

