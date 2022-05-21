package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.sale.Sale;
import co.com.sofka.challengeDDD.domain.sale.commands.AddClient;

public class AddClientUseCase extends UseCase<RequestCommand<AddClient>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddClient> createSaleRequestCommand) {
        var command=createSaleRequestCommand.getCommand();
        var sale= Sale.from(command.getSaleID(),retrieveEvents(command.getSaleID().value()));
        sale.addClient(command.getClientID(),
                command.getName(),
                command.getStatus());
        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
