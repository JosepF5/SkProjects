package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.BirthdayID;
import com.sofkaU.demoDDD.customizedservice.values.DateBirth;
import com.sofkaU.demoDDD.customizedservice.values.Name;

public class BirthdayAmountOfGuestsChanged extends DomainEvent {
    private final AmountOfGuests amountOfGuests;

    public BirthdayAmountOfGuestsChanged(AmountOfGuests amountOfGuests) {
        super("joseppalomino.food.dishadded");
        this.amountOfGuests = amountOfGuests;
    }

    public AmountOfGuests getAmountOfGuests() {
        return amountOfGuests;
    }

}
