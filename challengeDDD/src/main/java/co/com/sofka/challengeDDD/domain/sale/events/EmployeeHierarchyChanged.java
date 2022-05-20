package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.EmployeeID;
import co.com.sofka.challengeDDD.domain.sale.values.Hierarchy;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeHierarchyChanged extends DomainEvent {
    private final EmployeeID employeeID;
    private final Hierarchy hierarchy;

    public EmployeeHierarchyChanged(EmployeeID employeeID, Hierarchy hierarchy) {
        super("com.sale.employeehierarchychanged");
        this.employeeID = employeeID;
        this.hierarchy = hierarchy;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public Hierarchy getHierarchy() {
        return hierarchy;
    }
}
