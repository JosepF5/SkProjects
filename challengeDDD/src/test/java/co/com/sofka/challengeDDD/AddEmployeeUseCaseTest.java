package co.com.sofka.challengeDDD;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.challengeDDD.domain.sale.commands.AddEmployee;
import co.com.sofka.challengeDDD.domain.sale.events.EmployeeAdded;
import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.challengeDDD.domain.sale.values.EmployeeID;
import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.challengeDDD.domain.sale.values.Status;
import co.com.sofka.challengeDDD.usecase.AddEmployeeUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AddEmployeeUseCaseTest {
    private final String ROOTID="sale001";

    @Mock
    private DomainEventRepository repository;

    @Test
    void addEmployee(){
        var command=new AddEmployee(SaleID.of(ROOTID),
                EmployeeID.of("employee001"),
                new Name("Fabian"),
                new Hierarchy("Administrator"));

        var useCase=new AddEmployeeUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new SaleCreated(
                        new Payment(123456)
                )
        ));

        useCase.addRepository(repository);
        var events= UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while creating a employee"))
                .getDomainEvents();

        var event=(EmployeeAdded)events.get(0);
        Assertions.assertEquals(command.getName().value(),event.getName().value());
        Assertions.assertEquals(command.getHierarchy().value(),event.getHierarchy().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }
}
