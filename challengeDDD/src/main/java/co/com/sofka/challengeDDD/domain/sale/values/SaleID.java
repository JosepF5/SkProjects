package co.com.sofka.challengeDDD.domain.sale.values;

import co.com.sofka.domain.generic.Identity;

public class SaleID extends Identity {
    public SaleID() {
    }

    private SaleID(String uuid) {
        super(uuid);
    }

    public static SaleID of(String id){
        return new SaleID(id);
    }
}
