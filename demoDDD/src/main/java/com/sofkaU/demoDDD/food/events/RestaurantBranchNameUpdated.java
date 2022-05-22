package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.MenuName;
import com.sofkaU.demoDDD.food.values.Price;
import com.sofkaU.demoDDD.food.values.RestaurantBranchName;

public class RestaurantBranchNameUpdated extends DomainEvent {
    private final RestaurantBranchName restaurantBranchName;

    public RestaurantBranchNameUpdated(RestaurantBranchName restaurantBranchName) {
        super("joseppalomino.food.foodcreated");
        this.restaurantBranchName = restaurantBranchName;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
