package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.CustomizedServiceID;
import com.sofkaU.demoDDD.customizedservice.values.RestaurantBranchName;

public class UpdateRestaurantBranchName extends Command {
    private final CustomizedServiceID customizedServiceID;
    private final RestaurantBranchName restaurantBranchName;

    public UpdateRestaurantBranchName(CustomizedServiceID customizedServiceID, RestaurantBranchName restaurantBranchName) {
        this.customizedServiceID = customizedServiceID;
        this.restaurantBranchName = restaurantBranchName;
    }

    public CustomizedServiceID getCustomizedServiceID() {
        return customizedServiceID;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
