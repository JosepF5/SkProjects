package com.sofkaU.demoDDD.restaurantbranch;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;

import java.util.Objects;

public class Waiter extends Entity<WaiterID> {
    private Name name;

    public Waiter(WaiterID entityId, Name name) {
        super(entityId);
        this.name=name;
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public Name name() {
        return name;
    }
}
