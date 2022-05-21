package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.sale.Sale;
import co.com.sofka.challengeDDD.domain.sale.commands.AddEmployee;

public class AddEmployeeUseCase  extends UseCase<RequestCommand<AddEmployee>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<AddEmployee> createSaleRequestCommand) {
        var command=createSaleRequestCommand.getCommand();
        var sale= Sale.from(command.getSaleID(),retrieveEvents(command.getSaleID().value()));
        sale.addEmployee(command.getEmployeeID(),
                command.getName(),
                command.getHierarchy());
        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
