package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.*;

public class AddTable extends Command {
    private final RestaurantBranchID restaurantBranchID;
    private final TableID tableID;
    private final Location location;
    private final AmountOfChairs amountOfChairs;

    public AddTable(RestaurantBranchID restaurantBranchID, TableID tableID, Location location, AmountOfChairs amountOfChairs) {
        this.restaurantBranchID = restaurantBranchID;
        this.tableID = tableID;
        this.location = location;
        this.amountOfChairs = amountOfChairs;
    }

    public TableID getTableID() {
        return tableID;
    }

    public Location getLocation() {
        return location;
    }

    public AmountOfChairs getAmountOfChairs() {
        return amountOfChairs;
    }
}
