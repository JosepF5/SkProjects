package com.sofkaU.demoDDD.customizedservice;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.BirthdayID;
import com.sofkaU.demoDDD.customizedservice.values.DateBirth;

import java.util.Objects;

public class Birthday extends Entity<BirthdayID> {
    private DateBirth dateBirth;
    private AmountOfGuests amountOfGuests;

    public Birthday(BirthdayID entityId, DateBirth dateBirth, AmountOfGuests amountOfGuests) {
        super(entityId);
        this.dateBirth=dateBirth;
        this.amountOfGuests=amountOfGuests;
    }

    public void updateDateBirth(DateBirth dateBirth){
        this.dateBirth= Objects.requireNonNull(dateBirth);
    }

    public void updateAmountOfGuests(AmountOfGuests amountOfGuests){
        this.amountOfGuests= Objects.requireNonNull(amountOfGuests);
    }

    public DateBirth dateBirth() {
        return dateBirth;
    }

    public AmountOfGuests amountOfGuests() {
        return amountOfGuests;
    }
}
