package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.*;

public class AddBirthday extends Command {
    private final CustomizedServiceID customizedServiceID;
    private final BirthdayID birthdayID;
    private final AmountOfGuests amountOfGuests;
    private final DateBirth dateBirth;

    public AddBirthday(CustomizedServiceID customizedServiceID, BirthdayID birthdayID, AmountOfGuests amountOfGuests, DateBirth dateBirth) {
        this.customizedServiceID = customizedServiceID;
        this.birthdayID = birthdayID;
        this.amountOfGuests = amountOfGuests;
        this.dateBirth = dateBirth;
    }

    public CustomizedServiceID getCustomizedServiceID() {
        return customizedServiceID;
    }

    public BirthdayID getBirthdayID() {
        return birthdayID;
    }

    public AmountOfGuests getAmountOfGuests() {
        return amountOfGuests;
    }

    public DateBirth getDateBirth() {
        return dateBirth;
    }
}
