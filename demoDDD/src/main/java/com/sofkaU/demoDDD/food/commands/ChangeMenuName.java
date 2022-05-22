package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.MenuName;
import com.sofkaU.demoDDD.food.values.RestaurantBranchName;

public class ChangeMenuName extends Command {
    private final FoodID foodID;
    private final RestaurantBranchName restaurantBranchName;
    private final MenuName menuName;

    public ChangeMenuName(FoodID foodID, RestaurantBranchName restaurantBranchName, MenuName menuName) {
        this.foodID = foodID;
        this.restaurantBranchName = restaurantBranchName;
        this.menuName = menuName;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }


    public MenuName getMenuName() {
        return menuName;
    }
}
