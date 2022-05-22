package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.*;

public class AddDrink extends Command {
    private final FoodID foodID;
    private final DrinkID drinkID;
    private final Name name;
    private final Size size;

    public AddDrink(FoodID foodID, DrinkID drinkID, Name name, Size size) {
        this.foodID = foodID;
        this.drinkID = drinkID;
        this.name = name;
        this.size = size;
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

    public Size getSize() {
        return size;
    }
}
