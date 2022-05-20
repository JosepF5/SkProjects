package com.sofkaU.demoDDD.food;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.food.values.DishID;
import com.sofkaU.demoDDD.food.values.Name;

import java.util.Objects;

public class Dish extends Entity<DishID> {
    private Name name;

    public Dish(DishID entityId, Name name) {
        super(entityId);
        this.name=name;
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public Name name() {
        return name;
    }
}
