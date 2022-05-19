package com.sofkaU.demoDDD.food;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.demoDDD.food.events.FoodCreated;

import java.util.HashSet;

public class FoodChange extends EventChange {

    public FoodChange(Food food){
        apply((FoodCreated event)->{
            food.restaurantBranchName=event.getRestaurantBranchName();
            food.price=event.getPrice();
            food.menuName=event.getMenuName();
            food.dishes=new HashSet<>();
            food.drinks=new HashSet<>();
            food.entries=new HashSet<>();
        });
    }
}
