package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.domain.generic.DomainEvent;

public class AccontingNotificationSent extends DomainEvent {
    private String message;

    public AccontingNotificationSent(String message) {
        super("com.sale.AccontingNotificationSent");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
