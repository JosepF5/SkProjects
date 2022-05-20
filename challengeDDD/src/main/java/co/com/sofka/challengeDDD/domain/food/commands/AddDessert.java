package co.com.sofka.challengeDDD.domain.food.commands;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.Command;

public class AddDessert extends Command {
    private final FoodID foodID;
    private final DessertID dessertID;
    private final Name name;
    private final Price price;
    private final Taste taste;

    public AddDessert(FoodID foodID, DessertID dessertID, Name name, Price price, Taste taste) {
        this.foodID = foodID;
        this.dessertID = dessertID;
        this.name = name;
        this.price = price;
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

    public Name getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }
}
