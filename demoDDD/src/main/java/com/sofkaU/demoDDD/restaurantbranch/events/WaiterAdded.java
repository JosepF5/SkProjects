package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;

public class WaiterAdded extends DomainEvent {
    private final WaiterID waiterID;
    private final Name name;
    private final Function function;

    public WaiterAdded(WaiterID waiterID, Name name,Function function) {
        super("joseppalomino.food.dishadded");
        this.waiterID = waiterID;
        this.name = name;
        this.function = function;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public Name getName() {
        return name;
    }

    public Function getFunction() {
        return function;
    }
}
