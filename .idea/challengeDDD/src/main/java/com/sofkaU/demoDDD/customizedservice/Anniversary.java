package com.sofkaU.demoDDD.customizedservice;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.AnniversaryID;
import com.sofkaU.demoDDD.customizedservice.values.Years;

import java.util.Objects;

public class Anniversary extends Entity<AnniversaryID> {
    private Years years;
    private AmountOfGuests amountOfGuests;

    public Anniversary(AnniversaryID entityId, Years years, AmountOfGuests amountOfGuests) {
        super(entityId);
        this.years=years;
        this.amountOfGuests=amountOfGuests;
    }

    public void updateYears(Years years){
        this.years= Objects.requireNonNull(years);
    }

    public void updateAmountOfGuests(AmountOfGuests amountOfGuests){
        this.amountOfGuests= Objects.requireNonNull(amountOfGuests);
    }

    public Years getYears() {
        return years;
    }

    public AmountOfGuests getAmountOfGuests() {
        return amountOfGuests;
    }
}
