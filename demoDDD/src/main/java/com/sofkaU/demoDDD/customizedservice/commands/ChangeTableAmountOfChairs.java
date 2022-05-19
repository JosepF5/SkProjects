package com.sofkaU.demoDDD.customizedservice.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.customizedservice.values.AmountOfGuests;

public class ChangeTableAmountOfChairs extends Command {
    private final AmountOfGuests amountOfChairs;

    public ChangeTableAmountOfChairs(AmountOfGuests amountOfChairs) {
        this.amountOfChairs = amountOfChairs;
    }

    public AmountOfGuests getAmountOfChairs() {
        return amountOfChairs;
    }
}
