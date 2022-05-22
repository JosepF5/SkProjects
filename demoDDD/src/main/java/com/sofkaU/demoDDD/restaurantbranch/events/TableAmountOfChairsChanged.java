package com.sofkaU.demoDDD.restaurantbranch.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.restaurantbranch.values.TableID;
import com.sofkaU.demoDDD.restaurantbranch.values.AmountOfChairs;

public class TableAmountOfChairsChanged extends DomainEvent {
    private final TableID tableID;
    private final AmountOfChairs amountOfChairs;

    public TableAmountOfChairsChanged(TableID tableID, AmountOfChairs amountOfChairs) {
        super("joseppalomino.food.entryadded");
        this.tableID = tableID;
        this.amountOfChairs = amountOfChairs;
    }

    public TableID getTableID() {
        return tableID;
    }

    public AmountOfChairs getAmountOfChairs() {
        return amountOfChairs;
    }

}
