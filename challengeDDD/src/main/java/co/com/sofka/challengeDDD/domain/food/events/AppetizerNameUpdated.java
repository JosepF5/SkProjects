package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class AppetizerNameUpdated extends DomainEvent {
    private final AppetizerID appetizerID;
    private final Name name;

    public AppetizerNameUpdated(AppetizerID appetizerID, Name name) {
        super("com.food.AppetizerNameUpdated");
        this.appetizerID = appetizerID;
        this.name = name;
    }

    public AppetizerID getAppetizerID() {
        return appetizerID;
    }

    public Name getName() {
        return name;
    }
}
