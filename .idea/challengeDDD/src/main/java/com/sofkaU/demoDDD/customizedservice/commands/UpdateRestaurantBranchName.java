package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.RestaurantBranchName;

public class UpdateRestaurantBranchName extends Command {
    private final RestaurantBranchName restaurantBranchName;

    public UpdateRestaurantBranchName(RestaurantBranchName restaurantBranchName) {
        this.restaurantBranchName = restaurantBranchName;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
