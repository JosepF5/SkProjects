package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.DishID;
import com.sofkaU.demoDDD.food.values.Name;

public class AddDish extends Command {
    private final DishID dishID;
    private final Name name;

    public AddDish(DishID dishID,Name name) {
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
