package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.sale.Sale;
import co.com.sofka.challengeDDD.domain.sale.commands.ChangeMovieClassification;

public class ChangeMovieClassificationUseCase extends UseCase<RequestCommand<ChangeMovieClassification>,ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<ChangeMovieClassification> changeMovieClassificationRequestCommand) {
        var command = changeMovieClassificationRequestCommand.getCommand();
        var sale = Sale.from(command.getSaleID(),repository().getEventsBy(command.getSaleID().value()));

        sale.changeMovieClassification(command.getMovieID(),command.getClassification());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
