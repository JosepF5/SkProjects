package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.sale.commands.ChangeClientStatus;
import co.com.sofka.challengeDDD.domain.sale.commands.ChangeMovieClassification;
import co.com.sofka.challengeDDD.domain.sale.events.ClientStatusChanged;
import co.com.sofka.challengeDDD.domain.sale.events.MovieClassificationChanged;
import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.challengeDDD.usecase.ChangeClientStatusUseCase;
import co.com.sofka.challengeDDD.usecase.ChangeMovieClassificationUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ChangeClientStatusUseCaseTest {
    private final String ROOTID="sale001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void changeClientStatus(){
        var command=new ChangeClientStatus(SaleID.of(ROOTID),
                ClientID.of("client001"),
                new Status("VIP"));

        var useCase=new ChangeClientStatusUseCase();

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
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while updating the status's client"))
                .getDomainEvents();

        var event=(ClientStatusChanged)events.get(0);
        Assertions.assertEquals(command.getStatus().value(),event.getStatus().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
