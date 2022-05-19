package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.RestaurantBranchName;

public class CreateRestaurantBranch extends Command {
    private final RestaurantBranchName restaurantBranchName;

    public CreateRestaurantBranch(RestaurantBranchName restaurantBranchName) {
        this.restaurantBranchName = restaurantBranchName;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
