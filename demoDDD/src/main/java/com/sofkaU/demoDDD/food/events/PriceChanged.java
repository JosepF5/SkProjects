package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.Price;

public class PriceChanged extends DomainEvent {
    private final Price price;

    public PriceChanged(Price price) {
        super("joseppalomino.food.foodcreated");
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

}
