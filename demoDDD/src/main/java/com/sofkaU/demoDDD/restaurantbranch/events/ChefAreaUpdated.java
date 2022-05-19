package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Area;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;

public class ChefAreaUpdated extends DomainEvent {
    private final Area area;

    public ChefAreaUpdated(Area area) {
        super("joseppalomino.food.drinkadded");
        this.area = area;
    }
    public Area getArea() {
        return area;
    }
}
