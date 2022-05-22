package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Area;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;

public class ChefAreaUpdated extends DomainEvent {
    private final ChefID chefID;
    private final Area area;

    public ChefAreaUpdated(ChefID chefID, Area area) {
        super("joseppalomino.food.drinkadded");
        this.chefID = chefID;
        this.area = area;
    }

    public ChefID getChefID() {
        return chefID;
    }

    public Area getArea() {
        return area;
    }
}
