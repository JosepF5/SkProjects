package com.sofkaU.demoDDD.restaurantbranch.commands;

import com.sofkaU.demoDDD.restaurantbranch.values.Function;
import com.sofkaU.demoDDD.restaurantbranch.values.RestaurantBranchID;
import com.sofkaU.demoDDD.restaurantbranch.values.WaiterID;

public class ChangeWaiterFunction {
    private final RestaurantBranchID restaurantBranchID;
    private final WaiterID waiterID;
    private final Function function;

    public ChangeWaiterFunction(RestaurantBranchID restaurantBranchID, WaiterID waiterID, Function function) {
        this.restaurantBranchID = restaurantBranchID;
        this.waiterID = waiterID;
        this.function = function;
    }

    public RestaurantBranchID getRestaurantBranchID() {
        return restaurantBranchID;
    }

    public WaiterID getWaiterID() {
        return waiterID;
    }

    public Function getFunction() {
        return function;
    }
}
