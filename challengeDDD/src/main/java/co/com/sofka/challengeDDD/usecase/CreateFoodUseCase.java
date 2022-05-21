package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.food.Food;
import co.com.sofka.challengeDDD.domain.food.commands.CreateFood;

public class CreateFoodUseCase extends UseCase<RequestCommand<CreateFood>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<CreateFood> createSaleRequestCommand) {
        var command=createSaleRequestCommand.getCommand();
        var food=new Food(
                command.getFoodID(),
                command.getPayment()
        );
        emit().onResponse(new ResponseEvents(food.getUncommittedChanges()));
    }
}
