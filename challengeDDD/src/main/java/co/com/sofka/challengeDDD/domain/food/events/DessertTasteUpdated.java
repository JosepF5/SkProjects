package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class DessertTasteUpdated extends DomainEvent {
    private final DessertID dessertID;
    private final Taste taste;

    public DessertTasteUpdated(DessertID dessertID, Taste taste) {
        super("com.food.DessertTasteUpdated");
        this.dessertID = dessertID;
        this.taste = taste;
    }

    public Taste getTaste() {
        return taste;
    }

    public DessertID getDessertID() {
        return dessertID;
    }
}
