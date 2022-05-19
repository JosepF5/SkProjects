package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;

public class UpdateWaiterName extends Command {
    private final Name name;
    public UpdateWaiterName(Name name){
        this.name =name;
    }

    public Name getName() {
        return name;
    }
}
