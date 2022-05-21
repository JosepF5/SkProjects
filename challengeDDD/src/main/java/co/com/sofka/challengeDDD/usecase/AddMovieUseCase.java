package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.food.Food;
import co.com.sofka.challengeDDD.domain.food.commands.AddAppetizer;
import co.com.sofka.challengeDDD.domain.food.commands.CreateFood;
import co.com.sofka.challengeDDD.domain.sale.Sale;
import co.com.sofka.challengeDDD.domain.sale.commands.AddClient;
import co.com.sofka.challengeDDD.domain.sale.commands.AddMovie;

public class AddMovieUseCase extends UseCase<RequestCommand<AddMovie>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<AddMovie> createSaleRequestCommand) {
        var command=createSaleRequestCommand.getCommand();
        var sale= Sale.from(command.getSaleID(),retrieveEvents(command.getSaleID().value()));
        sale.addMovie(command.getMovieID(),
                command.getName(),
                command.getClassification());
        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
