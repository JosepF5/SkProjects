package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.DrinkID;
import co.com.sofka.challengeDDD.domain.food.values.Size;
import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.domain.generic.Command;

public class ChangeDrinkSize extends Command {
    private final FoodID foodID;
    private final DrinkID drinkID;
    private final Size size;

    public ChangeDrinkSize(FoodID foodID, DrinkID drinkID, Size size) {
        this.foodID = foodID;
        this.drinkID = drinkID;
        this.size = size;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public Size getSize() {
        return size;
    }

    public DrinkID getDrinkID() {
        return drinkID;
    }

}
