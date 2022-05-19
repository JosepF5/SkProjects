package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Area;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;

public class ChefAdded extends DomainEvent {
    private final ChefID chefID;
    private final Name name;
    private final Area area;

    public ChefAdded(ChefID chefID, Name name, Area area) {
        super("joseppalomino.food.drinkadded");
        this.chefID = chefID;
        this.name = name;
        this.area = area;
    }

    public ChefID getChefID() {
        return chefID;
    }

    public Name getName() {
        return name;
    }

    public Area getArea() {
        return area;
    }
}
