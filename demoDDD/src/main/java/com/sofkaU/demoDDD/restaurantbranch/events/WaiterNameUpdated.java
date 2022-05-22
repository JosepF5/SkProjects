package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;

public class WaiterNameUpdated extends DomainEvent {
    private final WaiterID waiterID;
    private final Name name;
    public WaiterNameUpdated(WaiterID waiterID, Name name){
        super("joseppalomino.food.dishnameupdated");
        this.waiterID = waiterID;
        this.name =name;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public Name getName() {
        return name;
    }

}
