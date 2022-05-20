package co.com.sofka.challengeDDD.domain.food.events;

import co.com.sofka.challengeDDD.domain.food.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class DessertPriceUpdated extends DomainEvent {
    private final DessertID dessertID;
    private final Price price;

    public DessertPriceUpdated(DessertID dessertID, Price price) {
        super("com.food.DessertPriceUpdated");
        this.dessertID = dessertID;
        this.price = price;
    }

    public DessertID getDessertID() {
        return dessertID;
    }

    public Price getPrice() {
        return price;
    }

}
