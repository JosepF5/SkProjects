package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.EntryID;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.Name;
import com.sofkaU.demoDDD.food.values.Type;

public class AddEntry extends Command {
    private final FoodID foodID;
    private final EntryID entryID;
    private final Name name;
    private final Type type;

    public AddEntry(FoodID foodID, EntryID entryID, Name name, Type type) {
        this.foodID = foodID;
        this.entryID = entryID;
        this.name = name;
        this.type = type;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public EntryID getEntryID() {
        return entryID;
    }

    public Name getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
