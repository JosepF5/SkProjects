package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.EntryID;
import com.sofkaU.demoDDD.food.values.Name;
import com.sofkaU.demoDDD.food.values.Type;

public class EntryTypeChanged extends DomainEvent {
    private final EntryID entryID;
    private final Type type;

    public EntryTypeChanged(EntryID entryID, Type type) {
        super("joseppalomino.food.entryadded");
        this.entryID = entryID;
        this.type = type;
    }

    public EntryID getEntryID() {
        return entryID;
    }

    public Type getType() {
        return type;
    }
}
