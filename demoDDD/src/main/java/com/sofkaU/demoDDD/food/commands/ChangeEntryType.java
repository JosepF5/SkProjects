package com.sofkaU.demoDDD.food.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.food.values.EntryID;
import com.sofkaU.demoDDD.food.values.Name;
import com.sofkaU.demoDDD.food.values.Type;

public class ChangeEntryType extends Command {
    private final EntryID entryID;
    private final Name name;
    private final Type type;

    public ChangeEntryType(EntryID entryID, Name name, Type type) {
        this.entryID = entryID;
        this.name = name;
        this.type = type;
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
