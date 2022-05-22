package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.MenuName;
import com.sofkaU.demoDDD.food.values.Price;
import com.sofkaU.demoDDD.food.values.RestaurantBranchName;

public class UpdateRestaurantBranchName extends Command {
    private final FoodID foodID;
    private final RestaurantBranchName restaurantBranchName;

    public UpdateRestaurantBranchName(FoodID foodID, RestaurantBranchName restaurantBranchName) {
        this.foodID = foodID;
        this.restaurantBranchName = restaurantBranchName;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

}
