package co.com.sofka.challengeDDD.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.challengeDDD.domain.food.Food;
import co.com.sofka.challengeDDD.domain.food.commands.UpdateAppetizerName;

public class UpdateAppetizerNameUseCase extends UseCase<RequestCommand<UpdateAppetizerName>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateAppetizerName> updateAppetizerNameRequestCommand) {
        var command = updateAppetizerNameRequestCommand.getCommand();
        var food = Food.from(command.getFoodID(),repository().getEventsBy(command.getFoodID().value()));
        food.updateAppetizerName(command.getAppetizerID(),command.getName());
        emit().onResponse(new ResponseEvents(food.getUncommittedChanges()));
    }
}
