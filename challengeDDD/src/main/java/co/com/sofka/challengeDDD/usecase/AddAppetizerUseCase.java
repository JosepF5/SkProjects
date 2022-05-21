package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.food.Food;
import co.com.sofka.challengeDDD.domain.food.commands.AddAppetizer;

public class AddAppetizerUseCase extends UseCase<RequestCommand<AddAppetizer>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddAppetizer> createSaleRequestCommand) {
        var command=createSaleRequestCommand.getCommand();
        var food=Food.from(command.getFoodID(),retrieveEvents(command.getFoodID().value()));
        food.addAppetizer(command.getAppetizerID(),
                command.getName(),
                command.getPrice(),
                command.getTexture());
        emit().onResponse(new ResponseEvents(food.getUncommittedChanges()));
    }
}
