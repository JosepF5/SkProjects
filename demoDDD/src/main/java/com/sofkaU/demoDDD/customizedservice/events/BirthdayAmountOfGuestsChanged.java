package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.BirthdayID;

public class BirthdayAmountOfGuestsChanged extends DomainEvent {
    private final BirthdayID birthdayID;
    private final AmountOfGuests amountOfGuests;

    public BirthdayAmountOfGuestsChanged(BirthdayID birthdayID, AmountOfGuests amountOfGuests) {
        super("joseppalomino.food.dishadded");
        this.birthdayID = birthdayID;
        this.amountOfGuests = amountOfGuests;
    }

    public BirthdayID getBirthdayID() {
        return birthdayID;
    }

    public AmountOfGuests getAmountOfGuests() {
        return amountOfGuests;
    }

}
