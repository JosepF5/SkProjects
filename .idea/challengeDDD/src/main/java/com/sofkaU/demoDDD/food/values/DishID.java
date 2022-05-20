package com.sofkaU.demoDDD.food.values;

import co.com.sofka.domain.generic.Identity;

public class DishID extends Identity {
    public DishID() {
    }

    private DishID(String uuid) {
        super(uuid);
    }

    public static DishID of(String id){
        return new DishID(id);
    }
}
