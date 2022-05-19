package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.RestaurantBranchName;

public class RestaurantBranchCreated extends DomainEvent {
    private final RestaurantBranchName restaurantBranchName;

    public RestaurantBranchCreated(RestaurantBranchName restaurantBranchName) {
        super("joseppalomino.food.foodcreated");
        this.restaurantBranchName = restaurantBranchName;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
