package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.domain.generic.DomainEvent;

public class SaleCreated extends DomainEvent {
    private final Payment payment;

    public SaleCreated(Payment payment) {
        super("com.sale.salecreated");
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
