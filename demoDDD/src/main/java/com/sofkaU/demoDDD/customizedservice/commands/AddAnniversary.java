package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.*;

public class AddAnniversary extends Command {
    private final CustomizedServiceID customizedServiceID;
    private final AnniversaryID anniversaryID;
    private final AmountOfGuests amountOfGuests;
    private final Years years;

    public AddAnniversary(CustomizedServiceID customizedServiceID, AnniversaryID anniversaryID, AmountOfGuests amountOfGuests, Years years) {
        this.customizedServiceID = customizedServiceID;
        this.anniversaryID = anniversaryID;
        this.amountOfGuests = amountOfGuests;
        this.years = years;
    }

    public CustomizedServiceID getCustomizedServiceID() {
        return customizedServiceID;
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
