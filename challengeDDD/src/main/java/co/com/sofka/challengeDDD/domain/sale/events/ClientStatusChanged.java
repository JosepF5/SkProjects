package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.ClientID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.challengeDDD.domain.sale.values.Status;
import co.com.sofka.domain.generic.DomainEvent;

public class ClientStatusChanged extends DomainEvent {
    private final ClientID clientID;
    private final Status status;

    public ClientStatusChanged(ClientID clientID, Status status) {
        super("com.sale.clientstatuschanged");
        this.clientID = clientID;
        this.status = status;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public Status getStatus() {
        return status;
    }
}
