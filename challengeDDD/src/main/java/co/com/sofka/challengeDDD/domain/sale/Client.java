package co.com.sofka.challengeDDD.domain.sale;

import co.com.sofka.challengeDDD.domain.sale.values.Classification;
import co.com.sofka.challengeDDD.domain.sale.values.ClientID;
import co.com.sofka.challengeDDD.domain.sale.values.Name;
import co.com.sofka.challengeDDD.domain.sale.values.Status;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Client extends Entity<ClientID> {
    private Name name;
    private Status status;

    public Client(ClientID entityId, Name name, Status status) {
        super(entityId);
        this.name = name;
        this.status = status;
    }

    public void updateName(Name name) {
        this.name= Objects.requireNonNull(name);
    }

    public void updateStatus(Status status) {
        this.status= Objects.requireNonNull(status);
    }

    public Name name() {
        return name;
    }

    public Status status() {
        return status;
    }
}
