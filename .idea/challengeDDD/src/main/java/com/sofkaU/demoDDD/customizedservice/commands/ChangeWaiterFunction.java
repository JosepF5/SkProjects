package com.sofkaU.demoDDD.customizedservice.commands;

import com.sofkaU.demoDDD.customizedservice.values.DateBirth;

public class ChangeWaiterFunction {
    private final DateBirth function;

    public ChangeWaiterFunction(DateBirth function) {
        this.function = function;
    }
    public DateBirth getFunction() {
        return function;
    }
}
