package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.EmployeeID;
import co.com.sofka.challengeDDD.domain.sale.values.Hierarchy;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class ChangeEmployeeHierarchy extends Command {
    private final SaleID saleID;
    private final EmployeeID employeeID;
    private final Hierarchy hierarchy;

    public ChangeEmployeeHierarchy(SaleID saleID, EmployeeID employeeID, Hierarchy hierarchy) {
        this.saleID = saleID;
        this.employeeID = employeeID;
        this.hierarchy = hierarchy;
    }

    public SaleID getSaleID() {
        return saleID;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public Hierarchy getHierarchy() {
        return hierarchy;
    }
}
