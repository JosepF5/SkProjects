package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class DrinkAdded extends DomainEvent {
    private final DrinkID drinkID;
    private final Name name;
    private final Price price;
    private final Size size;

    public DrinkAdded(DrinkID drinkID, Name name, Price price, Size size) {
        super("com.food.DrinkAdded");
        this.drinkID = drinkID;
        this.name = name;
        this.price = price;
        this.size = size;
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
