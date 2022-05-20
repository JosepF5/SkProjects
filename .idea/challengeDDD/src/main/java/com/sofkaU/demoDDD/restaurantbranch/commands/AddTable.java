package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.Location;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.AmountOfChairs;

public class AddTable extends Command {
    private final TableID tableID;
    private final Location location;
    private final AmountOfChairs amountOfChairs;

    public AddTable(TableID tableID, Location location, AmountOfChairs amountOfChairs) {
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
