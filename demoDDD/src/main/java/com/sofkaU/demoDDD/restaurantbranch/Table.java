package com.sofkaU.demoDDD.restaurantbranch;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.AmountOfChairs;

import java.util.Objects;

public class Table extends Entity<TableID> {
    private Name name;
    private AmountOfChairs type;

    public Table(TableID entityId, Name name, AmountOfChairs type) {
        super(entityId);
        this.name=name;
        this.type=type;
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public void updateType(AmountOfChairs type){
        this.type= Objects.requireNonNull(type);
    }

    public Name name() {
        return name;
    }

    public AmountOfChairs type() {
        return type;
    }
}
