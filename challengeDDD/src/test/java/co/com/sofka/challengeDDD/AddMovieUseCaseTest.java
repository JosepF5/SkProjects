package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.challengeDDD.domain.sale.commands.AddMovie;
import co.com.sofka.challengeDDD.domain.sale.events.MovieAdded;
import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.challengeDDD.domain.sale.values.MovieID;
import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.challengeDDD.usecase.AddMovieUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AddMovieUseCaseTest {
    private final String ROOTID="sale001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void addMovie(){
        var command=new AddMovie(SaleID.of(ROOTID),
                MovieID.of("movie001"),
                new Name("The Thing"),
                new Classification("B"));

        var useCase=new AddMovieUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new SaleCreated(
                        new Payment(654321)
                )
        ));

        useCase.addRepository(repository);
        var events= UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while creating a movie"))
                .getDomainEvents();

        var event=(MovieAdded)events.get(0);
        Assertions.assertEquals(command.getName().value(),event.getName().value());
        Assertions.assertEquals(command.getClassification().value(),event.getClassification().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
