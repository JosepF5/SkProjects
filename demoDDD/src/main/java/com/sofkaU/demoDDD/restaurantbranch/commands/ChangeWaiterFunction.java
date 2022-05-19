package com.sofkaU.demoDDD.restaurantbranch.commands;

import com.sofkaU.demoDDD.restaurantbranch.values.Function;

public class ChangeWaiterFunction {
    private final Function function;

    public ChangeWaiterFunction(Function function) {
        this.function = function;
    }
    public Function getFunction() {
        return function;
    }
}
