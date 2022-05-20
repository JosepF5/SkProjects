package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.DessertID;
import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.challengeDDD.domain.food.values.Taste;
import co.com.sofka.domain.generic.Command;

public class UpdateDessertTaste extends Command {
    private final FoodID foodID;
    private final DessertID dessertID;
    private final Taste taste;

    public UpdateDessertTaste(FoodID foodID, DessertID dessertID, Taste taste) {
        this.foodID = foodID;
        this.dessertID = dessertID;
        this.taste = taste;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public Taste getTaste() {
        return taste;
    }

    public DessertID getDessertID() {
        return dessertID;
    }

}
