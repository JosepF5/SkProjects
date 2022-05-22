package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.AnniversaryID;
import com.sofkaU.demoDDD.customizedservice.values.Years;

public class AnniversaryYearsUpdated extends DomainEvent {
    private final AnniversaryID anniversaryID;
    private final Years years;

    public AnniversaryYearsUpdated(AnniversaryID anniversaryID, Years years) {
        super("joseppalomino.food.drinkadded");
        this.anniversaryID = anniversaryID;
        this.years = years;
    }

    public AnniversaryID getAnniversaryID() {
        return anniversaryID;
    }

    public Years getYears() {
        return years;
    }
}
