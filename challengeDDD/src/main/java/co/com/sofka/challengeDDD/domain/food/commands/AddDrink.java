package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.Command;

public class AddDrink extends Command {
    private final FoodID foodID;
    private final DrinkID drinkID;
    private final Name name;
    private final Price price;
    private final Size size;

    public AddDrink(FoodID foodID, DrinkID drinkID, Name name, Price price, Size size) {
        this.foodID = foodID;
        this.drinkID = drinkID;
        this.name = name;
        this.price = price;
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

    public Name getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }
}
