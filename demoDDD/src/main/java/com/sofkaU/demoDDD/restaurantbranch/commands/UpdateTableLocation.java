package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.*;

public class UpdateTableLocation extends Command {
    private final RestaurantBranchID restaurantBranchID;
    private final TableID tableID;
    private final Location location;

    public UpdateTableLocation(RestaurantBranchID restaurantBranchID, TableID tableID, Location location) {
        this.restaurantBranchID = restaurantBranchID;
        this.tableID = tableID;
        this.location = location;
    }

    public RestaurantBranchID getRestaurantBranchID() {
        return restaurantBranchID;
    }

    public TableID getTableID() {
        return tableID;
    }

    public Location getLocation() {
        return location;
    }
}
