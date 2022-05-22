package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.DrinkID;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.Name;
import com.sofkaU.demoDDD.food.values.Size;

public class UpdateDrinkSize extends Command {
    private final FoodID foodID;
    private final DrinkID drinkID;
    private final Name name;

    public UpdateDrinkSize(DrinkID drinkID, Name name,FoodID foodID) {
        this.drinkID = drinkID;
        this.name = name;
        this.foodID = foodID;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public DrinkID getDrinkID() {
        return drinkID;
    }

    public Name getName() {
        return name;
    }
}
