package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.RestaurantBranchName;

public class CreateRestaurantBranch extends Command {
    private final RestaurantBranchName restaurantBranchName;

    public CreateRestaurantBranch(RestaurantBranchName restaurantBranchName) {
        this.restaurantBranchName = restaurantBranchName;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
