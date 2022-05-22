package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.MenuName;
import com.sofkaU.demoDDD.food.values.Price;
import com.sofkaU.demoDDD.food.values.RestaurantBranchName;

public class MenuNameChanged extends DomainEvent {
    private final MenuName menuName;

    public MenuNameChanged(MenuName menuName) {
        super("joseppalomino.food.foodcreated");
        this.menuName = menuName;
    }


    public MenuName getMenuName() {
        return menuName;
    }
}
