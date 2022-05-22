package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.CustomizedServiceID;
import com.sofkaU.demoDDD.customizedservice.values.Name;

public class UpdateHolidayName extends Command {
    private final CustomizedServiceID customizedServiceID;
    private final Name name;

    public UpdateHolidayName(CustomizedServiceID customizedServiceID, Name name) {
        this.customizedServiceID = customizedServiceID;
        this.name = name;
    }

    public CustomizedServiceID getCustomizedServiceID() {
        return customizedServiceID;
    }

    public Name getName() {
        return name;
    }
}
