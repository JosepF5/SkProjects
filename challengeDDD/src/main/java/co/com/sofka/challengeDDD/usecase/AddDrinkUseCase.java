package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.food.Food;
import co.com.sofka.challengeDDD.domain.food.commands.AddAppetizer;
import co.com.sofka.challengeDDD.domain.food.commands.AddDrink;
import co.com.sofka.challengeDDD.domain.food.commands.CreateFood;

public class AddDrinkUseCase extends UseCase<RequestCommand<AddDrink>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<AddDrink> createSaleRequestCommand) {
        var command=createSaleRequestCommand.getCommand();
        var food= Food.from(command.getFoodID(),retrieveEvents(command.getFoodID().value()));
        food.addDrink(command.getDrinkID(),
                command.getName(),
                command.getPrice(),
                command.getSize());
        emit().onResponse(new ResponseEvents(food.getUncommittedChanges()));
    }
}
