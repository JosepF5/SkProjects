package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.challengeDDD.domain.sale.events.TicketBatchNotificationSent;
import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.challengeDDD.usecase.NotifyTicketBatchUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class NotifyTicketBatchUseCaseTest {
    private final String ROOTID="sale001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void notifyTicketBatch() {
        var event= new SaleCreated(
                new Payment(123456)
        );
        event.setAggregateRootId(ROOTID);
        var useCase=new NotifyTicketBatchUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                event
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        var message=(TicketBatchNotificationSent)events.get(0);
        Assertions.assertEquals("The sale has been done, update the stock of the batch",message.getMessage());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
