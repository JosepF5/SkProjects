package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.BirthdayID;
import com.sofkaU.demoDDD.customizedservice.values.DateBirth;

public class BirthdayDateBirthUpdated extends DomainEvent {
    private final DateBirth dateBirth;

    public BirthdayDateBirthUpdated(DateBirth dateBirth) {
        super("joseppalomino.food.dishadded");
        this.dateBirth = dateBirth;
    }

    public DateBirth getDateBirth() {
        return dateBirth;
    }
}
