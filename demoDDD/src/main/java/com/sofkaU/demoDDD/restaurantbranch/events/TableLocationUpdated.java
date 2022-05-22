package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Location;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;

public class TableLocationUpdated extends DomainEvent {
    private final TableID tableID;
    private final Location location;

    public TableLocationUpdated(TableID tableID, Location location) {
        super("joseppalomino.food.entryadded");
        this.tableID = tableID;
        this.location = location;
    }

    public TableID getTableID() {
        return tableID;
    }

    public Location getLocation() {
        return location;
    }
}
