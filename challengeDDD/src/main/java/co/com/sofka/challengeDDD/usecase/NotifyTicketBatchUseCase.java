package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.challengeDDD.domain.sale.Sale;
import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;

public class NotifyTicketBatchUseCase extends UseCase<TriggeredEvent<SaleCreated>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<SaleCreated> saleCreatedTriggeredEvent){
        var event=saleCreatedTriggeredEvent.getDomainEvent();
        var sale= Sale.from(SaleID.of(event.aggregateRootId()),this.retrieveEvents());
        sale.notifyTicketBatch("The sale has been done, update the stock of the batch");

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
