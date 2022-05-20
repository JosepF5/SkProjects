package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.Payment;
import co.com.sofka.domain.generic.DomainEvent;

public class FoodCreated extends DomainEvent {
    private final Payment payment;

    public FoodCreated(Payment payment) {
        super("com.food.FoodCreated");
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
