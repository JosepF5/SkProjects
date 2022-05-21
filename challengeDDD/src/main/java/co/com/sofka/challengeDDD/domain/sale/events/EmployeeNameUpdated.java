package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.EmployeeID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeNameUpdated extends DomainEvent {
    private final EmployeeID employeeID;
    private final Name name;

    public EmployeeNameUpdated(EmployeeID employeeID, Name name) {
        super("com.sale.employeenameupdated");
        this.employeeID = employeeID;
        this.name = name;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public Name getName() {
        return name;
    }

}
