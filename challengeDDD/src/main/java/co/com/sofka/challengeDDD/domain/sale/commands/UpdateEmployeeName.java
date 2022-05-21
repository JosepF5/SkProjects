package co.com.sofka.challengeDDD.domain.sale.commands;

import co.com.sofka.challengeDDD.domain.sale.values.EmployeeID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.challengeDDD.domain.sale.values.SaleID;
import co.com.sofka.domain.generic.Command;

public class UpdateEmployeeName extends Command {
    private final SaleID saleID;
    private final EmployeeID employeeID;
    private final Name name;

    public UpdateEmployeeName(SaleID saleID, EmployeeID employeeID, Name name) {
        this.saleID = saleID;
        this.employeeID = employeeID;
        this.name = name;
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

}
