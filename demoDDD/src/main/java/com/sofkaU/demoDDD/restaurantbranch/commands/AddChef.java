package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.*;

public class AddChef extends Command {
    private final RestaurantBranchID restaurantBranchID;
    private final ChefID chefID;
    private final Name name;
    private final Area area;

    public AddChef(RestaurantBranchID restaurantBranchID, ChefID chefID, Name name, Area area) {
        this.restaurantBranchID = restaurantBranchID;
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
