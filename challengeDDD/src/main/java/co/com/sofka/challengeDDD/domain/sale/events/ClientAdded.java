package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.ClientID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.challengeDDD.domain.sale.values.Status;
import co.com.sofka.domain.generic.DomainEvent;

public class ClientAdded extends DomainEvent {
    private final ClientID clientID;
    private final Name name;
    private final Status status;

    public ClientAdded(ClientID clientID, Name name, Status status) {
        super("com.sale.clientadded");
        this.clientID = clientID;
        this.name = name;
        this.status = status;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public Name getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }
}
