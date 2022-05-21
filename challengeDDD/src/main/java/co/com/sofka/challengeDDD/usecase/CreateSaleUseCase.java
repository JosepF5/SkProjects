package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.sale.Sale;
import co.com.sofka.challengeDDD.domain.sale.commands.CreateSale;

public class CreateSaleUseCase extends UseCase<RequestCommand<CreateSale>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateSale> createSaleRequestCommand) {
        var command=createSaleRequestCommand.getCommand();
        var sale=new Sale(
                command.getSaleID(),
                command.getPayment()
        );
        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
