package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.*;

public class AnniversaryAmountOfGuestsChanged extends DomainEvent {
    private final AnniversaryID anniversaryID;
    private final AmountOfGuests amountOfGuests;

    public AnniversaryAmountOfGuestsChanged(AnniversaryID anniversaryID, AmountOfGuests amountOfGuests) {
        super("joseppalomino.food.drinkadded");
        this.anniversaryID = anniversaryID;
        this.amountOfGuests = amountOfGuests;
    }

    public AnniversaryID getAnniversaryID() {
        return anniversaryID;
    }

    public AmountOfGuests getAmountOfGuests() {
        return amountOfGuests;
    }

}
