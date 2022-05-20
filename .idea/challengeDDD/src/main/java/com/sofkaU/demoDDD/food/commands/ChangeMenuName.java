package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.MenuName;
import com.sofkaU.demoDDD.food.values.Price;
import com.sofkaU.demoDDD.food.values.RestaurantBranchName;

public class ChangeMenuName extends Command {
    private final RestaurantBranchName restaurantBranchName;
    private final Price price;
    private final MenuName menuName;

    public ChangeMenuName(RestaurantBranchName restaurantBranchName, Price price, MenuName menuName) {
        this.restaurantBranchName = restaurantBranchName;
        this.price = price;
        this.menuName = menuName;
    }

    public RestaurantBranchName getRestaurantBranchName() {
        return restaurantBranchName;
    }

    public Price getPrice() {
        return price;
    }

    public MenuName getMenuName() {
        return menuName;
    }
}
