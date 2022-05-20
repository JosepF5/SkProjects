package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.Command;

public class UpdateDrinkPrice extends Command {
    private final FoodID foodID;
    private final DrinkID drinkID;
    private final Price price;

    public UpdateDrinkPrice(FoodID foodID, DrinkID drinkID, Price price) {
        this.foodID = foodID;
        this.drinkID = drinkID;
        this.price = price;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public DrinkID getDrinkID() {
        return drinkID;
    }

    public Price getPrice() {
        return price;
    }

}
