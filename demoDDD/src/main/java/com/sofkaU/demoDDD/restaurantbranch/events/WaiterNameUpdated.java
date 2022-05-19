package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;

public class WaiterNameUpdated extends DomainEvent {
    private final Name name;
    public WaiterNameUpdated(Name name){
        super("joseppalomino.food.dishnameupdated");
        this.name =name;
    }

    public Name getName() {
        return name;
    }

}
