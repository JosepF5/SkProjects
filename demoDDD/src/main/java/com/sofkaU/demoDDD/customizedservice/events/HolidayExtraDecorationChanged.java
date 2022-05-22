package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.ExtraDecoration;
import com.sofkaU.demoDDD.customizedservice.values.HolidayID;

public class HolidayExtraDecorationChanged extends DomainEvent {
    private final HolidayID holidayID;
    private final ExtraDecoration extraDecoration;

    public HolidayExtraDecorationChanged(HolidayID holidayID, ExtraDecoration extraDecoration) {
        super("joseppalomino.food.entryadded");
        this.holidayID = holidayID;
        this.extraDecoration = extraDecoration;
    }

    public HolidayID getHolidayID() {
        return holidayID;
    }

    public ExtraDecoration getExtraDecoration() {
        return extraDecoration;
    }
}
