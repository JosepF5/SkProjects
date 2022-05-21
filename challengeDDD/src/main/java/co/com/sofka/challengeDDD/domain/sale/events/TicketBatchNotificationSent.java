package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.domain.generic.DomainEvent;

public class TicketBatchNotificationSent extends DomainEvent {
    private String message;

    public TicketBatchNotificationSent(String message) {
        super("com.sale.TicketBatchNotificationSent");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
