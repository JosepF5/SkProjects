package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.ExtraDecoration;
import com.sofkaU.demoDDD.customizedservice.values.HolidayID;
import com.sofkaU.demoDDD.customizedservice.values.Name;

public class HolidayNameUpdated extends DomainEvent {
    private final Name name;

    public HolidayNameUpdated(Name name) {
        super("joseppalomino.food.entryadded");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
