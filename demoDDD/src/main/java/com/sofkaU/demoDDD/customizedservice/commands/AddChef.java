package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.Years;
import com.sofkaU.demoDDD.customizedservice.values.AnniversaryID;
import com.sofkaU.demoDDD.customizedservice.values.Name;

public class AddChef extends Command {
    private final AnniversaryID chefID;
    private final Name name;
    private final Years area;

    public AddChef(AnniversaryID chefID, Name name, Years area) {
        this.chefID = chefID;
        this.name = name;
        this.area = area;
    }

    public AnniversaryID getChefID() {
        return chefID;
    }

    public Name getName() {
        return name;
    }

    public Years getArea() {
        return area;
    }
}
