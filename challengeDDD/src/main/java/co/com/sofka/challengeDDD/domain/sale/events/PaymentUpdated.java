package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.Payment;
import co.com.sofka.domain.generic.DomainEvent;

public class PaymentUpdated extends DomainEvent {
    private final Payment payment;

    public PaymentUpdated(Payment payment) {
        super("com.sale.paymentupdated");
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
