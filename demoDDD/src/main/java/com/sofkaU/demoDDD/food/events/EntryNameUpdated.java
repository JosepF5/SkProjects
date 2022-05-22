package com.sofkaU.demoDDD.food.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.food.values.EntryID;
import com.sofkaU.demoDDD.food.values.Name;
import com.sofkaU.demoDDD.food.values.Type;

public class EntryNameUpdated extends DomainEvent {
    private final EntryID entryID;
    private final Name name;

    public EntryNameUpdated(EntryID entryID, Name name) {
        super("joseppalomino.food.entryadded");
        this.entryID = entryID;
        this.name = name;
    }

    public EntryID getEntryID() {
        return entryID;
    }

    public Name getName() {
        return name;
    }

}
