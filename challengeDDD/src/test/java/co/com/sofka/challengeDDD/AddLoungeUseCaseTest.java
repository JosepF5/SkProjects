package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.challengeDDD.domain.sale.commands.AddLounge;
import co.com.sofka.challengeDDD.domain.sale.events.LoungeAdded;
import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.challengeDDD.domain.sale.values.LoungeID;
import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.challengeDDD.domain.sale.values.Status;
import co.com.sofka.challengeDDD.usecase.AddLoungeUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AddLoungeUseCaseTest {
    private final String ROOTID="sale001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void addLounge(){
        var command=new AddLounge(SaleID.of(ROOTID),
                LoungeID.of("lounge001"),
                new AmountOfSeats(100),
                new Effects("3D"));

        var useCase=new AddLoungeUseCase();

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
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while creating a lounge"))
                .getDomainEvents();

        var event=(LoungeAdded)events.get(0);
        Assertions.assertEquals(command.getAmountOfSeats().value(),event.getAmountOfSeats().value());
        Assertions.assertEquals(command.getEffects().value(),event.getEffects().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
