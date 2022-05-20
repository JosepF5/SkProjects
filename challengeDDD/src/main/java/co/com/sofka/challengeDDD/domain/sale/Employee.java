package co.com.sofka.challengeDDD.domain.sale;

import co.com.sofka.challengeDDD.domain.sale.values.Classification;
import co.com.sofka.challengeDDD.domain.sale.values.EmployeeID;
import co.com.sofka.challengeDDD.domain.sale.values.Hierarchy;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Employee extends Entity<EmployeeID> {
    private Name name;
    private Hierarchy hierarchy;

    public Employee(EmployeeID entityId, Name name, Hierarchy hierarchy) {
        super(entityId);
        this.name = name;
        this.hierarchy = hierarchy;
    }

    public void updateName(Name name) {
        this.name= Objects.requireNonNull(name);
    }

    public void updateHierarchy(Hierarchy hierarchy) {
        this.hierarchy= Objects.requireNonNull(hierarchy);
    }

    public Name name() {
        return name;
    }

    public Hierarchy hierarchy() {
        return hierarchy;
    }
}
