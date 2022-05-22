package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.RestaurantBranchID;

public class UpdateChefName extends Command {
    private final RestaurantBranchID restaurantBranchID;
    private final ChefID chefID;
    private final Name name;

    public UpdateChefName(RestaurantBranchID restaurantBranchID, ChefID chefID, Name name) {
        this.restaurantBranchID = restaurantBranchID;
        this.chefID = chefID;
        this.name = name;
    }

    public RestaurantBranchID getRestaurantBranchID() {
        return restaurantBranchID;
    }

    public ChefID getChefID() {
        return chefID;
    }

    public Name getName() {
        return name;
    }
}
