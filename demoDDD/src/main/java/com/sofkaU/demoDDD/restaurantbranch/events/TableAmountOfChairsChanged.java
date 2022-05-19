package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.Location;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;
import com.sofkaU.demoDDD.restaurantbranch.values.AmountOfChairs;

public class TableAmountOfChairsChanged extends DomainEvent {
    private final AmountOfChairs amountOfChairs;

    public TableAmountOfChairsChanged(AmountOfChairs amountOfChairs) {
        super("joseppalomino.food.entryadded");
        this.amountOfChairs = amountOfChairs;
    }

    public AmountOfChairs getAmountOfChairs() {
        return amountOfChairs;
    }

}
