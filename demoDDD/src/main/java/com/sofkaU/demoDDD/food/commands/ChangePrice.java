package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.Price;
import com.sofkaU.demoDDD.food.values.RestaurantBranchName;

public class ChangePrice extends Command {
    private final FoodID foodID;
    private final RestaurantBranchName restaurantBranchName;
    private final Price price;

    public ChangePrice(FoodID foodID, RestaurantBranchName restaurantBranchName, Price price) {
        this.foodID = foodID;
        this.restaurantBranchName = restaurantBranchName;
        this.price = price;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

    public Price getPrice() {
        return price;
    }
}
