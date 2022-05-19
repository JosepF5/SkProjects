package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.*;

public class DishAdded extends DomainEvent {
    private final DishID dishID;
    private final Name name;

    public DishAdded(DishID dishID,Name name) {
        super("joseppalomino.food.dishadded");
        this.dishID = dishID;
        this.name = name;
    }

    public DishID getDishID() {
        return dishID;
    }

    public Name getName() {
        return name;
    }
}
