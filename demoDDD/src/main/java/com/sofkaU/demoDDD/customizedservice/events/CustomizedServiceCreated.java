package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.RestaurantBranchName;

public class CustomizedServiceCreated extends DomainEvent {
    private final RestaurantBranchName restaurantBranchName;

    public CustomizedServiceCreated(RestaurantBranchName restaurantBranchName) {
        super("joseppalomino.food.foodcreated");
        this.restaurantBranchName = restaurantBranchName;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
