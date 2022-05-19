package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Location;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;
import com.sofkaU.demoDDD.restaurantbranch.values.AmountOfChairs;

public class TableAdded extends DomainEvent {
    private final TableID tableID;
    private final Location location;
    private final AmountOfChairs amountOfChairs;

    public TableAdded(TableID tableID, Location location, AmountOfChairs amountOfChairs) {
        super("joseppalomino.food.entryadded");
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
