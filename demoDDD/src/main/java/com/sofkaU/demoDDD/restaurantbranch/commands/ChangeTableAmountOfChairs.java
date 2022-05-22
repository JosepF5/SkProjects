package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.RestaurantBranchID;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;
import com.sofkaU.demoDDD.restaurantbranch.values.AmountOfChairs;

public class ChangeTableAmountOfChairs extends Command {
    private final RestaurantBranchID restaurantBranchID;
    private final TableID tableID;
    private final AmountOfChairs amountOfChairs;

    public ChangeTableAmountOfChairs(RestaurantBranchID restaurantBranchID, TableID tableID, AmountOfChairs amountOfChairs) {
        this.restaurantBranchID = restaurantBranchID;
        this.tableID = tableID;
        this.amountOfChairs = amountOfChairs;
    }

    public RestaurantBranchID getRestaurantBranchID() {
        return restaurantBranchID;
    }

    public TableID getTableID() {
        return tableID;
    }

    public AmountOfChairs getAmountOfChairs() {
        return amountOfChairs;
    }
}
