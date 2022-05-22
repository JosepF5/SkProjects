package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.DrinkID;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.Name;

public class UpdateDrinkName extends Command {
    private final FoodID foodID;
    private final DrinkID drinkID;
    private final Name name;

    public UpdateDrinkName(FoodID foodID, DrinkID drinkID, Name name) {
        this.foodID = foodID;
        this.drinkID = drinkID;
        this.name = name;
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
