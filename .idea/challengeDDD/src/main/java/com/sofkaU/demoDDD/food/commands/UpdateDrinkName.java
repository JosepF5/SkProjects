package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.DrinkID;
import com.sofkaU.demoDDD.food.values.Name;
import com.sofkaU.demoDDD.food.values.Size;

public class UpdateDrinkName extends Command {
    private final DrinkID drinkID;
    private final Name name;
    private final Size size;

    public UpdateDrinkName(DrinkID drinkID, Name name, Size size) {
        this.drinkID = drinkID;
        this.name = name;
        this.size = size;
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
