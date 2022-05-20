package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.*;

public class DrinkAdded extends DomainEvent {
    private final DrinkID drinkID;
    private final Name name;
    private final Size size;

    public DrinkAdded(DrinkID drinkID, Name name, Size size) {
        super("joseppalomino.food.drinkadded");
        this.drinkID = drinkID;
        this.name = name;
        this.size = size;
    }

    public DrinkID getDrinkID() {
        return drinkID;
    }

    public Name getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }
}
