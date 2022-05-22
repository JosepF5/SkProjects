package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.EntryID;
import com.sofkaU.demoDDD.food.values.FoodID;
import com.sofkaU.demoDDD.food.values.Name;
import com.sofkaU.demoDDD.food.values.Type;

public class ChangeEntryType extends Command {
    private final FoodID foodID;
    private final EntryID entryID;
    private final Type type;

    public ChangeEntryType(EntryID entryID, Name name, FoodID foodID, Type type) {
        this.entryID = entryID;
        this.foodID = foodID;
        this.type = type;
    }

    public FoodID getFoodID() {
        return foodID;
    }

    public EntryID getEntryID() {
        return entryID;
    }

    public Type getType() {
        return type;
    }
}
