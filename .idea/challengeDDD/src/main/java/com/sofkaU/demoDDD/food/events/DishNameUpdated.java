package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.Dish;
import com.sofkaU.demoDDD.food.values.DishID;
import com.sofkaU.demoDDD.food.values.Name;

import java.util.Set;

public class DishNameUpdated extends DomainEvent {
    private final Name name;
    private final DishID dishID;
    public DishNameUpdated(DishID dishID, Name name){
        super("joseppalomino.food.dishnameupdated");
        this.name =name;
        this.dishID =dishID;
    }

    public Name getName() {
        return name;
    }

    public DishID getDishID() {
        return dishID;
    }
}
