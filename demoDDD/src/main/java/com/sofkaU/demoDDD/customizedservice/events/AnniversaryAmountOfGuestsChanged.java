package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.*;

public class AnniversaryAmountOfGuestsChanged extends DomainEvent {
    private final AmountOfGuests amountOfGuests;

    public AnniversaryAmountOfGuestsChanged(AmountOfGuests amountOfGuests) {
        super("joseppalomino.food.drinkadded");
        this.amountOfGuests = amountOfGuests;
    }

    public AmountOfGuests getAmountOfGuests() {
        return amountOfGuests;
    }

}
