package com.sofkaU.demoDDD.food.values;

import co.com.sofka.domain.generic.Identity;

public class EntryID extends Identity {
    public EntryID() {
    }

    private EntryID(String uuid) {
        super(uuid);
    }

    public static EntryID of(String id){
        return new EntryID(id);
    }
}
