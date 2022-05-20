package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.MenuName;
import com.sofkaU.demoDDD.food.values.Price;
import com.sofkaU.demoDDD.food.values.RestaurantBranchName;

public class MenuNameChanged extends DomainEvent {
    private final RestaurantBranchName restaurantBranchName;
    private final Price price;
    private final MenuName menuName;

    public MenuNameChanged(RestaurantBranchName restaurantBranchName, Price price, MenuName menuName) {
        super("joseppalomino.food.foodcreated");
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
