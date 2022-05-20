package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.ExtraDecoration;
import com.sofkaU.demoDDD.customizedservice.values.HolidayID;
import com.sofkaU.demoDDD.customizedservice.values.Name;

public class HolidayExtraDecorationChanged extends DomainEvent {
    private final ExtraDecoration extraDecoration;

    public HolidayExtraDecorationChanged(ExtraDecoration extraDecoration) {
        super("joseppalomino.food.entryadded");
        this.extraDecoration = extraDecoration;
    }

    public ExtraDecoration getExtraDecoration() {
        return extraDecoration;
    }
}
