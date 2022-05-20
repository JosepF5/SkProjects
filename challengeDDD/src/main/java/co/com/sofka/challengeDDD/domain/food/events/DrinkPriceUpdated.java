package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class DrinkPriceUpdated extends DomainEvent {
    private final DrinkID drinkID;
    private final Price price;

    public DrinkPriceUpdated(DrinkID drinkID,Price price) {
        super("com.food.DrinkPriceUpdated");
        this.drinkID = drinkID;
        this.price = price;
    }

    public DrinkID getDrinkID() {
        return drinkID;
    }

    public Price getPrice() {
        return price;
    }
}
