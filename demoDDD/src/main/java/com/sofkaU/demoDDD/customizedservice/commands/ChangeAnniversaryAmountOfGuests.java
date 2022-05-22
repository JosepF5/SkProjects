package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.CustomizedServiceID;

public class ChangeAnniversaryAmountOfGuests extends Command {
    private final CustomizedServiceID customizedServiceID;
    private final AmountOfGuests amountOfGuests;

    public ChangeAnniversaryAmountOfGuests(CustomizedServiceID customizedServiceID, AmountOfGuests amountOfGuests) {
        this.customizedServiceID = customizedServiceID;
        this.amountOfGuests = amountOfGuests;
    }

    public CustomizedServiceID getCustomizedServiceID() {
        return customizedServiceID;
    }

    public AmountOfGuests getAmountOfGuests() {
        return amountOfGuests;
    }
}
