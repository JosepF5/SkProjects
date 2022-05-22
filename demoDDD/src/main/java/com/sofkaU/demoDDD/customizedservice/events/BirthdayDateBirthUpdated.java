package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.BirthdayID;
import com.sofkaU.demoDDD.customizedservice.values.DateBirth;

public class BirthdayDateBirthUpdated extends DomainEvent {
    private final BirthdayID birthdayID;
    private final DateBirth dateBirth;

    public BirthdayDateBirthUpdated(BirthdayID birthdayID, DateBirth dateBirth) {
        super("joseppalomino.food.dishadded");
        this.birthdayID = birthdayID;
        this.dateBirth = dateBirth;
    }

    public BirthdayID getBirthdayID() {
        return birthdayID;
    }

    public DateBirth getDateBirth() {
        return dateBirth;
    }
}
