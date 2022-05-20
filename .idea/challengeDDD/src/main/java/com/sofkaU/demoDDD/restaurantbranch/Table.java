package com.sofkaU.demoDDD.restaurantbranch;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.AmountOfChairs;

import java.util.Objects;

public class Table extends Entity<TableID> {
    private Name name;
    private AmountOfChairs amountOfChairs;

    public Table(TableID entityId, Name name, AmountOfChairs amountOfChairs) {
        super(entityId);
        this.name=name;
        this.amountOfChairs=amountOfChairs;
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public void updateAmountOfChairs(AmountOfChairs amountOfChairs){
        this.amountOfChairs= Objects.requireNonNull(amountOfChairs);
    }

    public Name name() {
        return name;
    }

    public AmountOfChairs amountOfChairs() {
        return amountOfChairs;
    }
}
