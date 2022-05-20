package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Location;

public class TableLocationUpdated extends DomainEvent {
    private final Location location;

    public TableLocationUpdated(Location location) {
        super("joseppalomino.food.entryadded");
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
