package co.com.sofka.challengeDDD.domain.sale.values;

import co.com.sofka.domain.generic.Identity;

public class EmployeeID extends Identity {
    public EmployeeID() {
    }

    private EmployeeID(String uuid) {
        super(uuid);
    }

    public static EmployeeID of(String id){
        return new EmployeeID(id);
    }
}
