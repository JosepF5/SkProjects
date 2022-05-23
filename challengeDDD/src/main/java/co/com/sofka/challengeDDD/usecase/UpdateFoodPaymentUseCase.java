package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.food.Food;
import co.com.sofka.challengeDDD.domain.food.commands.UpdatePayment;

public class UpdateFoodPaymentUseCase extends UseCase<RequestCommand<UpdatePayment>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdatePayment> updateFoodPaymentRequestCommand){
        var command = updateFoodPaymentRequestCommand.getCommand();
        var food = Food.from(command.getFoodID(),retrieveEvents(command.getFoodID().value()));
        food.updatePayment(command.getPayment());

        emit().onResponse(new ResponseEvents(food.getUncommittedChanges()));
    }
}
