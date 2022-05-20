package com.sofkaU.demoDDD.customizedservice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.Years;
import com.sofkaU.demoDDD.customizedservice.values.AnniversaryID;
import com.sofkaU.demoDDD.customizedservice.values.Name;

public class AnniversaryAdded extends DomainEvent {
    private final AnniversaryID anniversaryID;
    private final AmountOfGuests amountOfGuests;
    private final Years years;

    public AnniversaryAdded(AnniversaryID anniversaryID, AmountOfGuests amountOfGuests, Years years) {
        super("joseppalomino.food.drinkadded");
        this.anniversaryID = anniversaryID;
        this.amountOfGuests = amountOfGuests;
        this.years = years;
    }

    public AnniversaryID getAnniversaryID() {
        return anniversaryID;
    }

    public AmountOfGuests getAmountOfGuests() {
        return amountOfGuests;
    }

    public Years getYears() {
        return years;
    }
}
