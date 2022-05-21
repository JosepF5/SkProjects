package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.sale.commands.CreateSale;
import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.challengeDDD.usecase.CreateSaleUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateSaleUseCaseTest {
    @Test
    void createSaleWithAllTheParameters() {
        //Arrange
        var command = new CreateSale(
                SaleID.of("sale001"),
                new Payment(123456)
        );
        var useCase = new CreateSaleUseCase();
        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating sale"))
                .getDomainEvents();
        //Assert
        var event = (SaleCreated) events.get(0);
        Assertions.assertEquals(command.getPayment().value(),event.getPayment().value());
    }
}
