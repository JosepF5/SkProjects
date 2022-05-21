package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.DessertID;
import co.com.sofka.challengeDDD.domain.food.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class DessertNameUpdated extends DomainEvent {
    private final DessertID dessertID;
    private final Name name;

    public DessertNameUpdated(DessertID dessertID, Name name) {
        super("com.food.DessertNameUpdated");
        this.dessertID = dessertID;
        this.name = name;
    }


    public DessertID getDessertID() {
        return dessertID;
    }

    public Name getName() {
        return name;
    }

}
