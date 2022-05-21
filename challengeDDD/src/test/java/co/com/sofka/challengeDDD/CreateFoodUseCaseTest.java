package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.food.commands.CreateFood;
import co.com.sofka.challengeDDD.domain.food.events.FoodCreated;
import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.challengeDDD.domain.food.values.Payment;
import co.com.sofka.challengeDDD.usecase.CreateFoodUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateFoodUseCaseTest {
    @Test
    void createFoodWithAllTheParameters() {
        //Arrange
        var command = new CreateFood(
                FoodID.of("food001"),
                new Payment(654321)
        );
        var useCase = new CreateFoodUseCase();
        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating food"))
                .getDomainEvents();
        //Assert
        var event = (FoodCreated) events.get(0);
        Assertions.assertEquals(command.getPayment().value(),event.getPayment().value());
    }
}
