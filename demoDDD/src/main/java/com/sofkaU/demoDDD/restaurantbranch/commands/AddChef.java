package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.Area;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;

public class AddChef extends Command {
    private final ChefID chefID;
    private final Name name;
    private final Area area;

    public AddChef(ChefID chefID, Name name, Area area) {
        this.chefID = chefID;
        this.name = name;
        this.area = area;
    }

    public ChefID getChefID() {
        return chefID;
    }

    public Name getName() {
        return name;
    }

    public Area getArea() {
        return area;
    }
}
