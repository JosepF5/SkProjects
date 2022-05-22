package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.CustomizedServiceID;
import com.sofkaU.demoDDD.customizedservice.values.Years;

public class UpdateAnniversaryYears extends Command {
    private final CustomizedServiceID customizedServiceID;
    private final Years years;

    public UpdateAnniversaryYears(CustomizedServiceID customizedServiceID, Years years) {
        this.customizedServiceID = customizedServiceID;
        this.years = years;
    }

    public CustomizedServiceID getCustomizedServiceID() {
        return customizedServiceID;
    }

    public Years getYears() {
        return years;
    }
}
