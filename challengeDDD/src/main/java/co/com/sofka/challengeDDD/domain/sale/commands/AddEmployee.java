package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.EmployeeID;
import co.com.sofka.challengeDDD.domain.sale.values.Hierarchy;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class AddEmployee extends Command {
    private final SaleID saleID;
    private final EmployeeID employeeID;
    private final Name name;
    private final Hierarchy hierarchy;

    public AddEmployee(SaleID saleID, EmployeeID employeeID, Name name, Hierarchy hierarchy) {
        this.saleID = saleID;
        this.employeeID = employeeID;
        this.name = name;
        this.hierarchy = hierarchy;
    }

    public SaleID getSaleID() {
        return saleID;
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
