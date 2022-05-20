package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;

public class AddWaiter extends Command {
    private final WaiterID waiterID;
    private final Name name;
    private final Function function;

    public AddWaiter(WaiterID waiterID, Name name,Function function) {
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
