package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.sale.Sale;
import co.com.sofka.challengeDDD.domain.sale.commands.AddLounge;

public class AddLoungeUseCase extends UseCase<RequestCommand<AddLounge>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddLounge> createSaleRequestCommand) {
        var command=createSaleRequestCommand.getCommand();
        var sale= Sale.from(command.getSaleID(),retrieveEvents(command.getSaleID().value()));
        sale.addLounge(command.getLoungeID(),
                command.getAmountOfSeats(),
                command.getEffects());
        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
