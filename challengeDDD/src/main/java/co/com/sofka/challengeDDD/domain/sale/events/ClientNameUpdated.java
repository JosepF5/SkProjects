package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.ClientID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class ClientNameUpdated extends DomainEvent {
    private final ClientID clientID;
    private final Name name;

    public ClientNameUpdated(ClientID clientID, Name name) {
        super("com.sale.nameupdated");
        this.clientID = clientID;
        this.name = name;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public Name getName() {
        return name;
    }

}
