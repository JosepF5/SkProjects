package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.Payment;
import co.com.sofka.domain.generic.DomainEvent;

public class PaymentUpdated extends DomainEvent {
    private final Payment payment;

    public PaymentUpdated(Payment payment) {
        super("com.food.PaymentUpdated");
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
