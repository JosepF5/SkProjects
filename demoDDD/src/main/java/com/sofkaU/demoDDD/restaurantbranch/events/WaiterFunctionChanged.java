package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;

public class WaiterFunctionChanged extends DomainEvent {
    private final WaiterID waiterID;
    private final Function function;

    public WaiterFunctionChanged(WaiterID waiterID, Function function) {
        super("joseppalomino.food.dishadded");
        this.waiterID = waiterID;
        this.function = function;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public Function getFunction() {
        return function;
    }
}
