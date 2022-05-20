package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.Area;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.Function;

public class ChangeChefArea extends Command {
    private final Area area;

    public ChangeChefArea(Area area) {
        this.area = area;
    }
    public Area getArea() {
        return area;
    }
}
