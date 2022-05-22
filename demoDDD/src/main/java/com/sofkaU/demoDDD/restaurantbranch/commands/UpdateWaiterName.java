package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.RestaurantBranchID;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;

public class UpdateWaiterName extends Command {
    private final RestaurantBranchID restaurantBranchID;
    private final WaiterID waiterID;
    private final Name name;

    public UpdateWaiterName(RestaurantBranchID restaurantBranchID, WaiterID waiterID, Name name){
        this.restaurantBranchID = restaurantBranchID;
        this.waiterID = waiterID;
        this.name =name;
    }

    public RestaurantBranchID getRestaurantBranchID() {
        return restaurantBranchID;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public Name getName() {
        return name;
    }
}
