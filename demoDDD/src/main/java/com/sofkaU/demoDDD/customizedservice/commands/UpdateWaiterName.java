package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.Name;

public class UpdateWaiterName extends Command {
    private final Name name;
    public UpdateWaiterName(Name name){
        this.name =name;
    }

    public Name getName() {
        return name;
    }
}
