package co.com.sofka.challengeDDD.domain.sale;

import co.com.sofka.challengeDDD.domain.sale.events.SaleCreated;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class SaleChange extends EventChange {
    public SaleChange(Sale sale) {
        apply((SaleCreated event)->{
            sale.payment= event.getPayment();
            sale.clients=new HashSet<>();
            sale.employees=new HashSet<>();
            sale.movies=new HashSet<>();
            sale.lounges=new HashSet<>();
        });
    }
}
