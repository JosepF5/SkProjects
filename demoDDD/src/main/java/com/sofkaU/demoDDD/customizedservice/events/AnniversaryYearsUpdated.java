package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.AnniversaryID;
import com.sofkaU.demoDDD.customizedservice.values.Years;

public class AnniversaryYearsUpdated extends DomainEvent {
    private final Years years;

    public AnniversaryYearsUpdated(Years years) {
        super("joseppalomino.food.drinkadded");
        this.years = years;
    }

    public Years getYears() {
        return years;
    }
}
