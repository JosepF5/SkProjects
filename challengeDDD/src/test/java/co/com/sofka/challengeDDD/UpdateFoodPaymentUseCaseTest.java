package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.food.commands.UpdatePayment;
import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.challengeDDD.domain.food.values.Payment;
import co.com.sofka.challengeDDD.domain.food.events.PaymentUpdated;
import co.com.sofka.challengeDDD.usecase.UpdateFoodPaymentUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.List;

public class UpdateFoodPaymentUseCaseTest {
    private final String ROOTID = "food001";
    private UpdateFoodPaymentUseCase updateFoodPaymentUseCase;
    private DomainEventRepository repository;

    @BeforeEach
    public void setUp(){
        updateFoodPaymentUseCase= new UpdateFoodPaymentUseCase();
        repository = Mockito.mock(DomainEventRepository.class);
        updateFoodPaymentUseCase.addRepository(repository);
    }
    @Test
    void updateFoodPayment(){
        var command = new UpdatePayment(FoodID.of(ROOTID),new Payment(123456));

        Mockito.when(repository.getEventsBy(ArgumentMatchers.any())).thenReturn(List.of(
                new PaymentUpdated(new Payment(987654))));

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(updateFoodPaymentUseCase,new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        PaymentUpdated updateFoodPaymentUseCase = (PaymentUpdated) events.get(0);
        Assertions.assertEquals(command.getPayment().value(),updateFoodPaymentUseCase.getPayment().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
