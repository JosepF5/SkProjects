package com.sofkaU.demoDDD.customizedservice;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.customizedservice.values.ExtraDecoration;
import com.sofkaU.demoDDD.customizedservice.values.Name;
import com.sofkaU.demoDDD.customizedservice.values.HolidayID;

import java.util.Objects;

public class Holiday extends Entity<HolidayID> {
    private Name name;
    private ExtraDecoration extraDecoration;

    public Holiday(HolidayID entityId, Name name, ExtraDecoration extraDecoration) {
        super(entityId);
        this.name=name;
        this.extraDecoration=extraDecoration;
    }

    public void updateName(Name name){
        this.name= Objects.requireNonNull(name);
    }

    public void updateExtraDecoration(ExtraDecoration extraDecoration){
        this.extraDecoration= Objects.requireNonNull(extraDecoration);
    }

    public Name name() {
        return name;
    }

    public ExtraDecoration extraDecoration() {
        return extraDecoration;
    }
}
