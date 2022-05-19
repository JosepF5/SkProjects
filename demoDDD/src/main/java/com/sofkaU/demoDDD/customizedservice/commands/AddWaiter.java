package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.DateBirth;
import com.sofkaU.demoDDD.customizedservice.values.Name;
import com.sofkaU.demoDDD.customizedservice.values.BirthdayID;

public class AddWaiter extends Command {
    private final BirthdayID waiterID;
    private final Name name;
    private final DateBirth function;

    public AddWaiter(BirthdayID waiterID, Name name, DateBirth function) {
        this.waiterID = waiterID;
        this.name = name;
        this.function = function;
    }

    public BirthdayID getWaiterID() {
        return waiterID;
    }

    public Name getName() {
        return name;
    }

    public DateBirth getFunction() {
        return function;
    }
}
