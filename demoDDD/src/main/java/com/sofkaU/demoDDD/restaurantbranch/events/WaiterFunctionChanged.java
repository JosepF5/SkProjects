package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;

public class WaiterFunctionChanged extends DomainEvent {
    private final Function function;

    public WaiterFunctionChanged(Function function) {
        super("joseppalomino.food.dishadded");
        this.function = function;
    }
    public Function getFunction() {
        return function;
    }
}
