package com.sofkaU.demoDDD.restaurantbranch.values;

import co.com.sofka.domain.generic.Identity;

public class TableID extends Identity {
    public TableID() {
    }

    private TableID(String uuid) {
        super(uuid);
    }

    public static TableID of(String id){
        return new TableID(id);
    }
}
