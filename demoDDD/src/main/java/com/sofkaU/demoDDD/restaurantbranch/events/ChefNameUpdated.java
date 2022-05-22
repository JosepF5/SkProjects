package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;

public class ChefNameUpdated extends DomainEvent {
    private final ChefID chefID;
    private final Name name;

    public ChefNameUpdated(Name name,ChefID chefID) {
        super("joseppalomino.food.drinknameupdated");
        this.name = name;
        this.chefID = chefID;
    }

    public ChefID getChefID() {
        return chefID;
    }

    public Name getName() {
        return name;
    }

}
