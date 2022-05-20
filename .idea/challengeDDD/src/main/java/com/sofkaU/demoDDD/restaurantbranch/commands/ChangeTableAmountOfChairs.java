package com.sofkaU.demoDDD.restaurantbranch.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;
import com.sofkaU.demoDDD.restaurantbranch.values.Name;
import com.sofkaU.demoDDD.restaurantbranch.values.AmountOfChairs;

public class ChangeTableAmountOfChairs extends Command {
    private final AmountOfChairs amountOfChairs;

    public ChangeTableAmountOfChairs(AmountOfChairs amountOfChairs) {
        this.amountOfChairs = amountOfChairs;
    }

    public AmountOfChairs getAmountOfChairs() {
        return amountOfChairs;
    }
}
