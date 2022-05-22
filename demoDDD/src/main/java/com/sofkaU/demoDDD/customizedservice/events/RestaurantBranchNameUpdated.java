package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.CustomizedServiceID;
import com.sofkaU.demoDDD.customizedservice.values.RestaurantBranchName;

public class RestaurantBranchNameUpdated extends DomainEvent {
    private final CustomizedServiceID customizedServiceID;
    private final RestaurantBranchName restaurantBranchName;

    public RestaurantBranchNameUpdated(CustomizedServiceID customizedServiceID, RestaurantBranchName restaurantBranchName) {
        super("joseppalomino.food.foodcreated");
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
