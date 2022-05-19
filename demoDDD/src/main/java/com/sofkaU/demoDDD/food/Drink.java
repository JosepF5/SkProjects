package com.sofkaU.demoDDD.food;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.food.values.DrinkID;
import com.sofkaU.demoDDD.food.values.Name;
import com.sofkaU.demoDDD.food.values.Size;

import java.util.Objects;

public class Drink extends Entity<DrinkID> {
    private Name name;
    private Size size;

    public Drink(DrinkID entityId, Name name, Size size) {
        super(entityId);
        this.name=name;
        this.size=size;
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public void updateSize(Size size){
        this.size= Objects.requireNonNull(size);
    }

    public Name name() {
        return name;
    }

    public Size Size() {
        return size;
    }
}
