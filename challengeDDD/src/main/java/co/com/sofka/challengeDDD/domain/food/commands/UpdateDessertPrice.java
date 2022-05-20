package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.DessertID;
import co.com.sofka.challengeDDD.domain.food.values.Price;
import co.com.sofka.challengeDDD.domain.food.values.FoodID;
import co.com.sofka.domain.generic.Command;

public class UpdateDessertPrice extends Command {
    private final FoodID foodID;
    private final DessertID dessertID;
    private final Price price;

    public UpdateDessertPrice(FoodID foodID, DessertID dessertID, Price price) {
        this.foodID = foodID;
        this.dessertID = dessertID;
        this.price = price;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public DessertID getDessertID() {
        return dessertID;
    }

    public Price getPrice() {
        return price;
    }
}
