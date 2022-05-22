package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.CustomizedServiceID;
import com.sofkaU.demoDDD.customizedservice.values.DateBirth;

public class UpdateBirthdayDateBirth extends Command {
    private final CustomizedServiceID customizedServiceID;
    private final DateBirth dateBirth;

    public UpdateBirthdayDateBirth(CustomizedServiceID customizedServiceID, DateBirth dateBirth) {
        this.customizedServiceID = customizedServiceID;
        this.dateBirth = dateBirth;
    }

    public CustomizedServiceID getCustomizedServiceID() {
        return customizedServiceID;
    }

    public DateBirth getDateBirth() {
        return dateBirth;
    }
}
