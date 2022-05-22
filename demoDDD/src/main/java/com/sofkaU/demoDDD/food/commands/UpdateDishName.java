package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.DishID;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.Name;

public class UpdateDishName extends Command {
    private final FoodID foodID;
    private final DishID dishID;
    private final Name name;

    public UpdateDishName(FoodID foodID, DishID dishID, Name name) {
        this.foodID = foodID;
        this.dishID = dishID;
        this.name = name;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public DishID getDishID() {
        return dishID;
    }

    public Name getName() {
        return name;
    }
}
