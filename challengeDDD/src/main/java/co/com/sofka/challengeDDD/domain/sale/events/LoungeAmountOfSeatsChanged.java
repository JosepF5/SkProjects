package co.com.sofka.challengeDDD.domain.sale.events;

import co.com.sofka.challengeDDD.domain.sale.values.AmountOfSeats;
import co.com.sofka.challengeDDD.domain.sale.values.Effects;
import co.com.sofka.challengeDDD.domain.sale.values.LoungeID;
import co.com.sofka.domain.generic.DomainEvent;

public class LoungeAmountOfSeatsChanged extends DomainEvent {
    private final LoungeID loungeID;
    private final AmountOfSeats amountOfSeats;

    public LoungeAmountOfSeatsChanged(LoungeID loungeID, AmountOfSeats amountOfSeats) {
        super("com.sale.loungeamountofseatschanged");
        this.loungeID = loungeID;
        this.amountOfSeats = amountOfSeats;
    }

    public LoungeID getLoungeID() {
        return loungeID;
    }

    public AmountOfSeats getAmountOfSeats() {
        return amountOfSeats;
    }

}
