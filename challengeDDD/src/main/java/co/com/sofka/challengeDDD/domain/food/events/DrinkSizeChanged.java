package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class DrinkSizeChanged extends DomainEvent {
    private final DrinkID drinkID;
    private final Size size;

    public DrinkSizeChanged(DrinkID drinkID, Size size) {
        super("com.food.DrinkSizeChanged");
        this.drinkID = drinkID;
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public DrinkID getDrinkID() {
        return drinkID;
    }

}
