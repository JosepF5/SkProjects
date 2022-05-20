package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;

public class UpdateChefName extends Command {
    private final Name name;

    public UpdateChefName(Name name) {
        this.name = name;
    }
    public Name getName() {
        return name;
    }
}
