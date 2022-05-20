package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeAdded extends DomainEvent {
    private final EmployeeID employeeID;
    private final Name name;
    private final Hierarchy hierarchy;

    public EmployeeAdded(EmployeeID employeeID, Name name, Hierarchy hierarchy) {
        super("com.sale.employeeadded");
        this.employeeID = employeeID;
        this.name = name;
        this.hierarchy = hierarchy;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public Name getName() {
        return name;
    }

    public Hierarchy getHierarchy() {
        return hierarchy;
    }
}
