package com.sofkaU.demoDDD.restaurantbranch.values;

import co.com.sofka.domain.generic.Identity;

public class WaiterID extends Identity {
    public WaiterID() {
    }

    private WaiterID(String uuid) {
        super(uuid);
    }

    public static WaiterID of(String id){
        return new WaiterID(id);
    }
}
