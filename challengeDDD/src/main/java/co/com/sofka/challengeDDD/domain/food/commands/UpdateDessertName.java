package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.DessertID;
import co.com.sofka.challengeDDD.domain.food.values.Name;
import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.domain.generic.Command;

public class UpdateDessertName extends Command {
    private final FoodID foodID;
    private final DessertID dessertID;
    private final Name name;

    public UpdateDessertName(FoodID foodID, DessertID dessertID, Name name) {
        this.foodID = foodID;
        this.dessertID = dessertID;
        this.name = name;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public DessertID getDessertID() {
        return dessertID;
    }

    public Name getName() {
        return name;
    }
}
