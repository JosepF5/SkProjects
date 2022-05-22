package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.RestaurantBranchID;
import com.sofkaU.demoDDD.restaurantbranch.values.RestaurantBranchName;

public class CreateRestaurantBranch extends Command {
    private final RestaurantBranchID restaurantBranchID;
    private final RestaurantBranchName restaurantBranchName;

    public CreateRestaurantBranch(RestaurantBranchID restaurantBranchID, RestaurantBranchName restaurantBranchName) {
        this.restaurantBranchID = restaurantBranchID;
        this.restaurantBranchName = restaurantBranchName;
    }

    public RestaurantBranchID getRestaurantBranchID() {
        return restaurantBranchID;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
