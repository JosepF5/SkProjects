package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.DateBirth;
import com.sofkaU.demoDDD.customizedservice.values.Name;
import com.sofkaU.demoDDD.customizedservice.values.BirthdayID;

public class BirthdayAdded extends DomainEvent {
    private final BirthdayID birthdayID;
    private final AmountOfGuests amountOfGuests;
    private final DateBirth dateBirth;

    public BirthdayAdded(BirthdayID birthdayID, AmountOfGuests amountOfGuests, DateBirth dateBirth) {
        super("joseppalomino.food.dishadded");
        this.birthdayID = birthdayID;
        this.amountOfGuests = amountOfGuests;
        this.dateBirth = dateBirth;
    }

    public BirthdayID getWaiterID() {
        return birthdayID;
    }

    public AmountOfGuests getAmountOfGuests() {
        return amountOfGuests;
    }

    public DateBirth getDateBirth() {
        return dateBirth;
    }
}
