package com.sofkaU.demoDDD.restaurantbranch;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.demoDDD.restaurantbranch.events.RestaurantBranchCreated;

import java.util.HashSet;

public class RestaurantBranchChange extends EventChange {

    public RestaurantBranchChange(RestaurantBranch restaurantBranch){
        apply((RestaurantBranchCreated event)->{
            restaurantBranch.restaurantBranchName=event.getRestaurantBranchName();
            restaurantBranch.waiters=new HashSet<>();
            restaurantBranch.chefs=new HashSet<>();
            restaurantBranch.tables=new HashSet<>();
        });
    }
}
