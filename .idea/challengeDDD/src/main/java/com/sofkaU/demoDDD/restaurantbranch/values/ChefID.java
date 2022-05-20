package com.sofkaU.demoDDD.restaurantbranch.values;

import co.com.sofka.domain.generic.Identity;

public class ChefID extends Identity {
    public ChefID() {
    }

    private ChefID(String uuid) {
        super(uuid);
    }

    public static ChefID of(String id){
        return new ChefID(id);
    }
}
