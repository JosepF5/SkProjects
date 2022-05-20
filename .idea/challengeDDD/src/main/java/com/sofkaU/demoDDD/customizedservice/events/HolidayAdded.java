package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.ExtraDecoration;
import com.sofkaU.demoDDD.customizedservice.values.HolidayID;
import com.sofkaU.demoDDD.customizedservice.values.Name;

public class HolidayAdded extends DomainEvent {
    private final HolidayID holidayID;
    private final Name name;
    private final ExtraDecoration extraDecoration;

    public HolidayAdded(HolidayID holidayID, ExtraDecoration extraDecoration, Name name) {
        super("joseppalomino.food.entryadded");
        this.holidayID = holidayID;
        this.name = name;
        this.extraDecoration = extraDecoration;
    }

    public HolidayID getHolidayID() {
        return holidayID;
    }

    public Name getName() {
        return name;
    }

    public ExtraDecoration getExtraDecoration() {
        return extraDecoration;
    }
}
