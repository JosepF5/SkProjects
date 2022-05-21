package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.food.Food;
import co.com.sofka.challengeDDD.domain.food.commands.AddAppetizer;
import co.com.sofka.challengeDDD.domain.food.commands.AddDessert;
import co.com.sofka.challengeDDD.domain.food.commands.CreateFood;

public class AddDessertUseCase extends UseCase<RequestCommand<AddDessert>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddDessert> createSaleRequestCommand) {
        var command=createSaleRequestCommand.getCommand();
        var food= Food.from(command.getFoodID(),retrieveEvents(command.getFoodID().value()));
        food.addDessert(command.getDessertID(),
                command.getName(),
                command.getPrice(),
                command.getTaste());
        emit().onResponse(new ResponseEvents(food.getUncommittedChanges()));
    }
}
