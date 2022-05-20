package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.Location;
import com.sofkaU.demoDDD.restaurantbranch.values.RestaurantBranchName;

public class UpdateRestaurantBranchName extends Command {
    private final RestaurantBranchName restaurantBranchName;

    public UpdateRestaurantBranchName(RestaurantBranchName restaurantBranchName) {
        this.restaurantBranchName = restaurantBranchName;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
