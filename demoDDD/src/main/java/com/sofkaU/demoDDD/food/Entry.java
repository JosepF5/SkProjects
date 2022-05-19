package com.sofkaU.demoDDD.food;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.food.values.*;

import java.util.Objects;

public class Entry extends Entity<EntryID> {
    private Name name;
    private Type type;

    public Entry(EntryID entityId, Name name, Type type) {
        super(entityId);
        this.name=name;
        this.type=type;
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public void updateType(Type type){
        this.type= Objects.requireNonNull(type);
    }

    public Name name() {
        return name;
    }

    public Type type() {
        return type;
    }
}
