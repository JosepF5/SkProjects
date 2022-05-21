package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.sale.Sale;
import co.com.sofka.challengeDDD.domain.sale.commands.ChangeClientStatus;

public class ChangeClientStatusUseCase extends UseCase<RequestCommand<ChangeClientStatus>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ChangeClientStatus> changeClientStatusRequestCommand) {
        var command = changeClientStatusRequestCommand.getCommand();
        var sale = Sale.from(command.getSaleID(),repository().getEventsBy(command.getSaleID().value()));

        sale.changeClientStatus(command.getClientID(),command.getStatus());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
