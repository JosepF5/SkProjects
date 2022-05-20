package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class DrinkNameUpdated extends DomainEvent {
    private final DrinkID drinkID;
    private final Name name;

    public DrinkNameUpdated(DrinkID drinkID, Name name) {
        super("com.food.DrinkNameUpdated");
        this.drinkID = drinkID;
        this.name = name;
    }

    public DrinkID getDrinkID() {
        return drinkID;
    }

    public Name getName() {
        return name;
    }
}
