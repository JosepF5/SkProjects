package com.sofkaU.demoDDD.restaurantbranch;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.restaurantbranch.values.Area;
import com.sofkaU.demoDDD.restaurantbranch.values.ChefID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;

import java.util.Objects;

public class Chef extends Entity<ChefID> {
    private Name name;
    private Area area;

    public Chef(ChefID entityId, Name name, Area area) {
        super(entityId);
        this.name=name;
        this.area=area;
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public void updateArea(Area area){
        this.area= Objects.requireNonNull(area);
    }

    public Name name() {
        return name;
    }

    public Area area() {
        return area;
    }
}
