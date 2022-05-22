package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.*;

public class HolidayNameUpdated extends DomainEvent {
    private final HolidayID holidayID;
    private final Name name;

    public HolidayNameUpdated(HolidayID holidayID, Name name) {
        super("joseppalomino.food.entryadded");
        this.holidayID = holidayID;
        this.name = name;
    }

    public HolidayID getHolidayID() {
        return holidayID;
    }

    public Name getName() {
        return name;
    }
}
