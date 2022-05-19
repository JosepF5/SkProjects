package com.sofkaU.demoDDD.restaurantbranch.values;

import co.com.sofka.domain.generic.Identity;

public class RestaurantBranchID extends Identity {

    public RestaurantBranchID() {
    }

    private RestaurantBranchID(String uuid) {
        super(uuid);
    }

    public static RestaurantBranchID of(String id){
        return new RestaurantBranchID(id);
    }
}
