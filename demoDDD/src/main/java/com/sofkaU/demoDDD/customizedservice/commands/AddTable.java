package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;
import com.sofkaU.demoDDD.customizedservice.values.ExtraDecoration;
import com.sofkaU.demoDDD.customizedservice.values.HolidayID;

public class AddTable extends Command {
    private final HolidayID tableID;
    private final ExtraDecoration location;
    private final AmountOfGuests amountOfChairs;

    public AddTable(HolidayID tableID, ExtraDecoration location, AmountOfGuests amountOfChairs) {
        this.tableID = tableID;
        this.location = location;
        this.amountOfChairs = amountOfChairs;
    }

    public HolidayID getTableID() {
        return tableID;
    }

    public ExtraDecoration getLocation() {
        return location;
    }

    public AmountOfGuests getAmountOfChairs() {
        return amountOfChairs;
    }
}
