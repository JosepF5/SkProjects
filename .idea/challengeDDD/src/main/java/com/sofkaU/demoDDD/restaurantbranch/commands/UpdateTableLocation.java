package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.Location;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.AmountOfChairs;

public class UpdateTableLocation extends Command {
    private final Location location;

    public UpdateTableLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
