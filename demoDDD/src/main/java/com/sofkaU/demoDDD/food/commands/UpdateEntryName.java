package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.EntryID;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.Name;

public class UpdateEntryName extends Command {
    private final FoodID foodID;
    private final EntryID entryID;
    private final Name name;

    public UpdateEntryName(FoodID foodID, EntryID entryID, Name name) {
        this.foodID = foodID;
        this.entryID = entryID;
        this.name = name;
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
}
