package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.CustomizedServiceID;
import com.sofkaU.demoDDD.customizedservice.values.ExtraDecoration;
import com.sofkaU.demoDDD.customizedservice.values.HolidayID;

public class AddHoliday extends Command {
    private final CustomizedServiceID customizedServiceID;
    private final HolidayID holidayID;
    private final ExtraDecoration location;
    private final AmountOfGuests amountOfChairs;

    public AddHoliday(CustomizedServiceID customizedServiceID, HolidayID holidayID, ExtraDecoration location, AmountOfGuests amountOfChairs) {
        this.customizedServiceID = customizedServiceID;
        this.holidayID = holidayID;
        this.location = location;
        this.amountOfChairs = amountOfChairs;
    }

    public CustomizedServiceID getCustomizedServiceID() {
        return customizedServiceID;
    }

    public HolidayID getHolidayID() {
        return holidayID;
    }

    public ExtraDecoration getLocation() {
        return location;
    }

    public AmountOfGuests getAmountOfChairs() {
        return amountOfChairs;
    }
}
