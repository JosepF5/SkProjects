package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.*;

public class EntryAdded extends DomainEvent {
    private final EntryID entryID;
    private final Name name;
    private final Type type;

    public EntryAdded(EntryID entryID, Name name, Type type) {
        super("joseppalomino.food.entryadded");
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
