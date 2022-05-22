package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.*;

public class ChangeChefArea extends Command {
    private final RestaurantBranchID restaurantBranchID;
    private final ChefID chefID;
    private final Area area;

    public ChangeChefArea(RestaurantBranchID restaurantBranchID, ChefID chefID, Area area) {
        this.restaurantBranchID = restaurantBranchID;
        this.chefID = chefID;
        this.area = area;
    }

    public RestaurantBranchID getRestaurantBranchID() {
        return restaurantBranchID;
    }

    public ChefID getChefID() {
        return chefID;
    }

    public Area getArea() {
        return area;
    }
}
