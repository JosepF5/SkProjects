package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.DrinkID;
import com.sofkaU.demoDDD.food.values.Name;
import com.sofkaU.demoDDD.food.values.Size;

public class DrinkNameUpdated extends DomainEvent {
    private final DrinkID drinkID;
    private final Name name;
    private final Size size;

    public DrinkNameUpdated(DrinkID drinkID, Name name, Size size) {
        super("joseppalomino.food.drinknameupdated");
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
