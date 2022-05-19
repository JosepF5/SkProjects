package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;

public class ChefNameUpdated extends DomainEvent {
    private final Name name;

    public ChefNameUpdated(ChefID drinkID, Name name, Function size) {
        super("joseppalomino.food.drinknameupdated");
        this.name = name;
    }
    public Name getName() {
        return name;
    }

}
